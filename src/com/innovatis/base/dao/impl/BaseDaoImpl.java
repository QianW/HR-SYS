package com.innovatis.base.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.util.HibernateUtil;
import com.innovatis.util.PageNoUtil;

@Component("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void save(T instances) {
		hibernateTemplate.save(instances);
	}

	@Override
	public void delete(T instances) {
		hibernateTemplate.delete(instances);
	}

	@Override
	public void update(T instances) {
		hibernateTemplate.update(instances);
	}

	@Override
	public Object findById(Class clazz, int id) {
		Object o = hibernateTemplate.get(clazz, id);
		return o;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByHql(String hql) {
		return null;
	}

	@Override
	public List<T> findByProperty( String propertyName,Object value) {
		return null;
	}

    

	@Override
	public List<T> findByPage(final int pageSize,final int pageNow,final String hql) {
		List<T> results = getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public List<T> doInHibernate(Session session){
						List<T> listInside = (List<T>) PageNoUtil.getList(session, hql, pageSize, pageNow);
						return listInside;
					}
				});
		return results;
	}

}

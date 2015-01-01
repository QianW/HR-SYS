package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.AttrDao;
import com.innovatis.model.Attribute;

@Component("attrDao")
public class AttrDaoImpl extends BaseDaoImpl<Attribute> implements AttrDao {

	@Override
	public List<Attribute> findAll() {
		List<Attribute> lists = getHibernateTemplate().find("from Attribute");
		return lists;
	}
	
	@Override
	public List<Attribute> findByProperty(String propertyName, Object value) {
		String hql = "from Attribute a where a." +propertyName+" = '"+value+"'";
		return getHibernateTemplate().find(hql);
	}
}

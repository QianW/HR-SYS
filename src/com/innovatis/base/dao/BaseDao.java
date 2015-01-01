package com.innovatis.base.dao;

import java.util.List;

import com.innovatis.model.User;


public interface BaseDao<T> {
	
	public void save(T instances);
	
	public void delete(T instances);
	
	public void update(T instances);
	
	public Object findById(Class clazz ,int id) ;
	
	public List<T> findAll();
	
	public List<T> findByHql(String hql);
	
	public List<T> findByProperty(String propertyName, Object value);
	
	public List<T> findByPage(int pageSize,int pageNow,String hql);
}

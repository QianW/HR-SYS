package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.Attribute;

public interface AttrDao extends BaseDao<Attribute>{

	@Override
	public List<Attribute> findAll();
	
	@Override
	public List<Attribute> findByProperty(String propertyName, Object value);
}

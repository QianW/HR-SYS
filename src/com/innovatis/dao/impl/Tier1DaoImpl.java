package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.Tier1Dao;
import com.innovatis.model.Tier1;

@Component("tier1Dao")
public class Tier1DaoImpl extends BaseDaoImpl<Tier1> implements Tier1Dao {

	@Override
	public List<Tier1> findAll() {
		List<Tier1> lists = getHibernateTemplate().find("from Tier1");
		return lists;
	}
}

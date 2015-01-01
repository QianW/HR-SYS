package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.Tier3Dao;
import com.innovatis.model.Tier3;

@Component("tier3Dao")
public class Tier3DaoImpl extends BaseDaoImpl<Tier3> implements Tier3Dao {

	@Override
	public List<Tier3> findAll() {
		List<Tier3> lists = getHibernateTemplate().find("from Tier3");
		return lists;
	}
}

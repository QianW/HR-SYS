package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.Tier2Dao;
import com.innovatis.model.Tier2;

@Component("tier2Dao")
public class Tier2DaoImpl extends BaseDaoImpl<Tier2> implements Tier2Dao {

	@Override
	public List<Tier2> findAll() {
		List<Tier2> lists = getHibernateTemplate().find("from Tier2");
		return lists;
	}
}

package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.PosCatDao;
import com.innovatis.model.PositionCategory;

@Component("posCatDao")
public class PosCatDaoImpl extends BaseDaoImpl<PositionCategory> implements PosCatDao {

	@Override
	public List<PositionCategory> findAll() {
		List<PositionCategory> lists = getHibernateTemplate().find("from PositionCategory");
		return lists;
	}
}

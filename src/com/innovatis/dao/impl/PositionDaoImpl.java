package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.PositionDao;
import com.innovatis.model.Position;

@Component("positionDao")
public class PositionDaoImpl extends BaseDaoImpl<Position> implements PositionDao {

	@Override
	public List<Position> findAll() {
		List<Position> lists = getHibernateTemplate().find("from Position");
		return lists;
	}
}

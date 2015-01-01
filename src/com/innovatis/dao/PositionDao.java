package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.Position;

public interface PositionDao extends BaseDao<Position>{

	@Override
	public List<Position> findAll();
}

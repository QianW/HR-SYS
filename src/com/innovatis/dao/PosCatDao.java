package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.PositionCategory;

public interface PosCatDao extends BaseDao<PositionCategory>{

	@Override
	public List<PositionCategory> findAll();
}

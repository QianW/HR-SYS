package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.Tier3;

public interface Tier3Dao extends BaseDao<Tier3>{

	@Override
	public List<Tier3> findAll();
}

package com.innovatis.dao;

import java.util.List;

import com.innovatis.base.dao.BaseDao;
import com.innovatis.model.Hr;

public interface HrDao extends BaseDao<Hr>{

	@Override
	public List<Hr> findAll();
}

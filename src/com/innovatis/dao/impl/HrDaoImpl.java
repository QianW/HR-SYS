package com.innovatis.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.innovatis.base.dao.impl.BaseDaoImpl;
import com.innovatis.dao.HrDao;
import com.innovatis.model.Hr;

@Component("hrDao")
public class HrDaoImpl extends BaseDaoImpl<Hr> implements HrDao {

	@Override
	public List<Hr> findAll() {
		List<Hr> lists = getHibernateTemplate().find("from Hr");
		return lists;
	}
}

package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.innovatis.dao.Tier1Dao;
import com.innovatis.model.Tier1;
import com.innovatis.service.Tier1Service;

@Component("tier1Service")
public class Tier1ServiceImpl implements Tier1Service {

	private Tier1Dao tier1Dao;
	
	public Tier1Dao getTier1Dao() {
		return tier1Dao;
	}

	@Resource
	public void setTier1Dao(Tier1Dao tier1Dao) {
		this.tier1Dao = tier1Dao;
	}

	@Override
	public void addT1(Tier1 tier1) {
		tier1Dao.save(tier1);
	}

	@Override
	public boolean deleteT1(Tier1 tier1) {
		if(tier1 != null) {
			tier1Dao.delete(tier1);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateT1(Tier1 tier1) {
		if(tier1 != null) {
			tier1Dao.update(tier1);
			return true;
		}
		return false;
	}

	@Override
	public List<Tier1> getT1byPage(int pageSize, int pageNow,String hql) {
		List<Tier1> res = tier1Dao.findByPage(pageSize, pageNow,hql);
		return res;
	}

	@Override
	public Tier1 getT1byId(int id) {
		Tier1 t1 = new Tier1();
		t1 = (Tier1)tier1Dao.findById(Tier1.class, id);
		return t1;
	}
	
	@Override
	public List<Tier1> getAll() {
		return tier1Dao.findAll();
	}
}

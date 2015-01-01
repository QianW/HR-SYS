package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.innovatis.dao.Tier1Dao;
import com.innovatis.dao.Tier2Dao;
import com.innovatis.model.Tier1;
import com.innovatis.model.Tier2;
import com.innovatis.service.Tier2Service;

@Component("tier2Service")
public class Tier2ServiceImpl implements Tier2Service {

	private Tier2Dao tier2Dao;
	
	public Tier2Dao getTier2Dao() {
		return tier2Dao;
	}

	@Resource
	public void setTier2Dao(Tier2Dao tier2Dao) {
		this.tier2Dao = tier2Dao;
	}

	@Override
	public void addT2(Tier2 tier2) {
		tier2Dao.save(tier2);
	}

	@Override
	public boolean deleteT2(Tier2 tier2) {
		if(tier2 != null) {
			tier2Dao.delete(tier2);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateT2(Tier2 tier2) {
		if(tier2 != null) {
			tier2Dao.update(tier2);
			return true;
		}
		return false;
	}

	@Override
	public List<Tier2> getT2byPage(int pageSize, int pageNow,String hql) {
		List<Tier2> res = tier2Dao.findByPage(pageSize, pageNow,hql);
		return res;
	}

	@Override
	public Tier2 getT2byId(int id) {
		Tier2 t2 = new Tier2();
		t2 = (Tier2)tier2Dao.findById(Tier2.class, id);
		return t2;
	}
	
	@Override
	public List<Tier2> getAll() {
		return tier2Dao.findAll();
	}
}

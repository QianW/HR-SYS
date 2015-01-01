package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.innovatis.dao.Tier3Dao;
import com.innovatis.model.Tier3;
import com.innovatis.service.Tier3Service;


@Component("tier3Service")
public class Tier3ServiceImpl implements Tier3Service {

	private Tier3Dao tier3Dao;
	
	public Tier3Dao getTier3Dao() {
		return tier3Dao;
	}

	@Resource
	public void setTier3Dao(Tier3Dao tier3Dao) {
		this.tier3Dao = tier3Dao;
	}

	@Override
	public void addT3(Tier3 tier3) {
		tier3Dao.save(tier3);
	}

	@Override
	public boolean deleteT3(Tier3 tier3) {
		if(tier3 != null) {
			tier3Dao.delete(tier3);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateT3(Tier3 tier3) {
		if(tier3 != null) {
			tier3Dao.update(tier3);
			return true;
		}
		return false;
	}

	@Override
	public List<Tier3> getT3byPage(int pageSize, int pageNow,String hql) {
		List<Tier3> res = tier3Dao.findByPage(pageSize, pageNow,hql);
		return res;
	}

	@Override
	public Tier3 getT3byId(int id) {
		Tier3 t3 = new Tier3();
		t3 = (Tier3)tier3Dao.findById(Tier3.class, id);
		return t3;
	}
	
	@Override
	public List<Tier3> getAll() {
		return tier3Dao.findAll();
	}
}

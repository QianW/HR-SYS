package com.innovatis.service;

import java.util.List;

import com.innovatis.model.Tier3;


public interface Tier3Service {
	public void addT3(Tier3 tier3);
	public boolean deleteT3(Tier3 tier3);
	public boolean updateT3(Tier3 tier3);
	public List<Tier3> getT3byPage(int pageSize,int pageNow,String hql);
	public Tier3 getT3byId(int id);
	public List<Tier3> getAll();
}

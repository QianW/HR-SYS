package com.innovatis.service;

import java.util.List;

import com.innovatis.model.Tier1;

public interface Tier1Service {
	public void addT1(Tier1 tier1);
	public boolean deleteT1(Tier1 tier1);
	public boolean updateT1(Tier1 tier1);
	public List<Tier1> getT1byPage(int pageSize,int pageNow,String hql);
	public Tier1 getT1byId(int id);
	public List<Tier1> getAll();
}

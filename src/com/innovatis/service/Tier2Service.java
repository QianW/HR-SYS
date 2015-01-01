package com.innovatis.service;

import java.util.List;

import com.innovatis.model.Tier2;

public interface Tier2Service {
	public void addT2(Tier2 tier2);
	public boolean deleteT2(Tier2 tier2);
	public boolean updateT2(Tier2 tier2);
	public List<Tier2> getT2byPage(int pageSize,int pageNow,String hql);
	public Tier2 getT2byId(int id);
	public List<Tier2> getAll();
}

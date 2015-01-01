package com.innovatis.service;

import java.util.List;

import com.innovatis.model.PositionCategory;



public interface PosCatService {
	public void addPosCat(PositionCategory positionCategory);
	public boolean deletePosCat(PositionCategory positionCategory);
	public List<PositionCategory> getPosCatByPage(int pageSize,int pageNow,String hql);
	public PositionCategory getPosCatById(int id);
	public List<PositionCategory> getAll();

}

package com.innovatis.service;

import java.util.List;

import com.innovatis.model.Position;


public interface PositionService {
	public void addPosition(Position position);
	public boolean deletePosition(Position position);
	public List<Position> getPosByPage(int pageSize,int pageNow,String hql);
	public Position getPosById(int id);
	public List<Position> getAll();

}

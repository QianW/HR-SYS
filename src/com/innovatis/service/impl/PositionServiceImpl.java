package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.innovatis.dao.PositionDao;
import com.innovatis.model.Position;
import com.innovatis.service.PositionService;

@Component("positionService")
public class PositionServiceImpl implements PositionService {
	private PositionDao positionDao;
	
	public PositionDao getPositionDao() {
		return positionDao;
	}

	@Resource
	public void setPositionDao(PositionDao positionDao) {
		this.positionDao = positionDao;
	}

	@Override
	public void addPosition(Position position) {
		positionDao.save(position);
	}

	@Override
	public boolean deletePosition(Position position) {
		if(position!=null) {
			positionDao.delete(position);
			return true;
		}
		return false;
	}

	@Override
	public List<Position> getPosByPage(int pageSize, int pageNow, String hql) {
		List<Position> res = positionDao.findByPage(pageSize, pageNow,hql);
		return res;
	}

	@Override
	public Position getPosById(int id) {
		Position pos = new Position();
		pos = (Position) positionDao.findById(Position.class, id);
		return pos;
	}

	@Override
	public List<Position> getAll() {
		return positionDao.findAll();
	}

}	
package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.innovatis.dao.PosCatDao;
import com.innovatis.model.PositionCategory;
import com.innovatis.service.PosCatService;


@Component("posCatService")
public class PosCatServiceImpl implements PosCatService {
	private PosCatDao posCatDao;
	
	public PosCatDao getPosCatDao() {
		return posCatDao;
	}

	@Resource
	public void setPosCatDao(PosCatDao posCatDao) {
		this.posCatDao = posCatDao;
	}

	@Override
	public void addPosCat(PositionCategory positionCategory) {
		posCatDao.save(positionCategory);
	}


	@Override
	public List<PositionCategory> getAll() {
		return posCatDao.findAll();
	}

	@Override
	public boolean deletePosCat(PositionCategory positionCategory) {
		if(positionCategory!=null){
			posCatDao.delete(positionCategory);
			return true;
		}
		return false;
	}

	@Override
	public List<PositionCategory> getPosCatByPage(int pageSize, int pageNow,
			String hql) {
		List<PositionCategory> res = posCatDao.findByPage(pageSize, pageNow, hql);
		return res;
	}

	@Override
	public PositionCategory getPosCatById(int id) {
		PositionCategory positionCategory = (PositionCategory)posCatDao.findById(PositionCategory.class, id);
		return positionCategory;
	}

}	
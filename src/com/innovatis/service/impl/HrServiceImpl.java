package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.innovatis.dao.HrDao;
import com.innovatis.model.Hr;
import com.innovatis.service.HrService;

@Component("hrService")
public class HrServiceImpl implements HrService {
	private HrDao hrDao;
	
	public HrDao getHrDao() {
		return hrDao;
	}
	@Resource
	public void setHrDao(HrDao hrDao) {
		this.hrDao = hrDao;
	}

	@Override
	public void addHr(Hr hr) {
		hrDao.save(hr);		
	}
	
	

	@Override
	public boolean deleteHr(Hr hr) {
		if(hr != null) {
			hrDao.delete(hr);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateHr(Hr hr) {
		if(hr!=null) {
			hrDao.update(hr);
			return true;
		}
		return false;
	}

	@Override
	public List<Hr> getHrByPage(int pageSize, int pageNow, String hql) {
		return hrDao.findByPage(pageSize, pageNow, hql);
	}

	@Override
	public Hr getHrById(int id) {
		Hr hr = (Hr)hrDao.findById(Hr.class, id);
		return hr;

	}

	@Override
	public List<Hr> getAll() {
		return hrDao.findAll();
	}


}

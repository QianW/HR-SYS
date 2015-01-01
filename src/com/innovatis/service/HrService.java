package com.innovatis.service;

import java.util.List;

import com.innovatis.model.Hr;





public interface HrService {
	public void addHr(Hr hr);
	public boolean deleteHr(Hr hr);
	public boolean updateHr(Hr hr);
	public List<Hr> getHrByPage(int pageSize,int pageNow,String hql);
	public Hr getHrById(int id);
	public List<Hr> getAll();
}

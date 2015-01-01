package com.innovatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.innovatis.dao.AttrDao;
import com.innovatis.model.Attribute;
import com.innovatis.service.AttrService;



@Component("attrService")
public class AttrServiceImpl implements AttrService {
	private AttrDao attrDao;

	public AttrDao getAttrDao() {
		return attrDao;
	}
	@Resource
	public void setAttrDao(AttrDao attrDao) {
		this.attrDao = attrDao;
	}
	@Override
	public void addAttr(Attribute attribute) {
		attrDao.save(attribute);
	}
	@Override
	public boolean deleteAttr(Attribute attribute) {
		if (attribute != null) {
			attrDao.delete(attribute);
			return true;
		}
		return false;
	}
	@Override
	public List<Attribute> getAttrByPage(int pageSize, int pageNow, String hql) {
		List<Attribute> res = attrDao.findByPage(pageSize, pageNow, hql);
		return res;
	}
	@Override
	public Attribute getAttrById(int id) {
		Attribute attribute = (Attribute)attrDao.findById(Attribute.class, id);
		return attribute;
	}
	@Override
	public List<Attribute> getAll() {
		return attrDao.findAll();
	}
	@Override
	public List<Attribute> getAttrByProperty(Object value) {
		String propertyName = "attrKind";
		return attrDao.findByProperty(propertyName, value);
	}

}	
	
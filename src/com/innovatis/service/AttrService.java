package com.innovatis.service;

import java.util.List;

import com.innovatis.model.Attribute;




public interface AttrService {
	public void addAttr(Attribute attribute);
	public boolean deleteAttr(Attribute attribute);
	public List<Attribute> getAttrByPage(int pageSize,int pageNow,String hql);
	public Attribute getAttrById(int id);
	public List<Attribute> getAll();
	public List<Attribute> getAttrByProperty(Object value);
}

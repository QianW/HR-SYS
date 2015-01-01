package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.Attribute;
import com.innovatis.service.AttrService;


@Component("attrAction")
@Scope("prototype")
public class AttrAction {
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	
	private String hql = "from Attribute";
	private Attribute attr;
	private List<Attribute> attrlist;
	private AttrService attrService;
	
	private String attrKind;
	
	
	public int pageNowCorrect(int currentNo){
		totalRows = attrService.getAll().size();
		totalPages = totalRows % pageSize == 0 ? totalRows/pageSize : totalRows/pageSize+1;
		if(currentNo > totalPages) currentNo = totalPages;
		if(currentNo <= 0) currentNo = 1;
		return currentNo;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public Attribute getAttr() {
		return attr;
	}

	public void setAttr(Attribute attr) {
		this.attr = attr;
	}

	public List<Attribute> getAttrlist() {
		return attrlist;
	}

	public void setAttrlist(List<Attribute> attrlist) {
		this.attrlist = attrlist;
	}

	public AttrService getAttrService() {
		return attrService;
	}

	@Resource
	public void setAttrService(AttrService attrService) {
		this.attrService = attrService;
	}
	
	public String list(){
		pageNow = pageNowCorrect(pageNow);
		attrlist = attrService.getAttrByPage(pageSize, pageNow, hql);
		return "success";
	}
	
	public String add(){
		attr.setAttrKind(attrKind);
		attrService.addAttr(attr);
		return "success";
	}
	
	public String addInput(){
		attrlist = attrService.getAll();
		return "input";
	}
	
	public String delete(){
		attr = attrService.getAttrById(id);
		attrService.deleteAttr(attr);
		return "success";
	}

	public String getAttrKind() {
		return attrKind;
	}

	public void setAttrKind(String attrKind) {
		this.attrKind = attrKind;
	}
}

package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.PositionCategory;
import com.innovatis.service.PosCatService;

@Component("posCatAction")
@Scope("prototype")
public class PosCatAction {
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	
	private String hql = "from PositionCategory";
	private PositionCategory posCat;
	private List<PositionCategory> posCatlist;
	private PosCatService posCatService;
	
	public int pageNowCorrect(int currentNo){
		totalRows = posCatService.getAll().size();
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
	public PositionCategory getPosCat() {
		return posCat;
	}
	public void setPosCat(PositionCategory posCat) {
		this.posCat = posCat;
	}
	public List<PositionCategory> getPosCatlist() {
		return posCatlist;
	}
	public void setPosCatlist(List<PositionCategory> posCatlist) {
		this.posCatlist = posCatlist;
	}
	public PosCatService getPosCatService() {
		return posCatService;
	}
	@Resource
	public void setPosCatService(PosCatService posCatService) {
		this.posCatService = posCatService;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public String list(){
		pageNow = pageNowCorrect(pageNow);
		posCatlist = posCatService.getPosCatByPage(pageSize, pageNow, hql);
		return "success";
	}
	
	public String add(){
		posCatService.addPosCat(posCat);
		return "success";
		
	}

	public String addInput(){
		posCatlist = posCatService.getAll();
		return "input";
	}
	
	public String delete(){
		posCat = posCatService.getPosCatById(id);
		posCatService.deletePosCat(posCat);
		return "success";
	}
}

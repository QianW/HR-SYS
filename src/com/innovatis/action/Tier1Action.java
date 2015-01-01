package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.Tier1;
import com.innovatis.service.Tier1Service;
import com.opensymphony.xwork2.ActionSupport;

@Component("tier1Action")
@Scope("prototype")
public class Tier1Action extends ActionSupport{
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	
	private String hql="from Tier1";
	private Tier1 tier1;
	private List<Tier1> tier1list;
	private Tier1Service tier1Service;
	
	public int pageNowCorrect(int currentNo){
		totalRows = tier1Service.getAll().size();
		totalPages = totalRows % pageSize == 0 ? totalRows/pageSize : totalRows/pageSize+1;
		if(currentNo > totalPages) currentNo = totalPages;
		if(currentNo <= 0) currentNo = 1;
		return currentNo;
	}
	
	public List<Tier1> getTier1list() {
		return tier1list;
	}
	public void setTier1list(List<Tier1> tier1list) {
		this.tier1list = tier1list;
	}
	public Tier1Service getTier1Service() {
		return tier1Service;
	}
	@Resource
	public void setTier1Service(Tier1Service tier1Service) {
		this.tier1Service = tier1Service;
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
	public Tier1 getTier1() {
		return tier1;
	}
	public void setTier1(Tier1 tier1) {
		this.tier1 = tier1;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public String list(){
		pageNow = pageNowCorrect(pageNow);
		tier1list = tier1Service.getT1byPage(pageSize, pageNow, hql);
		return "success";
	}
	
	public String delete(){
		tier1 = tier1Service.getT1byId(id);
		tier1Service.deleteT1(tier1);
		return "success";
	}
	
	public String add(){
		tier1Service.addT1(tier1);
		return "success";
	}
	
	public String addInput(){
		tier1list = tier1Service.getAll();
		return "input";
	}
	
	public String update(){
		tier1Service.updateT1(tier1);

		return "success";
	}
	
	public String updateInput() {
		this.tier1 = tier1Service.getT1byId(id);
		return "input";
	}
}

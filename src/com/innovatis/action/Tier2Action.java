package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.Tier1;
import com.innovatis.model.Tier2;
import com.innovatis.service.Tier1Service;
import com.innovatis.service.Tier2Service;
import com.opensymphony.xwork2.ActionSupport;

@Component("tier2Action")
@Scope("prototype")
public class Tier2Action extends ActionSupport{
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	
	private String hql="from Tier2";
	private Tier2 tier2;
	private List<Tier2> tier2list;
	private Tier2Service tier2Service;
	
	private Tier1 tier1;
	private List<Tier1> tier1list;
	private Tier1Service tier1Service;
	
	public int pageNowCorrect(int currentNo){
		totalRows = tier2Service.getAll().size();
		totalPages = totalRows % pageSize == 0 ? totalRows/pageSize : totalRows/pageSize+1;
		if(currentNo > totalPages) currentNo = totalPages;
		if(currentNo <= 0) currentNo = 1;
		return currentNo;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public String list(){
		pageNow = pageNowCorrect(pageNow);
		tier2list = tier2Service.getT2byPage(pageSize, pageNow, hql);
		return "success";
	}
	

	public String delete(){
		tier2 = tier2Service.getT2byId(id);
		tier2Service.deleteT2(tier2);
		return "success";
	}
	
	public String add(){
		Tier1 t1 = tier1Service.getT1byId(id);
		tier2.setT1Id(t1.getTier1Id());
		tier2.setT1Name(t1.getTier1Name());
		tier2Service.addT2(tier2);
		return "success";
	}
	
	public String addInput(){
		tier1list = tier1Service.getAll();
		tier2list = tier2Service.getAll();
		return "input";
	}
	
	public String update(){
		tier2Service.updateT2(tier2);

		return "success";
	}
	
	public String updateInput() {
		this.tier2 = tier2Service.getT2byId(id);
		return "input";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Tier2 getTier2() {
		return tier2;
	}



	public void setTier2(Tier2 tier2) {
		this.tier2 = tier2;
	}



	public List<Tier2> getTier2list() {
		return tier2list;
	}



	public void setTier2list(List<Tier2> tier2list) {
		this.tier2list = tier2list;
	}



	public Tier2Service getTier2Service() {
		return tier2Service;
	}


	@Resource
	public void setTier2Service(Tier2Service tier2Service) {
		this.tier2Service = tier2Service;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public Tier1 getTier1() {
		return tier1;
	}

	public void setTier1(Tier1 tier1) {
		this.tier1 = tier1;
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

	
}

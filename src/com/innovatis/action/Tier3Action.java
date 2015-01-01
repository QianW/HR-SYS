package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.Tier1;
import com.innovatis.model.Tier2;
import com.innovatis.model.Tier3;
import com.innovatis.service.Tier1Service;
import com.innovatis.service.Tier2Service;
import com.innovatis.service.Tier3Service;
import com.opensymphony.xwork2.ActionSupport;

@Component("tier3Action")
@Scope("prototype")
public class Tier3Action extends ActionSupport{
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	private int id1;
	private int id2;
	
	
	private String hql="from Tier3";
	private Tier3 tier3;
	private List<Tier3> tier3list;
	private Tier3Service tier3Service;
	private String retail;
	
	private Tier1 tier1;
	private List<Tier1> tier1list;
	private Tier1Service tier1Service;
	
	private Tier2 tier2;
	private List<Tier2> tier2list;
	private Tier2Service tier2Service;
	
	
	public int pageNowCorrect(int currentNo){
		totalRows = tier3Service.getAll().size();
		totalPages = totalRows % pageSize == 0 ? totalRows/pageSize : totalRows/pageSize+1;
		if(currentNo > totalPages) currentNo = totalPages;
		if(currentNo <= 0) currentNo = 1;
		return currentNo;
	}
	
	public List<Tier3> getTier3list() {
		return tier3list;
	}
	public void setTier3list(List<Tier3> tier3list) {
		this.tier3list = tier3list;
	}
	public Tier3Service getTier3Service() {
		return tier3Service;
	}
	@Resource
	public void setTier3Service(Tier3Service tier3Service) {
		this.tier3Service = tier3Service;
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
	public Tier3 getTier3() {
		return tier3;
	}
	public void setTier3(Tier3 tier3) {
		this.tier3 = tier3;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public String list(){
		pageNow = pageNowCorrect(pageNow);
		tier3list = tier3Service.getT3byPage(pageSize, pageNow, hql);
		return "success";
	}
	
	public String delete(){
		tier3 = tier3Service.getT3byId(id);
		tier3Service.deleteT3(tier3);
		return "success";
	}
	
	public String add(){
		Tier1 t1 = tier1Service.getT1byId(id1);
		Tier2 t2 = tier2Service.getT2byId(id2);
		tier3.setT1Id(t1.getTier1Id());
		tier3.setT1Name(t1.getTier1Name());
		tier3.setT2Id(t2.getT2Id());
		tier3.setT2Name(t2.getT2Name());
		tier3.setT3Retail(retail);
		tier3Service.addT3(tier3);
		return "success";
	}
	
	public String addInput(){
		tier1list =tier1Service.getAll();
		tier2list = tier2Service.getAll();
		tier3list = tier3Service.getAll();
		return "input";
	}
	
	public String update(){
		tier3Service.updateT3(tier3);

		return "success";
	}
	
	public String updateInput() {
		this.tier3 = tier3Service.getT3byId(id);
		return "input";
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getRetail() {
		return retail;
	}

	public void setRetail(String retail) {
		this.retail = retail;
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
}

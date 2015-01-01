package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.Position;
import com.innovatis.service.PositionService;


@Component("positionAction")
@Scope("prototype")
public class PositionAction {
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	
	private String hql="from Position";
	private Position position;
	private List<Position> positionlist;
	private PositionService positionService;
	
	public int pageNowCorrect(int currentNo){
		totalRows = positionService.getAll().size();
		totalPages = totalRows % pageSize == 0 ? totalRows/pageSize : totalRows/pageSize+1;
		if(currentNo > totalPages) currentNo = totalPages;
		if(currentNo <= 0) currentNo = 1;
		return currentNo;
	}
	
	
	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	public List<Position> getPositionlist() {
		return positionlist;
	}


	public void setPositionlist(List<Position> positionlist) {
		this.positionlist = positionlist;
	}


	public PositionService getPositionService() {
		return positionService;
	}

	@Resource
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
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
	public String list(){
		pageNow = pageNowCorrect(pageNow);
		positionlist = positionService.getPosByPage(pageSize, pageNow, hql);
		return "success";
	}
	
	public String delete(){
		position = positionService.getPosById(id);
		positionService.deletePosition(position);
		return "success";
	}
	
	public String add(){
		positionService.addPosition(position);
		return "success";
	}
	
	public String addInput(){
		positionlist = positionService.getAll();
		return "input";
	}
	
}

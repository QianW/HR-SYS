package com.innovatis.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.innovatis.model.Attribute;
import com.innovatis.model.Hr;
import com.innovatis.model.Position;
import com.innovatis.model.PositionCategory;
import com.innovatis.model.Tier1;
import com.innovatis.model.Tier2;
import com.innovatis.model.Tier3;
import com.innovatis.service.AttrService;
import com.innovatis.service.HrService;
import com.innovatis.service.PosCatService;
import com.innovatis.service.PositionService;
import com.innovatis.service.Tier1Service;
import com.innovatis.service.Tier2Service;
import com.innovatis.service.Tier3Service;
import com.opensymphony.xwork2.ActionSupport;

@Component("hrAction")
@Scope("prototype")
public class HrAction extends ActionSupport{
	private int pageSize = 5;
	private int pageNow = 1;
	private int id;
	private int totalPages = 0;
	private int totalRows = 0;
	
	private String hql = "from Hr";
	private Hr hr;
	private List<Hr> hrlist;
	private HrService hrService;
	
	private int t1id;
	private Tier1 tier1;
	private List<Tier1> t1list;
	private Tier1Service tier1Service;
	
	private int t2id;
	private Tier2 tier2;
	private List<Tier2> t2list;
	private Tier2Service tier2Service;
	
	private int t3id;
	private Tier3 tier3;
	private List<Tier3> t3list;
	private Tier3Service tier3Service;

	private String posCatName;
	private PositionCategory pCategory;
	private List<PositionCategory> posCatlist;
	private PosCatService posCatService;
	
	private String posName;
	private Position position;
	private List<Position> poslist;
	private PositionService positionService;
	
	private String hrId="";
	
	private String attr1;
	private String attr1Value = "爱好";
	private String attr2;
	private String attr2Value = "性别";
	private String attr3;
	private String attr3Value = "国籍";
	private String attr4;
	private String attr4Value = "民族";
	private String attr5;
	private String attr5Value = "宗教信仰";
	private String attr6;
	private String attr6Value = "政治面貌";
	private String attr7;
	private String attr7Value = "学历";
	private String attr8;
	private String attr8Value = "教育年限";
	private String attr9;
	private String attr9Value = "专业";
	private String attr10;
	private String attr10Value = "特长";
	private Attribute attribute;
	private List<Attribute> attr1list;
	private List<Attribute> attr2list;
	private List<Attribute> attr3list;
	private List<Attribute> attr4list;
	private List<Attribute> attr5list;
	private List<Attribute> attr6list;
	private List<Attribute> attr7list;
	private List<Attribute> attr8list;
	private List<Attribute> attr9list;
	private List<Attribute> attr10list;
	private AttrService attrService;
	
	public int pageNowCorrect(int currentNo){
		totalRows = hrService.getAll().size();
		totalPages = totalRows % pageSize == 0 ? totalRows/pageSize : totalRows/pageSize+1;
		if(currentNo > totalPages) currentNo = totalPages;
		if(currentNo <= 0) currentNo = 1;
		return currentNo;
	}

	public String createHrId(int t1id,int t2id,int t3id){
		int randomNum = 1000 + (int)(Math.random()*8999);
		hrId = "QW"+t1id+t2id+t3id+randomNum;
		return hrId;
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

	public Hr getHr() {
		return hr;
	}

	public void setHr(Hr hr) {
		this.hr = hr;
	}

	public List<Hr> getHrlist() {
		return hrlist;
	}

	public void setHrlist(List<Hr> hrlist) {
		this.hrlist = hrlist;
	}

	public HrService getHrService() {
		return hrService;
	}

	@Resource
	public void setHrService(HrService hrService) {
		this.hrService = hrService;
	}
	
	public int getT1id() {
		return t1id;
	}

	public void setT1id(int t1id) {
		this.t1id = t1id;
	}

	public Tier1 getTier1() {
		return tier1;
	}

	public void setTier1(Tier1 tier1) {
		this.tier1 = tier1;
	}

	public List<Tier1> getT1list() {
		return t1list;
	}

	public void setT1list(List<Tier1> t1list) {
		this.t1list = t1list;
	}

	public Tier1Service getTier1Service() {
		return tier1Service;
	}

	@Resource
	public void setTier1Service(Tier1Service tier1Service) {
		this.tier1Service = tier1Service;
	}

	public int getT2id() {
		return t2id;
	}

	public void setT2id(int t2id) {
		this.t2id = t2id;
	}

	public Tier2 getTier2() {
		return tier2;
	}

	public void setTier2(Tier2 tier2) {
		this.tier2 = tier2;
	}

	public List<Tier2> getT2list() {
		return t2list;
	}

	public void setT2list(List<Tier2> t2list) {
		this.t2list = t2list;
	}

	public Tier2Service getTier2Service() {
		return tier2Service;
	}

	@Resource
	public void setTier2Service(Tier2Service tier2Service) {
		this.tier2Service = tier2Service;
	}

	public int getT3id() {
		return t3id;
	}

	public void setT3id(int t3id) {
		this.t3id = t3id;
	}

	public Tier3 getTier3() {
		return tier3;
	}

	public void setTier3(Tier3 tier3) {
		this.tier3 = tier3;
	}

	public List<Tier3> getT3list() {
		return t3list;
	}

	public void setT3list(List<Tier3> t3list) {
		this.t3list = t3list;
	}

	public Tier3Service getTier3Service() {
		return tier3Service;
	}

	@Resource
	public void setTier3Service(Tier3Service tier3Service) {
		this.tier3Service = tier3Service;
	}

	public String getPosCatName() {
		return posCatName;
	}

	public void setPosCatName(String posCatName) {
		this.posCatName = posCatName;
	}

	public PositionCategory getpCategory() {
		return pCategory;
	}

	public void setpCategory(PositionCategory pCategory) {
		this.pCategory = pCategory;
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

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<Position> getPoslist() {
		return poslist;
	}

	public void setPoslist(List<Position> poslist) {
		this.poslist = poslist;
	}

	public PositionService getPositionService() {
		return positionService;
	}

	@Resource
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}

	public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	public String getAttr3() {
		return attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

	public String getAttr4() {
		return attr4;
	}

	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}

	public String getAttr5() {
		return attr5;
	}

	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}

	public String getAttr6() {
		return attr6;
	}

	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}

	public String getAttr7() {
		return attr7;
	}

	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}

	public String getAttr8() {
		return attr8;
	}

	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}

	public String getAttr9() {
		return attr9;
	}

	public void setAttr9(String attr9) {
		this.attr9 = attr9;
	}

	public String getAttr10() {
		return attr10;
	}

	public void setAttr10(String attr10) {
		this.attr10 = attr10;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public List<Attribute> getAttr1list() {
		return attr1list;
	}

	public void setAttr1list(List<Attribute> attr1list) {
		this.attr1list = attr1list;
	}

	public List<Attribute> getAttr2list() {
		return attr2list;
	}

	public void setAttr2list(List<Attribute> attr2list) {
		this.attr2list = attr2list;
	}

	public List<Attribute> getAttr3list() {
		return attr3list;
	}

	public void setAttr3list(List<Attribute> attr3list) {
		this.attr3list = attr3list;
	}

	public List<Attribute> getAttr4list() {
		return attr4list;
	}

	public void setAttr4list(List<Attribute> attr4list) {
		this.attr4list = attr4list;
	}

	public List<Attribute> getAttr5list() {
		return attr5list;
	}

	public void setAttr5list(List<Attribute> attr5list) {
		this.attr5list = attr5list;
	}

	public List<Attribute> getAttr6list() {
		return attr6list;
	}

	public void setAttr6list(List<Attribute> attr6list) {
		this.attr6list = attr6list;
	}

	public List<Attribute> getAttr7list() {
		return attr7list;
	}

	public void setAttr7list(List<Attribute> attr7list) {
		this.attr7list = attr7list;
	}

	public List<Attribute> getAttr8list() {
		return attr8list;
	}

	public void setAttr8list(List<Attribute> attr8list) {
		this.attr8list = attr8list;
	}

	public List<Attribute> getAttr9list() {
		return attr9list;
	}

	public void setAttr9list(List<Attribute> attr9list) {
		this.attr9list = attr9list;
	}

	public List<Attribute> getAttr10list() {
		return attr10list;
	}

	public void setAttr10list(List<Attribute> attr10list) {
		this.attr10list = attr10list;
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
		hrlist = hrService.getHrByPage(pageSize, pageNow, hql);
		return "success";
	}
	
	public String add(){
		Tier1 t1 = tier1Service.getT1byId(t1id);
		Tier2 t2 = tier2Service.getT2byId(t2id);
		Tier3 t3 = tier3Service.getT3byId(t3id);
		hrId = createHrId(t1id, t2id, t3id);
		hr.setHrId(hrId);
		hr.setPosCatName(posCatName);
		hr.setPosName(posName);
		hr.setHobby(attr1);
		hr.setSex(attr2);
		hr.setNationality(attr3);
		hr.setRace(attr4);
		hr.setReligion(attr5);
		hr.setParty(attr6);
		hr.setEduDegree(attr7);
		hr.setEduYears(attr8);
		hr.setEduMajor(attr9);
		hr.setSpeciality(attr10);
		hr.setT1Id(t1.getTier1Id());
		hr.setT1Name(t1.getTier1Name());
		hr.setT2Id(t2.getT2Id());
		hr.setT2Name(t2.getT2Name());
		hr.setT3Id(t3.getT3Id());
		hr.setT3Name(t3.getT3Name());
		hrService.addHr(hr);
		return "success";
	}
	
	public String addInput(){
		t1list = tier1Service.getAll();
		t2list = tier2Service.getAll();
		t3list = tier3Service.getAll();
		posCatlist = posCatService.getAll();
		poslist = positionService.getAll();
		attr1list = attrService.getAttrByProperty(attr1Value);
		attr2list = attrService.getAttrByProperty(attr2Value);
		attr3list = attrService.getAttrByProperty(attr3Value);
		attr4list = attrService.getAttrByProperty(attr4Value);
		attr5list = attrService.getAttrByProperty(attr5Value);
		attr6list = attrService.getAttrByProperty(attr6Value);
		attr7list = attrService.getAttrByProperty(attr7Value);
		attr8list = attrService.getAttrByProperty(attr8Value);
		attr9list = attrService.getAttrByProperty(attr9Value);
		attr10list = attrService.getAttrByProperty(attr10Value);
		return "input";
	}
	
	public String update(){
		hrService.updateHr(hr);
		return "success";
	}
	
	public String updateInput(){
		hr = hrService.getHrById(id);
		return "input";
	}
	
	public String delete(){
		return "success";
	}
}

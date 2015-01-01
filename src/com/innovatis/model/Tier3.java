package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HR_TIER3")
public class Tier3 {
	private int id;
	private String t1Id;
	private String t1Name;
	private String t2Id;
	private String t2Name;
	private String t3Id;
	private String t3Name;
	private String t3SaleId;
	private String t3Retail;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen_seq")
	@SequenceGenerator(name="gen_seq",sequenceName="hr_tier3_seq",allocationSize=1)
	@Column(name="FTK_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="FIRST_KIND_ID")
	public String getT1Id() {
		return t1Id;
	}
	public void setT1Id(String t1Id) {
		this.t1Id = t1Id;
	}
	@Column(name="FIRST_KIND_NAME")
	public String getT1Name() {
		return t1Name;
	}
	public void setT1Name(String t1Name) {
		this.t1Name = t1Name;
	}
	@Column(name="SECOND_KIND_ID")
	public String getT2Id() {
		return t2Id;
	}
	public void setT2Id(String t2Id) {
		this.t2Id = t2Id;
	}
	@Column(name="SECOND_KIND_NAME")
	public String getT2Name() {
		return t2Name;
	}
	public void setT2Name(String t2Name) {
		this.t2Name = t2Name;
	}
	@Column(name="THIRD_KIND_ID")
	public String getT3Id() {
		return t3Id;
	}
	public void setT3Id(String t3Id) {
		this.t3Id = t3Id;
	}
	@Column(name="THIRD_KIND_NAME")
	public String getT3Name() {
		return t3Name;
	}
	public void setT3Name(String t3Name) {
		this.t3Name = t3Name;
	}
	@Column(name="THIRD_KIND_SALE_ID")
	public String getT3SaleId() {
		return t3SaleId;
	}
	public void setT3SaleId(String t3SaleId) {
		this.t3SaleId = t3SaleId;
	}
	@Column(name="THIRD_KIND_IS_RETAIL")
	public String getT3Retail() {
		return t3Retail;
	}
	public void setT3Retail(String t3Retail) {
		this.t3Retail = t3Retail;
	}
}

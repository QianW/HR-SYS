package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="HR_TIER2")
public class Tier2 {
	private int id;
	private String t1Id;
	private String t1Name;
	private String t2Id;
	private String t2Name;
	private String t2SalaryId;
	private String t2SaleId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen_seq")
	@SequenceGenerator(name="gen_seq",sequenceName="hr_tier2_seq",allocationSize=1)
	@Column(name="FSK_ID")
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
	@Column(name="SECOND_SALARY_ID")
	public String getT2SalaryId() {
		return t2SalaryId;
	}
	public void setT2SalaryId(String t2SalaryId) {
		this.t2SalaryId = t2SalaryId;
	}
	@Column(name="SECOND_SALE_ID")
	public String getT2SaleId() {
		return t2SaleId;
	}
	public void setT2SaleId(String t2SaleId) {
		this.t2SaleId = t2SaleId;
	}
	
}

package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HR_TIER1")
public class Tier1 {
	private int id;
	private String tier1Id;
	private String tier1Name;
	private String tier1SalaryId;
	private String tier1SaleId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_gen")
	@SequenceGenerator(name="seq_gen",sequenceName="hr_tier1_seq",allocationSize=1)
	@Column(name="FFK_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="FIRST_KIND_ID")
	public String getTier1Id() {
		return tier1Id;
	}
	public void setTier1Id(String tier1Id) {
		this.tier1Id = tier1Id;
	}
	
	@Column(name="FIRST_KIND_NAME")
	public String getTier1Name() {
		return tier1Name;
	}
	public void setTier1Name(String tier1Name) {
		this.tier1Name = tier1Name;
	}
	
	@Column(name="FIRST_KIND_SALARY_ID")
	public String getTier1SalaryId() {
		return tier1SalaryId;
	}
	public void setTier1SalaryId(String tier1SalaryId) {
		this.tier1SalaryId = tier1SalaryId;
	}
	
	@Column(name="FIRST_KIND_SALE_ID")
	public String getTier1SaleId() {
		return tier1SaleId;
	}
	public void setTier1SaleId(String tier1SaleId) {
		this.tier1SaleId = tier1SaleId;
	}
	
	

	
	
	
	
	
}

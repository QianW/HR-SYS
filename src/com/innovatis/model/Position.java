package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HR_POSITION")
public class Position {
	private int id;
	private String mkId;
	private String mkName;
	private String mId;
	private String mName;
	private int testAmount;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen_seq")
	@SequenceGenerator(name="gen_seq",sequenceName="hr_position_seq",allocationSize=1)
	@Column(name="MAK_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="MAJOR_KIND_ID")
	public String getMkId() {
		return mkId;
	}
	public void setMkId(String mkId) {
		this.mkId = mkId;
	}
	@Column(name="MAJOR_KIND_NAME")
	public String getMkName() {
		return mkName;
	}
	public void setMkName(String mkName) {
		this.mkName = mkName;
	}
	@Column(name="MAJOR_ID")
	public String getMId() {
		return mId;
	}
	public void setMId(String mId) {
		this.mId = mId;
	}
	@Column(name="MAJOR_NAME")
	public String getMName() {
		return mName;
	}
	public void setMName(String mName) {
		this.mName = mName;
	}
	@Column(name="TEST_AMOUNT")
	public int getTestAmount() {
		return testAmount;
	}
	public void setTestAmount(int testAmount) {
		this.testAmount = testAmount;
	}
}

package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HR_POSITION_CATEGORY")
public class PositionCategory {
	private int id;
	private String majorId;
	private String majorName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen_seq")
	@SequenceGenerator(name="gen_seq",sequenceName="hr_poscat_seq",allocationSize=1)
	@Column(name="MFK_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="MAJOR_KIND_ID")
	public String getMajorId() {
		return majorId;
	}
	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}
	@Column(name="MAJOR_KIND_NAME")
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
}

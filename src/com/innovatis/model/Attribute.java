package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HR_ATTRIBUTE")
public class Attribute {
	private int id;
	private String attrKind;
	private String attrName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen_seq")
	@SequenceGenerator(name="gen_seq",sequenceName="hr_attr_seq",allocationSize=1)
	@Column(name="PBC_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="ATTRIBUTE_KIND")
	public String getAttrKind() {
		return attrKind;
	}
	public void setAttrKind(String attrKind) {
		this.attrKind = attrKind;
	}
	@Column(name="ATTRIBUTE_NAME")
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
}

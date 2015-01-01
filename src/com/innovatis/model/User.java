package com.innovatis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HR_USER")
public class User {
	private int id;
	private String name;
	private String trueName;
	private String password;
	
	@Id
	@GeneratedValue(
	    strategy=GenerationType.SEQUENCE, 
	    generator="SEQ_GEN")
	@SequenceGenerator(
	    name="SEQ_GEN",
	    sequenceName="hr_user_seq",
	    allocationSize=1
	)
	@Column(name="U_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="U_NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="U_TRUE_NAME")
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	
	@Column(name="U_PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

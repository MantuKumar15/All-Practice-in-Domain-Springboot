package com.table.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;
@Component 
@Entity
public class Details {
	@Id
private int pro_id;
	private String pro_name;
	@OneToOne(mappedBy = "dt")
	private User us;
public User getUs() {
		return us;
	}
	public void setUs(User us) {
		this.us = us;
	}
public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

}

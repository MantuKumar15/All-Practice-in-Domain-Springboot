package com.table.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;
@Component 
@Entity
public class User {
	@Id
private int lid;
private String lname;
private String company;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="pro_id")
private Details dt;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Details getDt() {
	return dt;
}
public void setDt(Details dt) {
	this.dt = dt;
}
}

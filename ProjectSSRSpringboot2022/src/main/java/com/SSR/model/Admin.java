package com.SSR.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin_register")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String middle;
	private String lname;
	private String username;
	private String email;
	private String dob;
	private String male;
	private String female;
	private String country;
	private String state;
	private String address;
	private int phone;
	private String password;
	private String cpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getFemale() {
		return female;
	}
	public void setFemale(String female) {
		this.female = female;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, String fname, String middle, String lname, String username, String email, String dob,
			String male, String female, String country, String state, String address, int phone, String password,
			String cpassword) {
		super();
		this.id = id;
		this.fname = fname;
		this.middle = middle;
		this.lname = lname;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.male = male;
		this.female = female;
		this.country = country;
		this.state = state;
		this.address = address;
		this.phone = phone;
		this.password = password;
		this.cpassword = cpassword;
	}
	
	

}

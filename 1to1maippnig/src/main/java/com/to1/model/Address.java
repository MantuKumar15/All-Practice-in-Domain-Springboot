package com.to1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Transactional
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "add_id")
	private Long  addressId;
	private String city;
	private String addressType;
	
	@OneToOne(mappedBy = "address")
	private Employee employee;
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	

}

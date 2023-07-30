package com.to1.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.hql.internal.ast.tree.FkRefNode;

@Entity
@Transactional
@Table(name = "employee_details")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Long  empId;
	private String empName;
	private String empAge;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_id")
	private Address address;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAge() {
		return empAge;
	}
	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}
	

}

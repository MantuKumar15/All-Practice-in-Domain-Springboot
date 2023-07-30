package com.to1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.to1.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}

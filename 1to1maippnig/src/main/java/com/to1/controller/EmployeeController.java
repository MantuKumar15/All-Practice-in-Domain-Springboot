package com.to1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.to1.model.Employee;
import com.to1.repository.EmpRepo;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmpRepo empRepo;
	
	@PostMapping("/saveEemployees")
	public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData){
		empRepo.saveAll(empData);
		return ResponseEntity.ok("Data saved");
	}

}

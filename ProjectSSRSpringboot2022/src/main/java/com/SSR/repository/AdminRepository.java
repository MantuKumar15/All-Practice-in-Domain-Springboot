package com.SSR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SSR.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	public Admin findByUsername(String username);
}

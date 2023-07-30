package com.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls,Integer> {
	
	public UserDtls findByEmail(String em);

}

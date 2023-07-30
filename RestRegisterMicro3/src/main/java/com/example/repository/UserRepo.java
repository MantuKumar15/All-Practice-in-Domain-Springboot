package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface UserRepo extends JpaRepository<User,Integer>
{
	
     User findByUid(String uid);

}

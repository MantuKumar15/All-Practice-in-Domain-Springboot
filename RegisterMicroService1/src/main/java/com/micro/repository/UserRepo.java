package com.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.micro.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
//	User verify(Model m1);
	User findByUid(String uid);

}
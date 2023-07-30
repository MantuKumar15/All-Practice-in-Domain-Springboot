package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepo;


@RestController

public class RegController {
	@Autowired //it will look for the object
	
	private UserRepo userRepo;

	
	@RequestMapping("/register-user/{uid}/{pwd}")
	public String reguser(@PathVariable("uid")String uid,@PathVariable("pwd")String pwd) {//alien alien what ever data is coming from the client will be assigned here
		User u=new User();
		u.setId(11);
		u.setUid(uid);
		u.setPwd(pwd);
		userRepo.save(u);
		return "reg sucessfull";
		
	}
	
	
}

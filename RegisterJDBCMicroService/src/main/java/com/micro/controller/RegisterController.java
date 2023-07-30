package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.User;
import com.micro.repository.UserRepo;

@RestController
public class RegisterController {
	 @Autowired
	 private UserRepo userRepo;
	 @RequestMapping("/check")
	 public String registercheck() {
		
   	 return "successfully registered check ";
    }

	 
	@RequestMapping("/register-user/{uid}/{pwd}")
	 public String registeruser(@PathVariable("uid") String uid,@PathVariable("pwd") String pwd) {
		 System.out.print("Going to register microservice");
		User u = new User();
		u.setId(1);
		u.setUid(uid);
		u.setPwd(pwd);
		userRepo.save(u);
   	 return "successfully registered ";
    }
}

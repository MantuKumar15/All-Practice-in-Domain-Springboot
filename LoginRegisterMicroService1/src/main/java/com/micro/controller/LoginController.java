package com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.micro.model.User;
import com.micro.repository.UserRepo;

@Controller
public class LoginController {
	@Autowired
	private UserRepo userRepo;
	
	private RestTemplate restTemplate = new RestTemplate() ;
	
	@RequestMapping("/")
	public String getLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String checkLogin(@RequestParam("uid")String uid,@RequestParam("pwd")String pwd,Model model) {
		
		User u = null;
		
		try
		{
//			model.addAttribute("user", uid);
//			model.addAttribute("pwd", pwd);
//			user=userRepo.verify( m);
			u=userRepo.findByUid(uid);
		}
		catch(Exception e) {
			System.out.println("User no Found !!!");
			return "login";
		}
		if(u!=null) {
			
			model.addAttribute("username", uid);
			return "home";
		}
		model.addAttribute("error", "Wrong User Id or Password, Try Again!!");
		return "login";
	}
	
	@RequestMapping("/register")
	public String RegistrationPage() {
		return "register";
	}
	
	@RequestMapping("/set-user")
	 public String getregister(@RequestParam("uid") String uid ,@RequestParam("pwd1") String pwd1,@RequestParam("pwd2") String pwd2,Model model ) {
		 System.out.print("Going to register microservice");
		 if(pwd1.equals(pwd2)) {
   	  restTemplate.getForObject("http://localhost:8083/register-user/"+uid+"/"+pwd1, String.class);
     model.addAttribute("registersuccess", "successfully register ");
	 }
     else {
   	  model.addAttribute("registrationError", "password not same");
     }
		 return "login";
    }

}

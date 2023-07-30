package com.jdbc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdbc.entity.UserDtls;
import com.jdbc.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder bp;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtls u,HttpSession session) {
		
		System.out.println(u);
		u.setPassword(bp.encode(u.getPassword()));
		u.setRole("ROLE_USER");
		repo.save(u);
		session.setAttribute("message","User Register Sucessfully...");
		
		return "redirect:/";
	}

}

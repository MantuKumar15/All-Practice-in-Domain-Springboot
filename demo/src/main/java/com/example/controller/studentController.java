package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class studentController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handTest() {
		return "this is project using sts";
	}
	
}

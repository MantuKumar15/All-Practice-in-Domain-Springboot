package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TestController {
	@RequestMapping("/test")
	@ResponsBody
	
	public String handleTest() {
		return "this is project";
	}

}
 
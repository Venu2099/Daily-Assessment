package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Springclass1 {
	@GetMapping("/Greet")
	public String greeting() {
		return "NewFile";
	}
	

}

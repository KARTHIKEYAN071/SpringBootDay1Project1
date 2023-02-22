package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/welcome")
	
	public String dispalyWelcome() {
		return "Welcome to Spring boot!";
	}
}

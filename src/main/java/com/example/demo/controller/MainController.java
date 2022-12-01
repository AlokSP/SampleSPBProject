package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "Hello World";
	}
	

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot";
	}

}

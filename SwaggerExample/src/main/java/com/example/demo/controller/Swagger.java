package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Swagger {
	@GetMapping("/swagger")
	
	public String Swaggercontroller() {
		return "hello2";
		
	}
}

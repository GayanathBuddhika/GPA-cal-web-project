package com.example.demo.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@GetMapping("/")
	public String init() {
		return "hello rest";
		
	}

}

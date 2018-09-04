package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sem;
import com.example.demo.service.SemService;

@RestController
public class semController {
    @Autowired
	private SemService semService;
     @GetMapping("/sem")
     public Iterable<Sem> getSem(){
    	 
    	 return semService.getSem();
    	 
     }
	
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Year;
import com.example.demo.service.YearService;

@RestController
public class YearController {
    @Autowired
	private YearService yearService;
    
    @GetMapping("/year")
    public Iterable<Year> getYear(){
    	
    return yearService.getYear();
    }
}

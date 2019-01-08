package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartmentModel;
import com.example.demo.model.DigreeProgramModel;
import com.example.demo.service.DigreeProgramService;

@RestController
public class DigreeProgramControler {
	@Autowired
	private DigreeProgramService digreeProgramService;
    @GetMapping("/api/degreeprograms/{id}")
	public Iterable<DigreeProgramModel> getDigreeprogram(@PathVariable Integer id){
		
		return digreeProgramService.getDigreeprogram(id);
	}
    
    @GetMapping("/api/dpro/{id}")
   	public Optional<DigreeProgramModel>  getaDpro(@PathVariable Integer id){
   		
   		return digreeProgramService.dpro(id);
   		
   	}
}

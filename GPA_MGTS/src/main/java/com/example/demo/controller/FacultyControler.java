package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FacultyModel;
import com.example.demo.service.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyControler {
	@Autowired
	private FacultyService facultyService;
	
	@GetMapping("/all")
	public List<FacultyModel> getFaculty() {
		return facultyService.getAllFaculty();
		
	}

}
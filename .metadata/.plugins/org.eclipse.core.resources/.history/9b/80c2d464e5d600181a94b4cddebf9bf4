package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FacultyModel;
import com.example.demo.service.FacultyService;

@RestController
@RequestMapping("/api")
public class FacultyControler {
	@Autowired
	private FacultyService facultyService;
	
	@GetMapping("/faculties")
	public Iterable<FacultyModel> getFaculty() {
		return facultyService.getAllFaculty();
		
	}
	@GetMapping("/faculty/{id}")
   public Optional<FacultyModel> getAFaculty(@PathVariable Integer id){
	   return facultyService.getAFaculty(id);
   }
	
}

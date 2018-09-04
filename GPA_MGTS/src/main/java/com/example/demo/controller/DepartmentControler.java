package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartmentModel;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentControler {
	@Autowired
	private DepartmentService departmentService;
	
    @GetMapping("/faculty/{id}/department")
	public Iterable<DepartmentModel> getDepartment(@PathVariable Integer id){
		
		return departmentService.getDepartment(id);
		
	}
	
}

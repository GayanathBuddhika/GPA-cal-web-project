package com.example.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;
import com.example.demo.service.SubjectService;

@RestController
public class studentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/api/students")
	private Iterable<StudentModel> addStudents(@RequestBody Iterable<StudentModel> students){
		return studentService.addStudents(students);
	}
	
	@GetMapping("/api/students/password")
	private String createPassword() {
		Random random=new Random();
		String id = String.format("%04d", random.nextInt(10000));
		return id;
	}

}

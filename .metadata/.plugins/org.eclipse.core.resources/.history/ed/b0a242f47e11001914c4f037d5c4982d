package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Exam;
import com.example.demo.service.ExamService;

@RestController
public class ExamController {
	@Autowired
	private ExamService examService;
	@PostMapping("/api/exam")
	public Iterable<Exam> savaExam(@RequestBody Iterable<Exam> exam){
		return examService.saveExam(exam);
		
	}

}

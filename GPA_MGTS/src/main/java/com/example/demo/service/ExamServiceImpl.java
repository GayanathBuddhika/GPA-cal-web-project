package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Exam;
import com.example.demo.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService {
	@Autowired
	private ExamRepository examRepository;

	
	public Iterable<Exam> saveExam(Iterable<Exam> exam) {
		// TODO Auto-generated method stub
		return examRepository.saveAll(exam);
	}

}

package com.example.demo.service;

import com.example.demo.model.StudentModel;

public interface StudentService {

	Iterable<StudentModel> addStudents(Iterable<StudentModel> students);

	StudentModel getStudent(String epnum);

	Iterable<StudentModel> getAllStudents(String faculty, String department, String dpro, String badge);
	

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
	
	public StudentModel findByEpnum(String epnum);

	public Iterable<StudentModel> findByFacultyAndDepartmentAndDproAndBadge(String faculty, String department,
			String dpro, String badge);

}

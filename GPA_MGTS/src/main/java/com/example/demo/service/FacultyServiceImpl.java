package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FacultyModel;
import com.example.demo.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService{
    @Autowired
	private FacultyRepository facultyRepository;
	
	@Override
	public Iterable<FacultyModel> getAllFaculty() {
	    return facultyRepository.findAll();
	}

	@Override
	public Optional<FacultyModel> getAFaculty(Integer id) {
		// TODO Auto-generated method stub
		return facultyRepository.findById(id);
	}
 
}

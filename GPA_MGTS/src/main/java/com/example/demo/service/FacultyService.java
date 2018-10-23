package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.FacultyModel;

public interface FacultyService {

	public Iterable<FacultyModel> getAllFaculty();

	public Optional<FacultyModel> getAFaculty(Integer id);

}

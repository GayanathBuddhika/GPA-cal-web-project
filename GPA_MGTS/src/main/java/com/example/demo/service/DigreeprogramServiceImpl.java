package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DepartmentModel;
import com.example.demo.model.DigreeProgramModel;
import com.example.demo.repository.DigreeProgramRepository;

@Service
public class DigreeprogramServiceImpl implements DigreeProgramService{
	@Autowired
	private DigreeProgramRepository digreeProgramRepository;
    
	 public Iterable<DigreeProgramModel> getDigreeprogram(Integer id){
		 
		 return digreeProgramRepository.findByDepartmentId(id);
	 }

	@Override
	public Optional<DigreeProgramModel> dpro(Integer id) {
		// TODO Auto-generated method stub
		return digreeProgramRepository.findById(id);
	}
	 }

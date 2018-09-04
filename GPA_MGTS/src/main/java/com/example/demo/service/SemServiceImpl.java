package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sem;
import com.example.demo.repository.SemRepository;

@Service("semService")
public class SemServiceImpl implements SemService{
    @Autowired
	private SemRepository semRepository;
   
    public Iterable<Sem> getSem(){
    	
    	return semRepository.findAll();
    }
	
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Year;
import com.example.demo.repository.YearRepository;

@Service
public class YearServiceImpl implements YearService{
     @Autowired
	 private YearRepository yearRepository;
     
	@Override
	public Iterable<Year> getYear() {
		return yearRepository.findAll();
	}
     
     
}

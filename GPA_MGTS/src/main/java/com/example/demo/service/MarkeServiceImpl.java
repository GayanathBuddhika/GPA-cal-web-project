package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MarkModel;
import com.example.demo.repository.MarkeRepository;

@Service
public class MarkeServiceImpl implements MarkeService{
   @Autowired
	private MarkeRepository markeRepository;	

@Override
public String addMark(Iterable<MarkModel> marks) {
	
markeRepository.saveAll(marks);
	return "add mark";
}
}

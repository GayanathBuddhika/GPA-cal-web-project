package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MarkModel;
import com.example.demo.model.StudentModel;
import com.example.demo.repository.MarkeRepository;

@Service
public class MarkeServiceImpl implements MarkeService{
   @Autowired
	private MarkeRepository markeRepository;	

@Override
public Iterable<MarkModel> addMark(Iterable<MarkModel> marks) {
	
return markeRepository.saveAll(marks);
}

@Override
public Iterable<MarkModel> getMark(String epnum, Integer year, Integer sem) {
	// TODO Auto-generated method stub
	return markeRepository.findByEpnumAndYearAndSem(epnum,year,sem);
}

@Override
public Iterable<MarkModel> getMarks(String epnum) {
	// TODO Auto-generated method stub
	 return markeRepository.findByEpnum(epnum);
}
}

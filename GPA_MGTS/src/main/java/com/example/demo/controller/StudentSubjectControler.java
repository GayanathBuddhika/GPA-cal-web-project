package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentSubjectModel;
import com.example.demo.service.StudentSubjectService;

@RestController
public class StudentSubjectControler {
    @Autowired
	private StudentSubjectService studentSubjectService;
    
//    @GetMapping("/subject/{epnum}")
//    public Iterable<StudentSubjectModel> getSubject(@PathVariable String epnum){
//    	
//    	return studentSubjectService.getSubject(epnum);
//    	
//    }
    @GetMapping("/api/getstsub/{stsub}/{subnum}")
    public StudentSubjectModel getstsub(@PathVariable Integer stsub, @PathVariable Integer subnum){
    	
    	return studentSubjectService.getstsub(stsub, subnum);
    }
    @PostMapping("/api/studentSubject")
    public Iterable<StudentSubjectModel> saveStsb(@RequestBody Iterable<StudentSubjectModel> studentSubject){
    	
    	return studentSubjectService.saveStsb(studentSubject);
    }
}

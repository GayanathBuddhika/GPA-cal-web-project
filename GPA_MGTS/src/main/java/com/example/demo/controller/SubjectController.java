package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;

@RestController
public class SubjectController {
    @Autowired
	private SubjectService subjectService;
    @GetMapping("/digreeProgram/{did}/year/{yid}/sem/{sid}/subject")
    public Iterable<Subject> getSubject(@PathVariable Integer did, @PathVariable Integer yid, @PathVariable Integer sid ){
    	
    return subjectService.getSubjects(did,yid,sid);
    	
    }
}
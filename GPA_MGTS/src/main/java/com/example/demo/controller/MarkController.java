package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarkModel;
import com.example.demo.service.MarkeService;
@RestController
public class MarkController {
   @Autowired
	private MarkeService markeService;
	@PostMapping("/addMarks")
	public String addMark(@RequestBody Iterable<MarkModel> marks) {
		return markeService.addMark(marks);
		
	}
	
}

package com.example.demo.service;

import com.example.demo.model.StudentSubjectModel;

public interface StudentSubjectService {

	//Iterable<StudentSubjectModel> getSubject(String epnum);

	Iterable<StudentSubjectModel> getEpnum(Integer subjectcode);

}

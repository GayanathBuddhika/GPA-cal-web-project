package com.example.demo.service;

import com.example.demo.model.StudentSubjectModel;

public interface StudentSubjectService {

	//Iterable<StudentSubjectModel> getSubject(String epnum);


	Iterable<StudentSubjectModel> saveStsb(Iterable<StudentSubjectModel> studentSubject);

	StudentSubjectModel getstsub(Integer stsub, Integer subnum);

}

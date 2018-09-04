package com.example.demo.service;

import com.example.demo.model.Subject;

public interface SubjectService {

	Iterable<Subject> getSubjects(Integer did, Integer yid, Integer sid);

}

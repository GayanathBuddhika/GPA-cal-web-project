package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
	private SubjectRepository subjectRepository;

	@Override
	public Iterable<Subject> getSubjects(Integer did, Integer yid, Integer sid) {
		// TODO Auto-generated method stub
		return subjectRepository.findByDigreeProgaramIdAndYearIdAndSemId(did, yid, sid);
	}
}
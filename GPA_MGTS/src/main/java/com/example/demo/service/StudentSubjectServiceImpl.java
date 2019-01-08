package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentSubjectModel;
import com.example.demo.repository.StudentSubjectRepository;

@Service("studentSubjectService")
public class StudentSubjectServiceImpl implements StudentSubjectService{
    @Autowired 
	private StudentSubjectRepository studentSubjectRepository;

//	@Override
//	public Iterable<StudentSubjectModel> getSubject(String  epnum) {
//		
//		return studentSubjectRepository.findByEpnum(epnum);
//	}

	public StudentSubjectModel getstsub(Integer stsub, Integer subnum){
		
		return studentSubjectRepository.findByStudent_idAndSubject_id(stsub,subnum);
	}

	@Override
	public Iterable<StudentSubjectModel> saveStsb(Iterable<StudentSubjectModel> studentSubject) {
		// TODO Auto-generated method stub
		return studentSubjectRepository.saveAll(studentSubject);
	}
    
    
    
}

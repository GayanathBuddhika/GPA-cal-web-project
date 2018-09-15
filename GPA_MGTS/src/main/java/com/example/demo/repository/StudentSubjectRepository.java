package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentSubjectModel;

public interface StudentSubjectRepository extends JpaRepository<StudentSubjectModel, Integer>{
    public Iterable<StudentSubjectModel> findByEpnum(String epmun); 
	public Iterable<StudentSubjectModel> findBySubject(Integer subjectcode);

}

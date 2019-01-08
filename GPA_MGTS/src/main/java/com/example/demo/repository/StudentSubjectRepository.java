package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentSubjectModel;

public interface StudentSubjectRepository extends JpaRepository<StudentSubjectModel, Integer>{
   // public Iterable<StudentSubjectModel> findByEpnum(String epmun); 
	public StudentSubjectModel findByStudent_idAndSubject_id(Integer stsub, Integer subnum);

}

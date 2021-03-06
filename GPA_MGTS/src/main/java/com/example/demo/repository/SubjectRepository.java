package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DigreeProgramModel;
import com.example.demo.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

	//public Iterable<Subject> findByDigreeProgaramIdAndYearIdAndSemId(Integer did, Integer yid, Integer sid);
	public Iterable<Subject> findByDigreeProgramIdAndYearAndSem(Integer did, Integer yid, Integer sid);
}

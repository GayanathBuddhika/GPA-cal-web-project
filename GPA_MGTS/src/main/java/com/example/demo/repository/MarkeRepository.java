package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MarkModel;
import com.example.demo.model.StudentModel;

public interface MarkeRepository extends JpaRepository<MarkModel, Integer> {

	Iterable<MarkModel> findByEpnumAndYearAndSem(String epnum, Integer year, Integer sem);
	Iterable<MarkModel> findByEpnum(String epnum);
	


}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Year;

public interface YearRepository extends JpaRepository<Year,Integer>{
	

}
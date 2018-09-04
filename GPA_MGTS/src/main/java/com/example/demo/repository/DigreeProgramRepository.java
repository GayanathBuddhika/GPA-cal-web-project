package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DigreeProgramModel;

public interface DigreeProgramRepository extends JpaRepository<DigreeProgramModel, Integer>{
 public Iterable<DigreeProgramModel> findByDepartmentId(Integer id);
}

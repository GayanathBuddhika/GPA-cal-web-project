package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.DepartmentModel;

public interface DepartmentService {

	Iterable<DepartmentModel> getDepartment(Integer dep);

	String saveDepartment(DepartmentModel dep);

	Optional<DepartmentModel> department(Integer id);

}

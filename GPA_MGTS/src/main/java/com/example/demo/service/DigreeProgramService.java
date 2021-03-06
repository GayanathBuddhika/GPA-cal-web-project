package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.DepartmentModel;
import com.example.demo.model.DigreeProgramModel;

public interface DigreeProgramService {
	public Iterable<DigreeProgramModel> getDigreeprogram(Integer id);

	public Optional<DigreeProgramModel> dpro(Integer id);

}

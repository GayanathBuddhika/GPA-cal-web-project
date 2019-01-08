package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.SubjectRepository;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
	private StudentRepository studentRepository;
    
	@Override
	public Iterable<StudentModel> addStudents(Iterable<StudentModel> students) {
		// TODO Auto-generated method stub
		return studentRepository.saveAll(students);
	}

  @Override
  public StudentModel getStudent(String epnum) {
 		// TODO Auto-generated method stub
		return studentRepository.findByEpnum(epnum);
	}

@Override
public Iterable<StudentModel> getAllStudents(String faculty, String department, String dpro, String badge) {
	// TODO Auto-generated method stub
	return studentRepository.findByFacultyAndDepartmentAndDproAndBadge(faculty,department,dpro,badge);

}
	
}

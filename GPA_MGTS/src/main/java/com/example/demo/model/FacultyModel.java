package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class FacultyModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer faculty_num;
	private String faculty_name;
	@OneToMany(mappedBy="faculty")
	private List<DepartmentModel> department=new ArrayList<>();
	
	public FacultyModel() {
		
	}

	
	
	public FacultyModel(Integer faculty_num, String faculty_name, List<DepartmentModel> department) {
		super();
		this.faculty_num = faculty_num;
		this.faculty_name = faculty_name;
		this.department = department;
	}
	public Integer getFaculty_num() {
		return faculty_num;
	}
	public void setFaculty_num(Integer faculty_num) {
		this.faculty_num = faculty_num;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public List<DepartmentModel> getDepartment() {
		return department;
	}


	public void setDepartment(List<DepartmentModel> department) {
		this.department = department;
	}
	

}

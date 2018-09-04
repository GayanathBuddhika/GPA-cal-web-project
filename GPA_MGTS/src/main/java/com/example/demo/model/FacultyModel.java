package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FacultyModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String faculty_name;
	@OneToMany(mappedBy="faculty")
	@JsonIgnore
	private List<DepartmentModel> department=new ArrayList<>();
	
	public FacultyModel() {
		
	}

	
	
	public FacultyModel(Integer id, String faculty_name, List<DepartmentModel> department) {
		super();
		this.id = id;
		this.faculty_name = faculty_name;
		this.department = department;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

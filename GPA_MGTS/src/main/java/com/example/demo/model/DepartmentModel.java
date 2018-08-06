package com.example.demo.model;

public class DepartmentModel {
	private String dep_num;
	private String dep_name;
	private Integer faculty_num;
	
	
	public DepartmentModel() {
		
	}
	
	public DepartmentModel(String dep_num, String dep_name, Integer faculty_num) {
		this.dep_num = dep_num;
		this.dep_name = dep_name;
		this.faculty_num = faculty_num;
	}
	
	
	public String getDep_num() {
		return dep_num;
	}
	public void setDep_num(String dep_num) {
		this.dep_num = dep_num;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public Integer getFaculty_num() {
		return faculty_num;
	}
	public void setFaculty_num(Integer faculty_num) {
		this.faculty_num = faculty_num;
	}
	
	

}

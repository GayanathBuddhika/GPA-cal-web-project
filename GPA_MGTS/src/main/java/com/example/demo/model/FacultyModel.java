package com.example.demo.model;

public class FacultyModel {
	
	
	private Integer faculty_num;
	private String faculty_name;
	
	public FacultyModel() {
		
	}
	
	
	public FacultyModel(Integer faculty_num, String faculty_name) {
		this.faculty_num = faculty_num;
		this.faculty_name = faculty_name;
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
	
	

}
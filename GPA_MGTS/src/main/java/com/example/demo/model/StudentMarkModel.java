package com.example.demo.model;

public class StudentMarkModel {
	
	private String subject_code;
	private String ep_num;
	private String grade_mark;
	private double grade_point;
	
	public StudentMarkModel() {
		
	}
	
	
	public StudentMarkModel(String subject_code, String ep_num, String grade_mark, double grade_point) {
		super();
		this.subject_code = subject_code;
		this.ep_num = ep_num;
		this.grade_mark = grade_mark;
		this.grade_point = grade_point;
	}
	public String getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	public String getEp_num() {
		return ep_num;
	}
	public void setEp_num(String ep_num) {
		this.ep_num = ep_num;
	}
	public String getGrade_mark() {
		return grade_mark;
	}
	public void setGrade_mark(String grade_mark) {
		this.grade_mark = grade_mark;
	}
	public double getGrade_point() {
		return grade_point;
	}
	public void setGrade_point(double grade_point) {
		this.grade_point = grade_point;
	}
	
	

}
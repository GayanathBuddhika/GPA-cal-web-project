package com.example.demo.model;

public class SubjectModel {
	
	private String sbject_code_num;
	private String subject_name;
	
	public SubjectModel() {
		
	}
	
	
	
	public SubjectModel(String sbject_code_num, String subject_name) {
		super();
		this.sbject_code_num = sbject_code_num;
		this.subject_name = subject_name;
	}
	
	
	public String getSbject_code_num() {
		return sbject_code_num;
	}
	public void setSbject_code_num(String sbject_code_num) {
		this.sbject_code_num = sbject_code_num;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	

}
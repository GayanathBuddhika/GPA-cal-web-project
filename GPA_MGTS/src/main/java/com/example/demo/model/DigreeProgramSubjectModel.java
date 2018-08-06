package com.example.demo.model;

public class DigreeProgramSubjectModel {
	
	private String digpro_num;
	private String subject_code;
	private String year;
	private Integer sem;
	private Integer credit;
	
	public DigreeProgramSubjectModel() {
		
	}
	
	
	public DigreeProgramSubjectModel(String digpro_num, String subject_code, String year, Integer sem, Integer credit) {
		super();
		this.digpro_num = digpro_num;
		this.subject_code = subject_code;
		this.year = year;
		this.sem = sem;
		this.credit = credit;
	}
	public String getDigpro_num() {
		return digpro_num;
	}
	public void setDigpro_num(String digpro_num) {
		this.digpro_num = digpro_num;
	}
	public String getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Integer getSem() {
		return sem;
	}
	public void setSem(Integer sem) {
		this.sem = sem;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	
	

}

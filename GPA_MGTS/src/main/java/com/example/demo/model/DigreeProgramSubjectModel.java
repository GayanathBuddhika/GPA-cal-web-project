package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DigreeProgramSubjectModel {
	@Id
	private String subject_code;
	private String subject_name;
	private String year;
	private Integer sem;
	private Integer credit;
	@ManyToOne
	@JoinColumn(name="digree_num")
	private DigreeProgramModel digreeProgaram;
	@OneToMany(mappedBy="degreeProgramSubject")
	private List<StudentSubjectModel> studentMarke=new ArrayList<>();
	
	public DigreeProgramSubjectModel() {
		
	}
	
	
	
	


	public DigreeProgramSubjectModel(String subject_code, String subject_name, String year, Integer sem, Integer credit,
			DigreeProgramModel digreeProgaram, List<StudentSubjectModel> studentMarke) {
		super();
		this.subject_code = subject_code;
		this.subject_name = subject_name;
		this.year = year;
		this.sem = sem;
		this.credit = credit;
		this.digreeProgaram = digreeProgaram;
		this.studentMarke = studentMarke;
	}






	public DigreeProgramModel getDigreeProgaram() {
		return digreeProgaram;
	}
	public void setDigreeProgaram(DigreeProgramModel digreeProgaram) {
		this.digreeProgaram = digreeProgaram;
	}
	public List<StudentSubjectModel> getStudentMarke() {
		return studentMarke;
	}
	public void setStudentMarke(List<StudentSubjectModel> studentMarke) {
		this.studentMarke = studentMarke;
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
	public String getSubject_code() {
		return subject_code;
	}
	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
	
}

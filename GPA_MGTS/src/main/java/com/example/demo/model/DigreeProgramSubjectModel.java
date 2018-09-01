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
	private String year;
	private Integer sem;
	private Integer credit;
	@ManyToOne
	@JoinColumn(name="digree_num")
	private DigreeProgramModel digreeProgaram;
	@OneToMany(mappedBy="degreeProgramSubject")
	private List<StudentMarkModel> studentMarke=new ArrayList<>();
	
	public DigreeProgramSubjectModel() {
		
	}
	
	
	
	public DigreeProgramSubjectModel(String year, Integer sem, Integer credit, DigreeProgramModel digreeProgaram,
			 List<StudentMarkModel> studentMarke) {
		super();
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
	public List<StudentMarkModel> getStudentMarke() {
		return studentMarke;
	}
	public void setStudentMarke(List<StudentMarkModel> studentMarke) {
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
	
	

}

package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String subject_code;
	private String subject_name;
	@ManyToOne
	@JoinColumn(name="year")
	private Year year;
	@ManyToOne
	@JoinColumn(name="sem")
	private Sem sem;
	private Integer credit;
	@ManyToOne
	@JoinColumn(name="digree_num")
	private DigreeProgramModel digreeProgaram;
	@OneToMany(mappedBy="subject")
	private List<StudentSubjectModel> studentMarke=new ArrayList<>();
	
	public Subject() {}
	
	

	
	public Subject(Integer id, String subject_code, String subject_name, Year year, Sem sem, Integer credit,
			DigreeProgramModel digreeProgaram, List<StudentSubjectModel> studentMarke) {
		super();
		this.id = id;
		this.subject_code = subject_code;
		this.subject_name = subject_name;
		this.year = year;
		this.sem = sem;
		this.credit = credit;
		this.digreeProgaram = digreeProgaram;
		this.studentMarke = studentMarke;
	}




	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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
	
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public Sem getSem() {
		return sem;
	}
	public void setSem(Sem sem) {
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

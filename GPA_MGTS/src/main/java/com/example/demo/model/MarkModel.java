package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MarkModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String grade;
    private Integer year;
    private Integer sem;
	private String epnum;
	private Integer credit;
	
	@ManyToOne
	@JoinColumn(name="studentSubject_Id")
	private StudentSubjectModel studentSubject;
	
	
	public MarkModel() {}


	public MarkModel(Integer id, String grade, Integer year, Integer sem, String epnum, Integer credit,
			StudentSubjectModel studentSubject) {
		super();
		this.id = id;
		this.grade = grade;
		this.year = year;
		this.sem = sem;
		this.epnum = epnum;
		this.credit = credit;
		this.studentSubject = studentSubject;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public Integer getSem() {
		return sem;
	}


	public void setSem(Integer sem) {
		this.sem = sem;
	}


	public String getEpnum() {
		return epnum;
	}


	public void setEpnum(String epnum) {
		this.epnum = epnum;
	}


	public Integer getCredit() {
		return credit;
	}


	public void setCredit(Integer credit) {
		this.credit = credit;
	}


	public StudentSubjectModel getStudentSubject() {
		return studentSubject;
	}


	public void setStudentSubject(StudentSubjectModel studentSubject) {
		this.studentSubject = studentSubject;
	}



}

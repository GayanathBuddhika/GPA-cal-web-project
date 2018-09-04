package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MarkModel {
	@Id
	private Integer id;
	private String grade;
	private double mark;
	@OneToOne
	@JoinColumn(name="student_of_subject_id")
	private StudentSubjectModel studentOfSubject;
	
	public MarkModel() {}

	
	public MarkModel(Integer id, String grade, double mark, StudentSubjectModel studentOfSubject) {
		super();
		this.id = id;
		this.grade = grade;
		this.mark = mark;
		this.studentOfSubject = studentOfSubject;
	}


	public Integer getId() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
    public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public StudentSubjectModel getStudentOfSubject() {
		return studentOfSubject;
	}
	public void setStudentOfSubject(StudentSubjectModel studentOfSubject) {
		this.studentOfSubject = studentOfSubject;
	}

	
	
}

package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MarkModel {
	@Id
	private Integer markId;
	private String grade;
	private double mark;
	@OneToOne
	@JoinColumn(name="student_of_subject_id")
	private StudentSubjectModel studentOfSubject;
	
	public MarkModel() {}

	
	public MarkModel(Integer markId, String grade, double mark, StudentSubjectModel studentOfSubject) {
		super();
		this.markId = markId;
		this.grade = grade;
		this.mark = mark;
		this.studentOfSubject = studentOfSubject;
	}


	public Integer getMarkId() {
		return markId;
	}
	public void setMarkId(Integer markId) {
		this.markId = markId;
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

package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentMarkModel {
	@Id
	private Integer studentMarkId;
	@ManyToOne
	@JoinColumn(name="subject_code")
	private DigreeProgramSubjectModel degreeProgramSubject;
	@ManyToOne
	@JoinColumn(name="ep_num")
	private StudentModel student;
	private String grade_mark;
	private double grade_point;
	
	public StudentMarkModel() {
		
	}
	
	
	
	public StudentMarkModel(Integer studentMarkId, DigreeProgramSubjectModel degreeProgramSubject, StudentModel student,
			String grade_mark, double grade_point) {
		super();
		this.studentMarkId = studentMarkId;
		this.degreeProgramSubject = degreeProgramSubject;
		this.student = student;
		this.grade_mark = grade_mark;
		this.grade_point = grade_point;
	}



	
	public Integer getStudentMarkId() {
		return studentMarkId;
	}
	public void setStudentMarkId(Integer studentMarkId) {
		this.studentMarkId = studentMarkId;
	}
	public DigreeProgramSubjectModel getDegreeProgramSubject() {
		return degreeProgramSubject;
	}
	public void setDegreeProgramSubject(DigreeProgramSubjectModel degreeProgramSubject) {
		this.degreeProgramSubject = degreeProgramSubject;
	}
	public StudentModel getStudent() {
		return student;
	}
	public void setStudent(StudentModel student) {
		this.student = student;
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

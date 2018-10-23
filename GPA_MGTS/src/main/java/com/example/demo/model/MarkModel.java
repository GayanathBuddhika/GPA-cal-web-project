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
	private double mark;
	@ManyToOne
	@JoinColumn(name="studentSubject_Id")
	private StudentSubjectModel studentSubject;
	@ManyToOne
	@JoinColumn(name="exam_id")
	private Exam exam;
	
	public MarkModel() {}


	public MarkModel(Integer id, String grade, double mark, StudentSubjectModel studentSubject,Exam exam) {
		super();
		this.id = id;
		this.grade = grade;
		this.mark = mark;
		this.studentSubject = studentSubject;
		this.exam=exam;
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


	public StudentSubjectModel getStudentSubject() {
		return studentSubject;
	}


	public void setStudentSubject(StudentSubjectModel studentSubject) {
		this.studentSubject = studentSubject;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
    
	
	
}

package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Gpa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private double gpa;
	@ManyToOne
	@JoinColumn(name="student_id")
	private StudentModel student;
	
	public Gpa() {
		
	}
	
	public Gpa(Integer id, double gpa, StudentModel student) {
		super();
		this.id = id;
		this.gpa = gpa;
		this.student = student;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public StudentModel getStudent() {
		return student;
	}
	public void setStudent(StudentModel student) {
		this.student = student;
	}
	
	
	

}

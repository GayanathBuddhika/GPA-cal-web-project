package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentModel {
	@Id
	private String ep_num;
	private double gpa;
	@OneToMany(mappedBy="student")
	private List<StudentMarkModel> studentMark=new ArrayList<>();
	@OneToMany(mappedBy="student")
	private List<UserModel> user=new ArrayList<>();
	
	public StudentModel() {}
	
	
	
	
	public StudentModel(String ep_num, double gpa, List<StudentMarkModel> studentMark, List<UserModel> user) {
		super();
		this.ep_num = ep_num;
		this.gpa = gpa;
		this.studentMark = studentMark;
		this.user = user;
	}


	public List<StudentMarkModel> getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(List<StudentMarkModel> studentMark) {
		this.studentMark = studentMark;
	}
	public List<UserModel> getUser() {
		return user;
	}
	public void setUser(List<UserModel> user) {
		this.user = user;
	}
	public String getEp_num() {
		return ep_num;
	}
	public void setEp_num(String ep_num) {
		this.ep_num = ep_num;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}

package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String ep_num;
	private double gpa;
	@OneToMany(mappedBy="student")
	private List<StudentSubjectModel> studentMark=new ArrayList<>();
	@OneToMany(mappedBy="student")
	private List<UserModel> user=new ArrayList<>();
	
	public StudentModel() {}
	
	
	public StudentModel(Integer id, String ep_num, double gpa, List<StudentSubjectModel> studentMark,
			List<UserModel> user) {
		super();
		this.id = id;
		this.ep_num = ep_num;
		this.gpa = gpa;
		this.studentMark = studentMark;
		this.user = user;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<StudentSubjectModel> getStudentMark() {
		return studentMark;
	}
	public void setStudentMark(List<StudentSubjectModel> studentMark) {
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

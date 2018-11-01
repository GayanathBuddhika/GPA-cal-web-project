package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String ep_num;
    private String  badge;
    private String login_num;
    @OneToMany(mappedBy="student")
    @JsonIgnore
    private List<StudentSubjectModel> studentSubject= new ArrayList<>();
    @OneToMany(mappedBy="student")
    @JsonIgnore
    private List<Gpa> gpa=new ArrayList<>();
    
    
	
	public StudentModel() {}



	public StudentModel(Integer id, String name, String email, String ep_num, String badge, String login_num,
			List<StudentSubjectModel> studentSubject, List<Gpa> gpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.ep_num = ep_num;
		this.badge = badge;
		this.login_num = login_num;
		this.studentSubject = studentSubject;
		this.gpa = gpa;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEp_num() {
		return ep_num;
	}



	public void setEp_num(String ep_num) {
		this.ep_num = ep_num;
	}



	public String getBadge() {
		return badge;
	}



	public void setBadge(String badge) {
		this.badge = badge;
	}



	public String getLogin_num() {
		return login_num;
	}



	public void setLogin_num(String login_num) {
		this.login_num = login_num;
	}



	public List<StudentSubjectModel> getStudentSubject() {
		return studentSubject;
	}



	public void setStudentSubject(List<StudentSubjectModel> studentSubject) {
		this.studentSubject = studentSubject;
	}



	public List<Gpa> getGpa() {
		return gpa;
	}



	public void setGpa(List<Gpa> gpa) {
		this.gpa = gpa;
	}

	
	
	
}
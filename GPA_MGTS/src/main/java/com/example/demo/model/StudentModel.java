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
	private String epnum;
    private String  badge;
    private String login_num;
    private String faculty;
    private String department;
    private String dpro;
    @OneToMany(mappedBy="student")
    @JsonIgnore
    private List<StudentSubjectModel> studentSubject= new ArrayList<>();
    @OneToMany(mappedBy="student")
    @JsonIgnore
    private List<Gpa> gpa=new ArrayList<>();
    
    
	
	public StudentModel() {}



	public StudentModel(Integer id, String name, String email, String epnum, String badge, String login_num,
			String faculty, String department, String dpro, List<StudentSubjectModel> studentSubject, List<Gpa> gpa) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.epnum = epnum;
		this.badge = badge;
		this.login_num = login_num;
		this.faculty = faculty;
		this.department = department;
		this.dpro = dpro;
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



	public String getEpnum() {
		return epnum;
	}



	public void setEpnum(String epnum) {
		this.epnum = epnum;
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



	public String getFaculty() {
		return faculty;
	}



	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getDpro() {
		return dpro;
	}



	public void setDpro(String dpro) {
		this.dpro = dpro;
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
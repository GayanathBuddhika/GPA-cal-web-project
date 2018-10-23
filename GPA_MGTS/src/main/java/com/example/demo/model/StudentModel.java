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
	private String ep_num;
    private String  badge;
    private Integer login_num;
    @OneToMany(mappedBy="student")
    @JsonIgnore
    private List<StudentSubjectModel> studentSubject= new ArrayList<>();
    @OneToMany(mappedBy="student")
    @JsonIgnore
    private List<Gpa> gpa=new ArrayList<>();
    
    
	
	public StudentModel() {}

	public StudentModel(Integer id, String ep_num, String badge, Integer login_num,
			List<StudentSubjectModel> studentSubject, List<Gpa> gpa) {
		super();
		this.id = id;
		this.ep_num = ep_num;
		this.badge = badge;
		this.login_num = login_num;
		this.studentSubject = studentSubject;
		this.gpa=gpa;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getLogin_num() {
		return login_num;
	}

	public void setLogin_num(Integer login_num) {
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
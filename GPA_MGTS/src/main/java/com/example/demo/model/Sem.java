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
public class Sem {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String semName;
	@OneToMany(mappedBy="sem")
	@JsonIgnore
	private List<Subject> subject =new ArrayList<>();
	public Sem(){}
	
	public Sem(Integer id, String semName, List<Subject> subject) {
		super();
		this.id = id;
		this.semName = semName;
		this.subject = subject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSemName() {
		return semName;
	}

	public void setSemName(String semName) {
		this.semName = semName;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
	
}
package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DepartmentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String dep_name;
	@ManyToOne
	@JoinColumn(name="faculy_num")
	private FacultyModel faculty;
	@OneToMany(mappedBy="department")
	@JsonIgnore
	private List<DigreeProgramModel> digreeProgram =new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="admin_id")
	private Admin admin;
	
	public DepartmentModel() {
		
	}
	
	public DepartmentModel(Integer id, String dep_name, FacultyModel faculty, List<DigreeProgramModel> digreeProgram) {
		super();
		this.id = id;
		this.dep_name = dep_name;
		this.faculty = faculty;
		this.digreeProgram = digreeProgram;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public FacultyModel getFaculty() {
		return faculty;
	}
	public void setFaculty(FacultyModel faculty) {
		this.faculty = faculty;
	}

	public List<DigreeProgramModel> getDigreeProgram() {
		return digreeProgram;
	}

    public void setDigreeProgram(List<DigreeProgramModel> digreeProgram) {
		this.digreeProgram = digreeProgram;
	}
	
	

}

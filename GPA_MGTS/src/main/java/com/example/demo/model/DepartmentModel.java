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

@Entity
public class DepartmentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String dep_num;
	private String dep_name;
	@ManyToOne
	@JoinColumn(name="faculy_num")
	private FacultyModel faculty;
	@OneToMany(mappedBy="department")
	private List<DigreeProgramModel> digreeProgram =new ArrayList<>();
	
	public DepartmentModel() {
		
	}
	
	
	


	public DepartmentModel(String dep_num, String dep_name, FacultyModel faculty,
			List<DigreeProgramModel> digreeProgram) {
		super();
		this.dep_num = dep_num;
		this.dep_name = dep_name;
		this.faculty = faculty;
		this.digreeProgram = digreeProgram;
	}





	public String getDep_num() {
		return dep_num;
	}
	public void setDep_num(String dep_num) {
		this.dep_num = dep_num;
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

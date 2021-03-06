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
public class DigreeProgramModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String digpro_name;
	@ManyToOne
	@JoinColumn(name="dep_num")
	private DepartmentModel department;
	@OneToMany(mappedBy="digreeProgram")
	@JsonIgnore
	private List<Subject> subject =new ArrayList<>();
	
	public DigreeProgramModel() {
		
	}
	
	
	public DigreeProgramModel(Integer id, String digpro_name, DepartmentModel department,
			List<Subject> subject) {
		super();
		this.id = id;
		
		this.digpro_name = digpro_name;
		this.department = department;
		this.subject = subject;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDigpro_name() {
		return digpro_name;
	}
	public void setDigpro_name(String digpro_name) {
		this.digpro_name = digpro_name;
	}


	public DepartmentModel getDepartment() {
		return department;
	}


	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}


	public List<Subject> getSubject() {
		return subject;
	}


	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}



	
	
	

}

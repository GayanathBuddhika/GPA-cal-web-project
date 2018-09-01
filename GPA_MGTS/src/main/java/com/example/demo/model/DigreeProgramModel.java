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
public class DigreeProgramModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String digpro_num;
	private String digpro_name;
	@ManyToOne
	@JoinColumn(name="dep_num")
	private DepartmentModel department;
	@OneToMany(mappedBy="digreeProgaram")
	private List<DigreeProgramSubjectModel> digreeProgrameSubject =new ArrayList<>();
	
	public DigreeProgramModel() {
		
	}
	
	

	public DigreeProgramModel(String digpro_num, String digpro_name, DepartmentModel department,
			List<DigreeProgramSubjectModel> digreeProgrameSubject) {
		super();
		this.digpro_num = digpro_num;
		this.digpro_name = digpro_name;
		this.department = department;
		this.digreeProgrameSubject = digreeProgrameSubject;
	}



	public String getDigpro_num() {
		return digpro_num;
	}
	public void setDigpro_num(String digpro_num) {
		this.digpro_num = digpro_num;
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



	public List<DigreeProgramSubjectModel> getDigreeProgrameSubject() {
		return digreeProgrameSubject;
	}



	public void setDigreeProgrameSubject(List<DigreeProgramSubjectModel> digreeProgrameSubject) {
		this.digreeProgrameSubject = digreeProgrameSubject;
	}
	
	
	

}

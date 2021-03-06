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
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String subject_code;
	private String subject_name;
	private Integer year;
	private Integer sem;
	private Integer credit;
    @ManyToOne
    @JoinColumn(name="digree_id")
	private DigreeProgramModel digreeProgram;
    @OneToMany(mappedBy="subject")
    @JsonIgnore
    private List<StudentSubjectModel> studentSubject=new ArrayList<>();
    
    public Subject() {}
    
	public Subject(Integer id, String subject_code, String subject_name, Integer year, Integer sem, Integer credit,
			DigreeProgramModel digreeProgram, List<StudentSubjectModel> studentSubject) {
		super();
		this.id = id;
		this.subject_code = subject_code;
		this.subject_name = subject_name;
		this.year = year;
		this.sem = sem;
		this.credit = credit;
		this.digreeProgram = digreeProgram;
		this.studentSubject = studentSubject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSem() {
		return sem;
	}

	public void setSem(Integer sem) {
		this.sem = sem;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public DigreeProgramModel getDigreeProgram() {
		return digreeProgram;
	}

	public void setDigreeProgram(DigreeProgramModel digreeProgram) {
		this.digreeProgram = digreeProgram;
	}

	public List<StudentSubjectModel> getStudentSubject() {
		return studentSubject;
	}

	public void setStudentSubject(List<StudentSubjectModel> studentSubject) {
		this.studentSubject = studentSubject;
	}

	
	
}

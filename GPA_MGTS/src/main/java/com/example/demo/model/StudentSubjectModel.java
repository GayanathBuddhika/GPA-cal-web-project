package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StudentSubjectModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String epnum;
	@ManyToOne
	@JoinColumn(name="subjectcode")
	private Subject subject;
	@OneToOne(mappedBy="studentOfSubject")
	private MarkModel mark;
	
	public StudentSubjectModel() {
		
	}
	
	
	public StudentSubjectModel(Integer id, String epnum, Subject subject, MarkModel mark) {
		super();
		this.id = id;
		this.epnum = epnum;
		this.subject = subject;
		this.mark = mark;
	}


	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MarkModel getMark() {
		return mark;
	}
	public void setMark(MarkModel mark) {
		this.mark = mark;
	}
	public String getEpnum() {
		return epnum;
	}
	public void setEpnum(String epnum) {
		this.epnum = epnum;
	}
	
	
}

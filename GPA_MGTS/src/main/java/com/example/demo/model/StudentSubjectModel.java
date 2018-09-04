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
	@ManyToOne
	@JoinColumn(name="subject_code")
	private Subject subject;
	@ManyToOne
	@JoinColumn(name="ep_num")
	private StudentModel student;
	@OneToOne(mappedBy="studentOfSubject")
	private MarkModel mark;
	
	public StudentSubjectModel() {
		
	}
	
	public StudentSubjectModel(Integer id, Subject degreeProgramSubject, StudentModel student,
			MarkModel mark) {
		super();
		this.id = id;
		this.subject = subject;
		this.student = student;
		this.mark = mark;
	}

	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public StudentModel getStudent() {
		return student;
	}
	public void setStudent(StudentModel student) {
		this.student = student;
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
	
}

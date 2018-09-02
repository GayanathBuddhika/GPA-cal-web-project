package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StudentSubjectModel {
	@Id
	private Integer studentSubjectId;
	@ManyToOne
	@JoinColumn(name="subject_code")
	private DigreeProgramSubjectModel degreeProgramSubject;
	@ManyToOne
	@JoinColumn(name="ep_num")
	private StudentModel student;
	@OneToOne(mappedBy="studentOfSubject")
	private MarkModel mark;
	
	public StudentSubjectModel() {
		
	}
	
		
     public StudentSubjectModel(Integer studentSubjectId, DigreeProgramSubjectModel degreeProgramSubject,
			StudentModel student, MarkModel mark) {
		super();
		this.studentSubjectId = studentSubjectId;
		this.degreeProgramSubject = degreeProgramSubject;
		this.student = student;
		this.mark = mark;
	}


	public DigreeProgramSubjectModel getDegreeProgramSubject() {
		return degreeProgramSubject;
	}
	public void setDegreeProgramSubject(DigreeProgramSubjectModel degreeProgramSubject) {
		this.degreeProgramSubject = degreeProgramSubject;
	}
	public StudentModel getStudent() {
		return student;
	}
	public void setStudent(StudentModel student) {
		this.student = student;
	}
	public Integer getStudentSubjectId() {
		return studentSubjectId;
	}
	public void setStudentSubjectId(Integer studentSubjectId) {
		this.studentSubjectId = studentSubjectId;
	}
	public MarkModel getMark() {
		return mark;
	}
	public void setMark(MarkModel mark) {
		this.mark = mark;
	}
	
}
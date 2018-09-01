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
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer user_id;
	private String  user_name;
	private String user_email;
	@ManyToOne
	@JoinColumn(name="ep_num")
	private StudentModel student;
	@OneToMany(mappedBy="user")
	private List<UserRoleModel> userRole = new ArrayList<>();
    
	public UserModel() {}
	

	public UserModel(Integer user_id, String user_name, String user_email, StudentModel student,
			List<UserRoleModel> userRole) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.student = student;
		this.userRole = userRole;
	}


	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
    public StudentModel getStudent() {
		return student;
	}
	public void setStudent(StudentModel student) {
		this.student = student;
	}
	public List<UserRoleModel> getUserRole() {
		return userRole;
	}
	public void setUserRole(List<UserRoleModel> userRole) {
		this.userRole = userRole;
	}
   

}

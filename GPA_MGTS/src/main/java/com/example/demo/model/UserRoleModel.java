package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserRoleModel {
	@Id
	private Integer user_role_num;
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserModel user;
	@ManyToOne
	@JoinColumn(name="role_id")
	private RoleModel role;
	
	
	public UserRoleModel() {}
	
	
	public UserRoleModel(Integer user_role_num, UserModel user, RoleModel role) {
		super();
		this.user_role_num = user_role_num;
		this.user = user;
		this.role = role;
	}



	public Integer getUser_role_num() {
		return user_role_num;
	}
	public void setUser_role_num(Integer user_role_num) {
		this.user_role_num = user_role_num;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public RoleModel getRole() {
		return role;
	}
	public void setRole(RoleModel role) {
		this.role = role;
	}

	
}

package com.example.demo.model;

public class UserRoleModel {
	
	private Integer user_id;
	private Integer role_num;
	
	public UserRoleModel() {
		
	}
	
	public UserRoleModel(Integer user_id, Integer role_num) {
		
		this.user_id = user_id;
		this.role_num = role_num;
	}
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getRole_num() {
		return role_num;
	}
	public void setRole_num(Integer role_num) {
		this.role_num = role_num;
	}

}
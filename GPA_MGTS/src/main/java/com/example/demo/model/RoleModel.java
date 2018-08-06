package com.example.demo.model;

public class RoleModel {
	
	
	private Integer role_num;
	private String role_type;
	
	

	public RoleModel() {
		
	}

	public RoleModel(Integer role_num, String role_type) {
		super();
		this.role_num = role_num;
		this.role_type = role_type;
	}
	
	public Integer getRole_num() {
		return role_num;
	}
	public void setRole_num(Integer role_num) {
		this.role_num = role_num;
	}
	public String getRole_type() {
		return role_type;
	}
	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}

}

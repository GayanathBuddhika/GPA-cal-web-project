package com.example.demo.model;

public class UserModel {
	
	private Integer user_id;
	private String  user_name;
	private String user_email;
	private String ep_num;
	
	

	public UserModel() {
		
	}
	

	public UserModel(Integer user_id, String user_name, String user_email, String ep_num) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.ep_num = ep_num;
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
    public String getEp_num() {
		return ep_num;
	}
	public void setEp_num(String ep_num) {
		this.ep_num = ep_num;
	}
	

}

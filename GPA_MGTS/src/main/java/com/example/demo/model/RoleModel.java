package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RoleModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String role_type;
	@OneToMany(mappedBy="role")
	private List<UserRoleModel> userRole;
	

	public RoleModel() {
		
	}

	public RoleModel(Integer id, String role_type, List<UserRoleModel> userRole) {
		super();
		this.id = id;
		this.role_type = role_type;
		this.userRole = userRole;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<UserRoleModel> getUserRole() {
		return userRole;
	}
	public void setUserRole(List<UserRoleModel> userRole) {
		this.userRole = userRole;
	}
	public String getRole_type() {
		return role_type;
	}
	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}

}

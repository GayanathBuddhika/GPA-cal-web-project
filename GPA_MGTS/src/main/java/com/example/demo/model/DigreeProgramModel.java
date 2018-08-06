package com.example.demo.model;

public class DigreeProgramModel {
	private String digpro_num;
	private String digpro_name;
	private Integer dep_num;
	
	public DigreeProgramModel() {
		
	}
	
	public DigreeProgramModel(String digpro_num, String digpro_name, Integer dep_num) {		
		this.digpro_num = digpro_num;
		this.digpro_name = digpro_name;
		this.dep_num = dep_num;
	}
	
	public String getDigpro_num() {
		return digpro_num;
	}
	public void setDigpro_num(String digpro_num) {
		this.digpro_num = digpro_num;
	}
	public String getDigpro_name() {
		return digpro_name;
	}
	public void setDigpro_name(String digpro_name) {
		this.digpro_name = digpro_name;
	}
	public Integer getDep_num() {
		return dep_num;
	}
	public void setDep_num(Integer dep_num) {
		this.dep_num = dep_num;
	}
	
	

}

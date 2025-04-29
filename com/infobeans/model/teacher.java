package com.infobeans.model;


public class teacher {

	private  int t_id;
	private String t_name;
	private String expert;
	
	
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getExpert() {
		return expert;
	}
	public void setExpert(String expert) {
		this.expert = expert;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public teacher(int t_id, String t_name, String expert) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.expert = expert;
	}
	
	
		
}
package com.infobeans.model;


public class Student {
	
	private int s_id;
	private String name;
	private int s_class;
	private String spe;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getS_class() {
		return s_class;
	}
	public void setS_class(int s_class) {
		this.s_class = s_class;
	}
	public String getSpe() {
		return spe;
	}
	public void setSpe(String spe) {
		this.spe = spe;
	}
	public Student(int s_id, String name, int s_class, String spe) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.s_class = s_class;
		this.spe = spe;
	}
	
	
	
}

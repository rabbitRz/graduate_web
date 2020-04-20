package com.bruip.hr.bean;

import java.io.Serializable;

public class role implements Serializable{
	private int id;
	private String role_desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
	@Override
	public String toString() {
		return "role [id=" + id + ", role_desc=" + role_desc + "]";
	}
	
}

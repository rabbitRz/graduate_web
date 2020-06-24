package com.bruip.hr.bean;

public class enterprise_kind {
	private int id;
	private String enterprise;
	public int getId() {
		return id;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	@Override
	public String toString() {
		return "enterprise_kind [id=" + id + ", enterprise=" + enterprise + "]";
	}
	
}

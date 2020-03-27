package com.bruip.hr.bean;

import java.io.Serializable;

public class login_person implements Serializable {
	//默认为负数，若未查找到，则只需判断id
	private int id=-1;
	private String username;
	private String password;
	private int user_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "login [id=" + id + ", username=" + username + ", password=" + password + ", user_id=" + user_id + "]";
	}
	
}

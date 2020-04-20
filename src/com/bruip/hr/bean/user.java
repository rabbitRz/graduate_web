package com.bruip.hr.bean;

import java.io.Serializable;

public class user implements Serializable{
	//默认值为-1，若未找到，则为-1
	private int id=-1;
	private String username;//用户名
	private String password;//密码
	private String name;//姓名
	private String sex;//性别
	private String birth;//出生日期
	private String id_card;//身份证号
	private String phone;//电话号码
	private String email;//电子邮件
	private String credit_code;//公司信用代码
	private String position;//职位
	private int code;//是否成功注册，为1则成功，为0审核,为-1不通过
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCredit_code() {
		return credit_code;
	}
	public void setCredit_code(String credit_code) {
		this.credit_code = credit_code;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", sex="
				+ sex + ", birth=" + birth + ", id_card=" + id_card + ", phone=" + phone + ", email=" + email
				+ ", credit_code=" + credit_code + ", position=" + position + ", code=" + code + "]";
	}
	
}

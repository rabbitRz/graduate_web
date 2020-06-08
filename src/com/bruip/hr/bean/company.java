package com.bruip.hr.bean;

import java.io.Serializable;

public class company implements Serializable{
private int id;//编号
private String name;//公司名
private String icon;//公司图标
private String address;//公司地址
private int total_people;//总人数
private String introduction;//公司简介
private String build_time;//建立时间
private double total_value;//总价值
private String business;//业务范围
private String credit_code;//公司信用代码
private String enterprises;//企业类型
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getTotal_people() {
	return total_people;
}
public void setTotal_people(int total_people) {
	this.total_people = total_people;
}
public String getIntroduction() {
	return introduction;
}
public void setIntroduction(String introduction) {
	this.introduction = introduction;
}
public String getBuild_time() {
	return build_time;
}
public void setBuild_time(String build_time) {
	this.build_time = build_time;
}
public double getTotal_value() {
	return total_value;
}
public void setTotal_value(double total_value) {
	this.total_value = total_value;
}
public String getBusiness() {
	return business;
}
public void setBusiness(String business) {
	this.business = business;
}
public String getCredit_code() {
	return credit_code;
}
public void setCredit_code(String credit_code) {
	this.credit_code = credit_code;
}
public String getEnterprises() {
	return enterprises;
}
public void setEnterprises(String enterprises) {
	this.enterprises = enterprises;
}
@Override
public String toString() {
	return "company [id=" + id + ", name=" + name + ", icon=" + icon + ", address=" + address + ", total_people="
			+ total_people + ", introduction=" + introduction + ", build_time=" + build_time + ", total_value="
			+ total_value + ", business=" + business + ", credit_code=" + credit_code
			+ ", enterprises=" + enterprises + "]";
}


}

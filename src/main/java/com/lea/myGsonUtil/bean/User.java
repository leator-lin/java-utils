package com.lea.myGsonUtil.bean;

public class User {
	// 省略其它
	public String name;
	public int age;
	public String emailAddress;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public User(String name, int age, String emailAddress) {
		super();
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}

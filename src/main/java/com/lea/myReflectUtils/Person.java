package com.lea.myReflectUtils;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private Date birthday;
	private String face;
	private String hands;
	private String legs;
	private String body;

	public Person() {
		super();
	}
	
	public Person(String name, int age, String face, String hands, String legs, String body) {
		super();
		this.name = name;
		this.age = age;
		this.face = face;
		this.hands = hands;
		this.legs = legs;
		this.body = body;
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

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getHands() {
		return hands;
	}

	public void setHands(String hands) {
		this.hands = hands;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}

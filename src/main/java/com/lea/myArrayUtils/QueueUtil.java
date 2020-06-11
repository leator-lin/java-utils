package com.lea.myArrayUtils;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUtil {
	
	public static void main(String[] args) {		
		Queue<Customer> arrayDeque = new ArrayDeque<>(100);
		arrayDeque.add(new Customer());
		
		Queue<Customer> linkedList = new LinkedList<>();
		linkedList.add(new Customer());		
	}
	
	
	static class Customer {
		private String name;
		private String sex;
		private int age;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
}

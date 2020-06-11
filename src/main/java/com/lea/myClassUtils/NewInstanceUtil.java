package com.lea.myClassUtils;

public class NewInstanceUtil {
	public static void main(String[] args) {
		try {
			Person p = (Person) Class.forName("myClassUtils.Person").newInstance();
			System.out.println(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

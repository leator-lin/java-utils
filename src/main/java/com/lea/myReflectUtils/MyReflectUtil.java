package com.lea.myReflectUtils;

import java.lang.reflect.Constructor;

public class MyReflectUtil {
	public static void main(String[] args) {
		Class<Person> clazz = Person.class;
		Constructor[] ctors = clazz.getDeclaredConstructors();
		for(Constructor c : ctors) {
			System.out.println(c);
		}
	}
}

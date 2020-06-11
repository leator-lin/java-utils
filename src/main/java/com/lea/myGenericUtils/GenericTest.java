package com.lea.myGenericUtils;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("linyincheng");
		list.add(100);
		for(int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println("name: " + name);
		}
	}
}
package com.lea.myClassUtils;

import java.util.HashSet;
import java.util.Set;

public class GetComponentTypeUtil {
	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();
		list.add("林银城");
		list.add("林文弟");
		list.add("林琦");
		list.add("林子闻");
		list.add("黄锦辉");
		list.add("邝梓毅");
		
		/*String[] myList = (String[]) Array.newInstance(list.getClass().getComponentType(), 10);
		System.out.println(myList.length);*/
		
		
		/*String[] myArray = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			myArray[0] = list.get(i);
		}
		
		for(int j = 0; j < list.size(); j++) {
			
		}*/
		
		int[] array = new int[5];
		System.out.println(array.getClass().getComponentType());
	}
}

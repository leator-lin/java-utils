package com.lea.myArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayUtil {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("哈哈");
		arrayList.add("呵呵");
		arrayList.add("嘿嘿");
		
		arrayList.add("嘻嘻");
		
		Iterator<String> iterator = arrayList.iterator();		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("使用for each循环遍历集合");
		
		//jdk5以后，可以使用for each循环遍历集合
		for(String str : arrayList) {
			System.out.println(str);
		}
	}
}

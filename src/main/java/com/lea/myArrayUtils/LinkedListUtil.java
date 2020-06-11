package com.lea.myArrayUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListUtil {
	public static void main(String[] args) {
		List<String> staff = new LinkedList();
		staff.add("哈哈");
		staff.add("呵呵");
		staff.add("嘿嘿");
		staff.add("嘻嘻");
		
		Iterator<String> iterator = staff.iterator();		
		iterator.next();
		iterator.remove();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}
}

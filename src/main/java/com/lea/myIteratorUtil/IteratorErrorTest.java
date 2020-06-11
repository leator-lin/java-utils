package com.lea.myIteratorUtil;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("轻量版JavaEE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("疯狂Java讲义")) {
				books.remove(book);
			}
		}
	}
}

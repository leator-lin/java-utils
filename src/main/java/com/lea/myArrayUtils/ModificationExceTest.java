package com.lea.myArrayUtils;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 集合可以跟踪改写操作的次数，每个迭代器都维护一个独立的计数值，在每个迭代器方法的开始处检查
 * 自己改写操作的计数值是否与集合的改写操作计数值一致，如果不一致，就抛出一个ConcurrentModificationException异常
 */
public class ModificationExceTest {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("哈哈");
		arrayList.add("呵呵");
		arrayList.add("嘿嘿");		
		arrayList.add("嘻嘻");
		ListIterator<String> iterator1 = arrayList.listIterator();
		ListIterator<String> iterator2 = arrayList.listIterator();
		iterator1.next();
		iterator1.remove();
		iterator2.next();
	}
}

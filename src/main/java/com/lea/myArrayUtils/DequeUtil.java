package com.lea.myArrayUtils;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeUtil {
	public static void main(String[] args) {
		Deque<String> arrayDeque = new ArrayDeque<>(2);
		arrayDeque.add("林银城");
		arrayDeque.add("林晓丹");
		arrayDeque.add("林晓敏");
		arrayDeque.add("林艺璇");
		arrayDeque.add("林鸿城");
		System.out.println(arrayDeque.toString());
	}
}

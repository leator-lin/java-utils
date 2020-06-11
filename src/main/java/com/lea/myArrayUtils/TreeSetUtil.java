package com.lea.myArrayUtils;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUtil {
	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<>();
		parts.add(new Item("三", 3));
		parts.add(new Item("一", 1));
		parts.add(new Item("二", 2));
		System.out.println(parts);
		
		SortedSet<Item> sortByPartNumber = new TreeSet<>(
			new Comparator<Item>() {
				public int compare(Item a, Item b) {
					String numA = a.getDescription();
					String numB = b.getDescription();
					return numA.compareTo(numB);
				}
			}
		);
		
		sortByPartNumber.addAll(parts);
		System.out.println(sortByPartNumber);
	}
}

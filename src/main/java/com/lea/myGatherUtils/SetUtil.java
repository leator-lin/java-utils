package com.lea.myGatherUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 读取一个文本，然后将文本中的文字读取进散列集合中，并计算操作总时间
 * 
 * @author Administrator
 *
 */
public class SetUtil {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		long totalTime = 0;
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime = callTime;
		}
		
		Iterator<String> iter = words.iterator();
		for(int i = 1; i < 20 && iter.hasNext(); i++) {
			System.out.println(iter.next());
		}
		System.out.println("...");
		System.out.println(words.size() + " distinct words. " + totalTime + "milliseconds.");
	}
}

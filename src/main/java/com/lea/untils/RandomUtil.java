package com.lea.untils;

import java.util.Random;

public class RandomUtil {
	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());  
		System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));  
	}
}

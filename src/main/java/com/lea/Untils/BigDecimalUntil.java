package com.lea.Untils;

import java.math.BigDecimal;

/**
 * BigDecimal类主要是java中用来实现浮点类型值的常规算术运算的
 * 
 * @author lea
 *
 */
public class BigDecimalUntil {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal(0.001);
		BigDecimal bd2 = new BigDecimal(0.00002);
		System.out.println(bd1.add(bd2));
		
		//如果要用double浮点数作为BigDecimal构造器的参数时，不要直接new BigDecimal(0.1)，要用下面的方法来创建	
		BigDecimal bd3 = BigDecimal.valueOf(0.001);
		BigDecimal bd4 = BigDecimal.valueOf(0.00002);
		System.out.println(bd3.add(bd4));
		
		/*
		 * 浮点数的加减乘除
		 */
		BigDecimal number1 = new BigDecimal("0.01");
		BigDecimal number2 = new BigDecimal("0.02");
		System.out.println(number1.add(number2));
		System.out.println(number1.subtract(number2));
		System.out.println(number1.multiply(number2));
		System.out.println(number1.divide(number2));
	}
}

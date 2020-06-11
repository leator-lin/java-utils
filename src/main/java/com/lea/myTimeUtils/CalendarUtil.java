package com.lea.myTimeUtils;

import java.util.Calendar;

/**
 * 静态导入了Calendar类里面的所有类变量，所以
 * @author Administrator
 *
 */
public class CalendarUtil {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
//		cal.set(2003, 7, 31);
//		
//		cal.set(Calendar.MONTH, 8);
//		System.out.println(cal.getTime());
//		
//		cal.set(Calendar.DATE, 5);
//		System.out.println(cal.getTime());
	}
}

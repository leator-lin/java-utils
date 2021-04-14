package com.lea.untils;


import org.junit.Test;

public class EqualsUtil {
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		
		if(object instanceof EqualsUtil) {
			return true;
		}
		
		return false;
	}
	
	@Test
	public void equalsUtilTest() {
		EqualsUtil eql1 = new EqualsUtil();
		EqualsUtil eql2 = new EqualsUtil();
		System.out.println(eql1.equals(eql2));
	}
}

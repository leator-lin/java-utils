package com.lea.myArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class Snippet {
	public static void main(String[] args) {
	    List<String> sourceList = new ArrayList<String>() {{
	        add("H");
	        add("O");
	        add("L");
	        add("L");
	        add("I");
	        add("S");
	    }};
	
	    List subList = sourceList.subList(2, 5);
	
	    System.out.println("sourceList: " + sourceList);
	    System.out.println("sourceList.subList(2, 5) 得到List ：");
	    System.out.println("subList: " + subList);
	
	    subList.set(1, "666");
	
	    System.out.println("subList.set(3,666) 得到List ：");
	    System.out.println("subList: " + subList);
	    System.out.println("sourceList: " + sourceList);
	
	}
}


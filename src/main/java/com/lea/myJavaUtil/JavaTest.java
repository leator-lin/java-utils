package com.lea.myJavaUtil;

public class JavaTest {
	/*public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("3838383883");
		list.add("29292929292");
		list.add("49944949");
		for(int i = 0; i < list.size(); i++) {
			list.set(i, "'" + list.get(i) + "'");
		}
		System.out.println(list.toString().replace("[","").replace("]",""));
	}*/
	/*public static void main(String[] args) {
		int startYear = 2014;
		int year = 10;
		
		//String sql = "select FIXED_ASSETS_ from EC_NEW_ARGUMENT"
		int[] years = new int[2+year];
		
		//通过开始年份和使用期限来生成一个年份数组
		for(int i = 0; i < years.length; i++) {
			years[i] = startYear++;
		}
		
		for(int i = 0; i < years.length; i++) {
			System.out.println(years[i]);
		}
	}*/
	/*public static void main(String[] args) {
		char i = 'G';
		char j = 'H';
		System.out.println((int)i);
		System.out.println((int)j);
	}*/
	public static void main(String[] args) {
		String testUrl = "http://30.118.51.247:80/1/1029/3001/default/134213412341234.wav";
		System.out.println(testUrl.substring(testUrl.lastIndexOf("/") + 1));
	}
}

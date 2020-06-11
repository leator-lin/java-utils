package com.lea.myGatherUtils;

import java.util.HashMap;
import java.util.Map;

public class MapIgnoreCaseUtil {
	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("ZHANGSAN", "1");
		map1.put("LISI", "2");
		map1.put("wangwu", "3");
		map1.put("zhaoliu", "4");
		System.out.println(map1.get("zhangsan"));
	}
}

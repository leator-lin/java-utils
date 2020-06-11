package com.lea.myGatherUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		Collection<String> valueList = new ArrayList<String>();
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("zhangsan", "1");
		map1.put("lisi", "2");
		map1.put("wangwu", "3");
		map1.put("zhaoliu", "4");
		Map<String,String> map2 = new HashMap<String,String>();
		map1.put("zhangsan", "11");
		map1.put("lisi", "21");
		map1.put("wangwu", "31");
		map1.put("zhaoliu", "41");
		list.add(map2);
		for(Map<String,String> m : list) {
			valueList = m.values();
		}
	}
}

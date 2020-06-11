package com.lea.myGatherUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "fds");
		map.put("2", "valu");
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(map);
		for (Map<String, String> m : list) {
			for (String k : m.keySet()) {
				System.out.println(k + " : " + m.get(k));
			}

		}
	}
}

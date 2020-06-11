package com.lea.myGsonUtil;


import com.google.gson.Gson;
import com.lea.myGsonUtil.bean.User;

public class GsonUtil {
	public static void main(String[] args) {
		Gson gson = new Gson();
		int i = gson.fromJson("100", int.class);
		//double d = gson.fromJson("\"99.99\"", double.class);
		double d = gson.fromJson("99.99", double.class);
		boolean b = gson.fromJson("true", boolean.class);
		String str = gson.fromJson("String", String.class);
		System.out.println(i + " " + d + " " + b + " " + str);
		
		//POJO类的生成与解析
		User user = new User("怪盗kidou", 24);
		String jsonObject = gson.toJson(user);
		System.out.println(jsonObject);
		
		String jsonString = "{\"name\":\"怪盗kidou\",\"age\":24}";
		User user1 = gson.fromJson(jsonString, User.class);
	}
}

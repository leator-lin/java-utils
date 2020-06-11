package com.lea.myJavaUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CodeUtil {
	public static void main(String[] args) {
		String s = "我爱你！也爱自己！";
		try {
			s = URLEncoder.encode(s, "UTF-8");
			System.out.println(s);
			s = URLDecoder.decode(s, "UTF-8");
			System.out.println(s);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

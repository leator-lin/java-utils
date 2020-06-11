package com.lea.myLoaderUtils;

public class ClassLoaderUtil {
	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		cl.loadClass("myLoaderUtils.Tester");
		System.out.println("系统加载Tester类");
		Class.forName("myLoaderUtils.Tester");
	}
}

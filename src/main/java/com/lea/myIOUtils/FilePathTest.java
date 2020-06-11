package com.lea.myIOUtils;

import java.io.File;
import java.io.IOException;

public class FilePathTest {
	public static void main(String[] args) {
		File file = new File("..//Tomcat 7.0//webapps//gedi//Dw_plugin//excel_Test//show.xls");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

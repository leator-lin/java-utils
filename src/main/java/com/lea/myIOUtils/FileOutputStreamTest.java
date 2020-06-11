package com.lea.myIOUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("D:\\xml.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

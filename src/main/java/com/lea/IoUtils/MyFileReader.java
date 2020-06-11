package com.lea.IoUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 该程序是用来读取一个文件并将这个文件的内容打印出来
 * 
 * @author Administrator
 *
 */
public class MyFileReader {
	public static void main(String[] args) throws IOException {
		// inputStreamMethod();
		readerMethod();
	}

	public static void readerMethod() throws IOException {
		FileReader fr = new FileReader("./src/IoUtils/MyFileReader.java");
		char[] cbuf = new char[32];
		int hasRead = 0;
		while ((hasRead = fr.read(cbuf)) > 0) {
			System.out.println(new String(cbuf, 0, hasRead));
		}
	}

	public static void inputStreamMethod() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("./src/IoUtils/MyFileReader.java");
		byte[] bbuf = new byte[1024];
		int hasRead = 0;
		while ((hasRead = fis.read(bbuf)) > 0) {
			System.out.print(new String(bbuf, 0, hasRead));
		}
		fis.close();
	}
}

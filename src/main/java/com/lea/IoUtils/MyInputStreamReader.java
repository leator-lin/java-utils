package com.lea.IoUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 该程序是用来使用BufferedReader的readLine方法的，
 * 可以用这个程序来读取一个文件里面的内容
 * 
 * @author Administrator
 *
 */
public class MyInputStreamReader {
	public static void main(String[] args) {
		//使用控制台输入
		InputStreamReader reader = new InputStreamReader(System.in);
		//将Reader包装成BufferedReader
		BufferedReader br = new BufferedReader(reader);
		
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				if(line.equals("exit")) {
					System.exit(1);
				}
				System.out.println("输入内容为：" + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

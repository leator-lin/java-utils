package com.lea.myIOUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class NewFloder {
	public static void main(String[] args) {
		File file = new File("E://BB啥");
		boolean b=file.mkdirs();
		System.out.println(b);
		try {
			FileOutputStream file1 = new FileOutputStream(file+"//效益计算结果表.xls");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

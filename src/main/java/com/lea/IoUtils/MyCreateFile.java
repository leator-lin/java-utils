package com.lea.IoUtils;

import java.io.File;
import java.io.IOException;

/**
 * 该类是用来创建和删除一个任意类型的文件的！
 * 
 * @author Administrator
 *
 */
public class MyCreateFile {
	public static void main(String[] args) {
		File file1 = new File("D://file.txt");
		File file2 = new File("D://file.doc");
		File file3 = new File("D://file.xls");
		File file4 = new File("D://file.xlsx");
		file1.deleteOnExit();
		try {
			boolean file11 = file1.createNewFile();
			boolean file22 = file2.createNewFile();
			boolean file33 = file3.createNewFile();
			boolean file44 = file4.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

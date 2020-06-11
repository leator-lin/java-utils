package com.lea.myIOUtils.test;

import com.lea.myIOUtils.DBToXml;

public class DBToXmlTest {
	public static void main(String[] args) {
		try {
			DBToXml.exportDataToXMlFile("Platform_nbpm", "dbo.G003_ht_kk");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

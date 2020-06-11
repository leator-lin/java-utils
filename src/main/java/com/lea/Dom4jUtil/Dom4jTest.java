package com.lea.Dom4jUtil;

import java.net.URL;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

public class Dom4jTest {
	public static void main(String[] args) {
		URL xmlpath =  Dom4jTest.class.getClassLoader().getResource("applicationContext.xml");
		System.out.println(xmlpath);
	}
	
	private void readXML(String filename) {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		
		URL xmlpath = this.getClass().getClassLoader().getResource(filename);
	}
}

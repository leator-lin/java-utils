package com.lea.myPropertiesUtil;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	private static Properties prop = new Properties();

	static {
		try {
			prop.load(PropertiesUtil.class.getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String CONNECTION_TYPE = prop.getProperty("conn_type");
	public static String CONNECTION_URL = prop.getProperty("conn_url");
	public static String CONNECTION_USER = prop.getProperty("conn_user");
	public static String CONNECTION_PWD = prop.getProperty("conn_pwd");
	public static String CONNECTION_DRIVER = prop.getProperty("conn_driver");
}

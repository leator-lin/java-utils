package com.lea.myJDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnUtil {
	private final static String driver = "oracle.jdbc.OracleDriver";
	private final static String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private final static String username = "mdm";
	private final static String password = "mdm123";
	
	public static void main(String[] args) {
		String sql = "select * from code_set_data_view";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

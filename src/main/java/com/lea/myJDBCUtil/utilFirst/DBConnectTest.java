package com.lea.myJDBCUtil.utilFirst;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectTest {
	public static void main(String[] args) {
		String condition = "select addid,type,coin,datetime from buy.add where USERID =1";
		Statement sql;
		try {
			Connection conn = DBConnect.getConnection();
			sql = conn.createStatement();
			ResultSet rs = sql.executeQuery(condition);
			String num0 = rs.getString(1);
			System.out.println("num0--------" + num0);
			String num1 = rs.getString(2);
			System.out.println("num1--------" + num1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

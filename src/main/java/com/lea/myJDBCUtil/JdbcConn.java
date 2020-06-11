package com.lea.myJDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConn {
	public static void main(String[] args) throws Exception {
		//1，加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2，使用DriverManager获取数据库连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myutils?characterEncoding=utf8&useSSL=true", "root", "1234");
		
		//3，使用Connection来创建一个Statement对象
		Statement stmt = conn.createStatement();
		
		//4，执行sql语句
		//5，执行增删改查操作
		
		int result = stmt.executeUpdate("insert into user(id,username,password) values (4,1,1)");
		int result2 = stmt.executeUpdate("delete from user where id = 2");
		int result3 = stmt.executeUpdate("update user set id = 2 where id = 3");
		ResultSet rs = stmt.executeQuery("select * from user");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "-------" + rs.getString(2) + "---------" + rs.getString(3));
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
}

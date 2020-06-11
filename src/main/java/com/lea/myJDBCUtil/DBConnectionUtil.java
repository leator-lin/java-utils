package com.lea.myJDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionUtil {
	/**
	 * 驱动
	 */
	//连接mysql
	//private String DRIVER = "com.mysql.jdbc.Driver";
	private String DRIVER = "net.sourceforge.jtds.jdbc.Driver";

	/**
	 * 链接
	 */
	private String URL = "jdbc:jtds:sqlserver://127.0.0.1:1433/Platform_nbpm?useUnicode=true&characterEncoding=UTF-8";

	/**
	 * 用户名
	 */
	private String USER = "sa";

	/**
	 * 密码
	 */
	private String PWD = "1234";

	Connection conn = null;

	PreparedStatement sta = null;

	ResultSet res = null;

	public DBConnectionUtil() {

	}

	/**
	 * 连接数据库
	 */
	public Connection getConnection(String url) {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, USER, PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭数据库,释放内存
	 */
	public void close() {
		try {
			if (res != null) {
				res.close();
			}
			if (sta != null) {
				sta.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

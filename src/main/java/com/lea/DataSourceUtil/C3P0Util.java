package com.lea.DataSourceUtil;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 该类是讲解如何使用C3P0连接池的
 * 所涉及的jar包：
 * 1，c3p0-0.9.5.2.jar
 * @author Administrator
 *
 */
public class C3P0Util {
	public static void main(String[] args) throws Exception {
		//创建连接池实例
		ComboPooledDataSource ds = new ComboPooledDataSource();
		//设置连接池连接数据库所需的驱动
		ds.setDriverClass("com.mysql.jdbc.Driver");
		//设置连接数据库的URL
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/myutils");
		//设置连接数据库的用户名
		ds.setUser("root");
		//设置连接数据库的密码
		ds.setPassword("1234");
		//设置连接池的最大连接数
		ds.setMaxPoolSize(40);
		//设置连接池的最小连接数
		ds.setMinPoolSize(2);
		//设置连接池的初始连接数
		ds.setInitialPoolSize(10);
		//设置连接池的缓存Statement的最大数
		ds.setMaxStatements(180);
	}
}

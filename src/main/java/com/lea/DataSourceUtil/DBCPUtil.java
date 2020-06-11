package com.lea.DataSourceUtil;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 这个类是用来讲解如何使用DBCP数据源的
 * 所涉及的jar包：
 * 1，commons-dbcp.jar
 * 2，commons-pool.jar
 * 
 * @author Administrator
 *
 */
public class DBCPUtil {
	public static void main(String[] args) {
		//创建数据源对象
		BasicDataSource ds = new BasicDataSource();
		//设置连接池所需的驱动
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		//设置连接数据库的URL
		ds.setUrl("jdbc:mysql://localhost:3306/myutils");
		//设置连接数据库的用户名
		ds.setUsername("root");
		//设置连接数据库的密码
		ds.setPassword("1234");
		//设置连接池的初始连接数
		ds.setInitialSize(5);
		//设置连接池最多可有多少个活动连接数
		ds.setMaxActive(20);
		//设置连接池中最少有2个空闲的连接
		ds.setMinIdle(2);
	}
}

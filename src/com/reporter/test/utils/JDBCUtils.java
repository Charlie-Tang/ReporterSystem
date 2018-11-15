package com.reporter.test.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	
	//自动会去classpath目录下加载cp30的配置文件
	private static DataSource dataSource = new ComboPooledDataSource();

	public static DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * 当DBUtils需要手动控制事务时，调用该方法获得一个连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
//	test
//	public static void main(String args[]) throws SQLException
//	{
//		System.out.println(dataSource.getConnection());
//	}
}
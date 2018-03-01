package com.zz.bookmanager.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类
 * 
 * @author zhangzhe
 *
 */
public class DbUtil {
	private static String DB_URL = "jdbc:mysql://localhost/db_book";
	private static String DB_USER_NAME = "root";
	private static String DB_PASSWORD = "123456";
	private static String JDBC_DRIVER_NAME = "com.mysql.jdbc.Driver";

	public Connection getConn() throws Exception {
		Class.forName(JDBC_DRIVER_NAME);
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);
		return conn;
	}
	
	public void closeConn(Connection conn) throws Exception {
		if(conn != null) {
			conn.close();
		}
	}
	
	
	public static void main(String[] args)  {
		DbUtil dbutil = new DbUtil();
		try {
			Connection  conn = dbutil.getConn();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

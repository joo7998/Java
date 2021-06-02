package com.javaex.jdbc.oracle;

import java.sql.*;

public class DBConfig {
	public static String DBURL = "jdbc:oracle:thin:@localhost:1521/orcl";
	// REMEMBER REMEMBER REMEMBER ! NOT 1521:orcl
	public static String DBUSER = "hr";
	public static String DBPASS = "hr";
	
	static Connection getConnection() throws SQLException {	//	default 접근자
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (ClassNotFoundException e) {
			System.err.println("Fail to load driver!");
		}
		
		return conn;
	}
}

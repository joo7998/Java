package com.javaex.jdbc.oracle;

import java.sql.*;	//	JDBC API

public class ConnectionTest {
	
	public static void main(String[] args) {
		String dbuser = "hr";
		String dbpass = "hr";
		Connection conn = null;
		
		try {
			// Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//	Connection 생성
			conn = DriverManager.getConnection(DBConfig.DBURL,	//	db 접속 url
												dbuser,
												dbpass);
			System.out.println(conn);
			System.out.println("Connected!");
		} catch (ClassNotFoundException e) {
			System.err.println("Fail to load driver!");
		} catch (SQLException e) {
			System.err.println("SQLError!");
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
package com.homestay.korea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DatabaseTests {
	
	private static final Logger logger = LoggerFactory.getLogger(DatabaseTests.class);
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
	public Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://�ּ�";
			String user = "���̵�";
			String pwd = "�н�����";

			con = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	@Test
	public void testConnection() {
		Connection conn = getCon();
		logger.info(conn.toString());
	}
}	





















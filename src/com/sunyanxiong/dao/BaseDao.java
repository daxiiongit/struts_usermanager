package com.sunyanxiong.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 数据库连接基类，用于连接数据库和关闭对象
public class BaseDao {

	// 连接数据库
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "sunyanxiong");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	// 关闭对象方法后先创建使用的对象，先关闭
	public void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close(); // 关闭建立连接对象
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

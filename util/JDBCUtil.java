package com.dianchi.ruanjian.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/store";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";
	//������
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//��ȡ����
	public static Connection getConnection(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	//�ͷ���Դ
	public static void closeZiYuan(ResultSet rs,Statement s,Connection con){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(s != null){
			try {
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

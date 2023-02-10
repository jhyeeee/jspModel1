package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver를 찾지 못했습니다");
		}
	}
	
	public static Connection getConnection() {
		// 현재 db 주소, 계정명, 비밀번호
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection하지 못했습니다");
		} 
		return conn;
	}
	
	

}

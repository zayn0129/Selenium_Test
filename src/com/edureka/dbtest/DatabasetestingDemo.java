package com.edureka.dbtest;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;





import java.sql.Connection;
import java.sql.DriverManager;


public class DatabasetestingDemo {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/sys";
	
	static final String JDBC_USER = "root";
	static final String JDBC_PASS = "Humana@2022";
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,"root", "Humana@2022");
			System.out.println("Creating Statement");
			stmt =  conn.createStatement();
			String sql;
			sql = "SELECT idemployees,age,first,last FROM sys.Employees";
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
		int idemployees = rs.getInt("idemployees");
		int age = rs.getInt("age");
		String first = rs.getString("first");
		String last = rs.getString("last");
		
		System.out.print("ID: " + idemployees);
		System.out.print(", Age: " + age);
		System.out.print(", First: " + first);
		System.out.println(", Last: " + last);
		}
		rs.close();
		stmt.close();
		conn.close();
		
				
		} catch (SQLException se) {
			
			se.printStackTrace();
			
			// TODO: handle exception
		}
		
		catch (Exception e) {
			e.printStackTrace();
			
			// TODO: handle exception
		}
		finally {
		try {
			if (conn!=null)
			conn.close();{
				
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("Goodbye!");
		
			
		}
		
		
		// TODO Auto-generated method stub

	}

}

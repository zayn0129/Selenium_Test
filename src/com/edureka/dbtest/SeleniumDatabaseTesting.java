package com.edureka.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SeleniumDatabaseTesting {

		static Connection con = null;
		private static Statement stmt;
	
		
		static final String DB_URL = "jdbc:mysql://localhost/sys";
		
		public static  String JDBC_USER = "root";
		public static  String JDBC_PASS = "Humana@2022";
		
		
		@BeforeTest
		
		public  void Setup()throws Exception {
			
		
		try {
				String dbClass = "com.mysql.cj.jdbc.Driver";
				Class.forName(dbClass).newInstance();
				
				Connection con = DriverManager.getConnection(DB_URL,JDBC_USER, JDBC_PASS);
				System.out.println("Creating Statement");
				stmt =  con.createStatement();
				}
		
				catch (Exception e) {
				
				e.printStackTrace();
				}
		}
		@Test
		
		public void test() {
			try {
				String query = "select * from sys.Employees";
				ResultSet res = stmt.executeQuery(query);
				
				while (res.next()) {
					
					System.out.print(res.getString(1));
					System.out.print("\t"+res.getString(2));
					System.out.print("\t"+res.getString(3));
					System.out.println("\t"+res.getString(4));
				}
				}
				catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		@AfterTest
		public void tearDown() throws Exception{
			if (con != null) {
				con.close();
				
			}
				
				
				
				
				
			}
		}

		
				
			
			
			
			// TODO Auto-generated method stub

		

	




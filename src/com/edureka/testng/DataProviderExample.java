package com.edureka.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
	@Test(dataProvider="getData")

	public void setData(String username, String password) {
		System.out.println("your username is:"+username);
		System.out.println("your password is:"+password);
		
		// TODO Auto-generated method stub

	}
	
	@DataProvider
	public Object[][]getData()
	{
		Object[][]data=new Object[3][2];
		data[0][0]="user1";
		data[0][1]="abcdef";
		
		data[1][0]="user2";
		data[1][1]="xyz";
		
		data[2][0]="user3";
		data[2][1]="12345";
		
		
		return data;
		
	}
	

}

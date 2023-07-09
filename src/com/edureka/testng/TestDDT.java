package com.edureka.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestDDT {
	
	@Test(dataProvider="testdata")

	public void TestFireFox(String uname, String password) {
		System.setProperty("webdriver.edge.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/edgedriver/msedgedriver");
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		
		}
	
	@DataProvider(name="testdata")
	public  Object[][]TestDataFeed() {
		Object [] [] facebookdata= new Object [2][2];
		facebookdata [0][0]="username1@gmail.com";
		facebookdata [0] [1]="Password1";
		facebookdata [1] [0] = "username2@gmail.com";
		facebookdata [1] [1] = "Password2";
		return facebookdata;
		
	}
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}



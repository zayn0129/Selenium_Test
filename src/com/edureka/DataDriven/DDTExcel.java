package com.edureka.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DDTExcel {
	ChromeDriver driver;
	
	@Test(dataProvider="testdata")
	
	public void Demoproject(String username, String password) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("United States (English"));
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys(username);
	

		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.linkText("Log In")).click();
		
		
		
		Thread.sleep(3000);
		
		Assert.assertTrue(driver.getTitle().matches(""), "");
		}
	@AfterMethod
	
	
	
	@DataProvider(name="testdata")
	
	public Object [] [] TestDataFeed(){
		
		ReadExcelFile config = new ReadExcelFile("/Users/zaynnuritdin/Documents/Excel//DataSheet.xlsx");
		
		int rows = config.getRowCount(0);
		Object [] [] credentials = new Object [rows][2];
		for (int i = 0; i < rows; i++) {
			credentials [i][0]=config.getData(0, i, 0);
			credentials [i][1]=config.getData(0, i, 1);
			
			
			
		}
		return credentials;
		
		
		
	}
	
	

	
	


}

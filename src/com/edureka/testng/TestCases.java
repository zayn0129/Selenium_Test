package com.edureka.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@Test
@Listeners(ListenerTest.class)

public class TestCases {
	
	public WebDriver driver;

	public  void Login() throws InterruptedException {
		
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://edureka.co/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@aria-label='Enter Course, Category or keyword']")).click();
		driver.findElement(By.cssSelector("#search-input")).sendKeys("Test Automation Engineer Masters Program");
		driver.findElement(By.xpath("//span//li[3]//a[1]")).click();
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(4000);}
	
	
	@Test
			
		public void TestToFail() {
			System.out.println("This method is fail");
			Assert.assertTrue(false);
			
		}
		// TODO Auto-generated method stub

	}



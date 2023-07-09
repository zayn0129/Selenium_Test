package com.edureka.HybridFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Actions {

	public static WebDriver driver;

	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		// TODO Auto-generated method stub

	}
	
	public static void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
	
	public static void input_Username() {
		driver.findElement(By.name("")).sendKeys("");
		
		
	}
	
	public static void input_Password() {
		driver.findElement(By.name("")).sendKeys("");
		
	
	}
	
	public static void click_Login() throws InterruptedException {
		driver.findElement(By.name(""));
		Thread.sleep(3000);
		
	}
	
	public static void verify_login() {
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "");
		
	}
	
	public static void closeBrowser() {
		driver.quit();
		
	}
	
	

}

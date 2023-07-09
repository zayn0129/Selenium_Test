package com.edureka.projectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingAllControls {
	
	
	static WebDriver driver;
	
@Test (priority = 0)
	public static void EdurekaProfile() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.edureka.co/");
	try {
		Thread.sleep(3000);
	}
	
	catch (InterruptedException e) {
		e.printStackTrace();
		driver.findElement(By.linkText("Log In")).click();
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
			Actions actions = new Actions(driver);
			Thread.sleep(3000);
			actions.click();
			actions.sendKeys("zayn.nuritdin2gmail.com");
			Thread.sleep(3000);
			actions.build().perform();
			actions.moveToElement(driver.findElement(By.id("si_popup_email")));
			Thread.sleep(3000);
			actions.build().perform();
			actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
			Thread.sleep(3000);
			actions.click();
			actions.sendKeys("1234567a");
			Thread.sleep(3000);
			actions.build().perform();
			actions.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
			Thread.sleep(3000);
			actions.click();
			actions.build().perform();
			
			
			
			
			
			
			
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
		
		
		// TODO Auto-generated method stub

	}

}

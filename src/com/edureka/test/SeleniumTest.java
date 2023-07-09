package com.edureka.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://www.gmail.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("zayn.nuritdin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(1000);
		
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if (at.equalsIgnoreCase(et)) {
			System.out.println("Test Success");
		}
		else
		{
			System.out.println("Test Failed");
		}
			
	}

}

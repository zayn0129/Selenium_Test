package com.edureka.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExamples {

	public String baseUrl = "https://www.edureka.co/";
	String driverPath = "/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver";
	public WebDriver  driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching the Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Instructor-Led Online Training with 24x7 Lifetime Support | Edureka";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.close();}
	
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	

	}



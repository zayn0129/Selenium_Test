package com.edureka.testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example {
public String baseUrl = "https://www.edureka.co/";
String driverPath = "/Users/zaynnuritdin/eclipse-workspace/Selenium/edgedriver/msedgedriver";
public WebDriver  driver;

@Test

public void verifyHomepageTitle(){
	System.out.println("Launching the Edge Browser");
	System.setProperty("webdriver.edge.driver", driverPath);
	driver = new EdgeDriver();
	driver.get(baseUrl);
	String expectedTitle = "Instructor-Led Online Training with 24x7 Lifetime Support | Edureka";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.close();
	
}

}

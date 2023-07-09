package com.edureka.jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumYoutubeDemo {
	
	@Test 

	public static void JenkinsTest() {
		
		System.setProperty("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("field-keywords")).sendKeys("jackets");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().back();
		String title =driver.getTitle();
		System.out.println("Page tiltle is:-"+ title);
		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("zayni29011989@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Humana2022");
		driver.findElement(By.linkText("Log In")).click();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
		
	
		
		
		// TODO Auto-generated method stub

	}

}

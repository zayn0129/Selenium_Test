package com.edureka.locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		WebElement google=driver.findElement(By.xpath("//input[@name='q']"));
		google.sendKeys("yahoo.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.name("btnK"));
		search.click();
		
		WebElement className =driver.findElement(By.xpath("//div[contains(@class,'Tbw')]"));
		className.click();
		Thread.sleep(4000);
		WebElement linkText =driver.findElement(By.xpath("//*[text()='Sign in']"));
		linkText.click();
		Thread.sleep(4000);
		WebElement cssSelector =driver.findElement(By.xpath("//input[starts-with(@id,'login-username')]"));
		cssSelector.sendKeys("nozimanabieva@yahoo.com");
		Thread.sleep(4000);
		WebElement loginId =driver.findElement(By.id("login-signin"));
		loginId.click();
		WebElement passwordId =driver.findElement(By.id("login-passwd"));
		passwordId.sendKeys("Humana@2022");
		WebElement passwordName =driver.findElement(By.className("pure-button"));
		passwordName.click();		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
//		WebElement linkText = driver.findElement(By.linkText("Forgot username?"));
//		linkText.click();

	}

		

}



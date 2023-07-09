package com.edureka.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		System.setProperty
		("webdriver.gecko.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
//		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
//		WebElement firstname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
//		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
//		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
//		sendKeys(driver, firstname, 10, "Zayn");
//		sendKeys(driver, lastname, 10, "Nuritdin");
//		sendKeys(driver, password, 10, "Humana2021");
		WebElement forgotPassword = driver.findElement(By.xpath("//div[3]//a[1]"));
		clickOn(driver, forgotPassword, 10);
		
	}
		public static void sendKeys(WebDriver driver1, WebElement element, int timeout,String value) {
			new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		
	}
		public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
			new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		
	}
}

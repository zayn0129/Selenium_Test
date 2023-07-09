package com.edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) throws InterruptedException {
System.setProperty
("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
WebDriver driver= new ChromeDriver();

driver.get("https://www.amazon.com/");
Thread.sleep(1000);

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
Thread.sleep(1000);

driver.findElement(By.className("nav-search-submit-text")).click();
Thread.sleep(1000);

driver.navigate().to("https://account.humana.com/");
Thread.sleep(1000);

driver.manage().window().maximize();
Thread.sleep(1000);

driver.navigate().back();
driver.quit();





	}

}

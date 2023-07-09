package com.edureka.alert;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	
		driver.get("http://www.gmail.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.mouseMove(500, 4);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	


}

package com.edureka.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement SourceElement = driver.findElement(By.id("draggable"));
		WebElement TargetElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions (driver);
		Thread.sleep(3000);
		action.dragAndDrop(SourceElement, TargetElement).build().perform();
		Thread.sleep(3000);
		driver.quit();
		
				
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

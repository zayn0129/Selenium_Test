package com.edureka.exceptions;






import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExceptions {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		
		
		try {
			driver.findElement(By.name("fake")).click();
			
		} catch (NoSuchElementException e1){
			
					System.out.println("element is not found");
					System.out.println("hello");
		}
		
		System.out.println("hello");
		
		// TODO Auto-generated method stub

	}

}

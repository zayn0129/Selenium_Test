package com.edureka.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty
		("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
	
		driver.get("http://www.ebay.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		Actions builder = new Actions (driver);
		
		builder.moveToElement(driver.findElement(By.className("hl-cat-nav__expander"))).build().perform();
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > div.hl-cat-nav__flyout > div.hl-cat-nav__rtm > div > map > area"));	
		driver.findElement(By.xpath("//area[@alt='Your one-stop auto shop for parts, vehicles, and more']")).click();
		builder.moveToElement(link).build().perform();
		Thread.sleep(1000);
		WebElement act = driver.findElement(By.cssSelector("#gh-ac"));
		builder.moveToElement(act).build().perform();
		Thread.sleep(1000);
		WebElement search =driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(1000);
		Action seriesOfActions;
		seriesOfActions = builder
		.sendKeys(act,"motor")
		.keyDown(search,Keys.SHIFT)
		.keyUp(search,Keys.SHIFT)
		.build();
		seriesOfActions.perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

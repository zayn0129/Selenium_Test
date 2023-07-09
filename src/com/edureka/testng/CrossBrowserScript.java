package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserScript {

	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	
public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/geckodriver/geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/chromedriver/chromedriver");
			driver = new ChromeDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","/Users/zaynnuritdin/eclipse-workspace/Selenium/edgedriver/msedgedriver");
			driver = new EdgeDriver();}
		
		else {
			throw new Exception("Browser is not correct");
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void testParameterWithXML() throws InterruptedException {
		
		driver.get("https://www.edureka.co");
		WebElement Login =driver.findElement(By.xpath("//span[@data-gi-action='Login']"));
		Thread.sleep(4000);
		Login.click();
		WebElement userName = driver.findElement(By.xpath("//input[@id='si_popup_email']"));
		userName.sendKeys("zeromax0129@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='si_popup_passwd']"));
		Thread.sleep(4000);
		password.sendKeys("1234567a");
		WebElement Next = driver.findElement(By.xpath("//form[@action='/users/signin']//button"));
		Next.click();
		Thread.sleep(4000);
		
		
		// TODO Auto-generated method stub

	}

}

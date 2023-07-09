package com.edureka.uiPacakage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightFinderPage {
	
	WebDriver driver;
	

	public FlightFinderPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement roundTrip;
	
	@FindBy(how = How.XPATH,using = "" )
	@CacheLookup
	WebElement onewayTrip;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement passCount;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement fromPort;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement fromMonth;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup 
	WebElement fromDay;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement toPort;
	
	@FindBy (how = How.XPATH,using = "")
	@CacheLookup
	WebElement toMonth;
	
	@FindBy (how = How.XPATH,using = "")
	@CacheLookup
	WebElement toDay;
	
	@FindBy (how = How.XPATH,using = "" )
	@CacheLookup
	WebElement airline;
	
	@FindBy (how = How.XPATH,using = "")
	@CacheLookup
	WebElement findflights;
	
	@FindBy (how = How.XPATH,using = "")
	@CacheLookup
	WebElement serviceClass;
	
	public void continueWordPress(String pCount,String fPort,String fMonth, String fDay, String tPort, String tMonth, String tDay, String serClass, String aline) 
	{
	try {
		Thread.sleep(3000);
		roundTrip.click();
		Thread.sleep(3000);
		passCount.sendKeys(pCount);
		Thread.sleep(3000);
		fromPort.sendKeys(fPort);
		Thread.sleep(3000);
		fromMonth.sendKeys(fMonth);
		Thread.sleep(3000);
		fromDay.sendKeys(fDay);
		Thread.sleep(3000);
		toPort.sendKeys(tPort);
		Thread.sleep(3000);
		toMonth.sendKeys(tMonth);
		Thread.sleep(3000);
		toDay.sendKeys(tDay);
		Thread.sleep(3000);
		serviceClass.sendKeys(serClass);
		Thread.sleep(3000);
		airline.sendKeys(aline);
		Thread.sleep(3000);
		
		
	} 
	catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
		
	}
	

	}



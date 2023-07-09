package com.edureka.uiPacakage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectFlightPage {
	WebDriver driver;
	

	public SelectFlightPage(WebDriver driver) {
		this.driver=driver;
	}	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines360_D;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines361_D;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines362_D;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines363_D;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines360_T;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines361_T;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines362_T;
	
	@FindBy(how = How.XPATH,using = "")
	@CacheLookup
	WebElement BlueskiesAirlines363_T;
	
	
	@CacheLookup
	WebElement con;
	
	public void departAirlineWordpress(String departAirline) {
		try {
			if (departAirline.equalsIgnoreCase("Blue Skies Airlines 360")) {
				BlueskiesAirlines360_D.click();
				Thread.sleep(3000);
				
			}
			
			if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
				BlueskiesAirlines361_D.click();
				Thread.sleep(3000);
				
			}
			if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
				BlueskiesAirlines362_D.click();
				Thread.sleep(3000);
				}
			if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
				BlueskiesAirlines363_D.click();
				Thread.sleep(3000);
				}
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		}
		
		public void returnAirlineWordpress(String departAirline) {
			try {
				if (departAirline.equalsIgnoreCase("Blue Skies Airlines 360")) {
					BlueskiesAirlines360_T.click();
					Thread.sleep(3000);
					
				}
				
				if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
					BlueskiesAirlines361_T.click();
					Thread.sleep(3000);
					
				}
				if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
					BlueskiesAirlines362_T.click();
					Thread.sleep(3000);
					}
				if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
					BlueskiesAirlines363_T.click();
					Thread.sleep(3000);
					}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
				// TODO: handle exception
			}
		}
		
		public void continu() {
			
			con.click();
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
				// TODO: handle exception
			}
		}
			
	
	
		// TODO Auto-generated method stub

	}
	

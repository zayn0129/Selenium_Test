package com.edureka.testPackage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edureka.projectPackage.JyperionListener;
import com.edureka.uiPacakage.BookFlightPage;
import com.edureka.uiPacakage.FlightConfirmationPage;
import com.edureka.uiPacakage.FlightFinderPage;
import com.edureka.uiPacakage.LoginPage;
import com.edureka.uiPacakage.SelectFlightPage;

@Listeners(JyperionListener.class)
public class TestCaseClass extends HelperClass{
	
	public  TestCaseClass() {
		
	}
	@Test
	public  void returnTicket() {
		try {
			System.out.println("in returnTicket");
			driver.get("https://newtours.demoaut.com/");
			LoginPage loginPage = PageFactory.initElements(driver, null);
			loginPage.loginWordPress(null, null);
			FlightFinderPage flightFinderPage = PageFactory.initElements(driver, null);
			flightFinderPage.continueWordPress(null, null, null, null, null, null, null, null, null);
			SelectFlightPage selectFlightPage =PageFactory.initElements(driver, null);
			selectFlightPage.departAirlineWordpress(null);
			selectFlightPage.returnAirlineWordpress(null);
			selectFlightPage.continu();
			BookFlightPage bookFlightPage=PageFactory.initElements(driver, null);
			bookFlightPage.purchasePress(null, null, null, null, null, null, null, null, null, null);
			FlightConfirmationPage flightConfirmationPage=PageFactory.initElements(driver, null);
			String bookingDetails = System.setProperty(null, null);
			
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	
	

	}
	@Test
	public void validateCredentials()throws IOException{
		System.out.println();
		driver.get("");
		LoginPage loginPage=PageFactory.initElements(driver, null);
		loginPage.loginWordPress(null, null);
		try {
			FlightFinderPage flightFinderPage = PageFactory.initElements(driver, null);
			flightFinderPage.continueWordPress(null, null, null, null, null, null, null, null, null);
			assertEquals(true, false);
			
			
		} catch (Exception e) {
			assertEquals(true, false);
			// TODO: handle exception
		}
		
		
	}

}

package com.edureka.projectPackage;


import java.io.File;

import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CaptureScreenShot {

	public CaptureScreenShot() {
		
		// TODO Auto-generated method stub

	}
	
	public static void getScreenShot(WebDriver driver, String filepath) {
		try {
			
		System.out.println("In getScreenShot method");
		TakesScreenshot ts=(TakesScreenshot)driver;
		System.out.println("before getScreenShotAs");
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("After getScreenShotAs");
		
		} catch (WebDriverException e) {
			e.printStackTrace();
			
			// TODO: handle exception
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
	
	public static  String getDateTimeStamp () {
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate = new Date(0);
		System.out.println(oDate.toString());
		sDatePart = oDate.toString().split(" ");
		sDateStamp = sDatePart[5]+ "_" +
					 sDatePart[1]+ "_" +
					 sDatePart[2]+ "_" +
					 sDatePart[3];
		
		sDateStamp = sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		
		
		
		
		return sDateStamp;
		}
		
		
	}



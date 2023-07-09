package com.edureka.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("^Open the Firefox and start application$")

	public void open_the_Firefox_and_start_the_application() throws Throwable{
		System.setProperty("", "");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.twitter.com/");
		
		
	
		// TODO Auto-generated method stub

	}
	
	@When("^I enter valid username and valid password$")
	
	public void i_enter_valid_username_and_valid_password()throws Throwable {
		
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		
		
		System.out.print("This step enter the Username and Password on the login page.");
		// TODO Auto-generated method stub

	}
@Then("^user should be able to login successfully$")

public void user_should_be_able_to_login()throws Throwable{
	
	driver.findElement(By.className("")).click();
	
	
	
	System.out.print("This step click on the Reset button");
}


}

package com.sidero.apptests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebDriverStepDef {
	
	//Using the Selenium library (.jar) to create a chrome webdriver which can inspect elements of a webpage.
	WebDriver driver = null;
	
	@Given("^I am on the zoo website$")
	public void onWebsite() throws Throwable{
		
		//Setting system property for chrome. We would have to do the same for firefox. Tutorial in cucumber bookmarks.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cwhyte\\Documents\\Sidero Work\\MyWorkspace\\CucumberMavenSetupDemo1\\lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}
	
	@When("^I click the contact link$")
	public void shouldClickContactLink() throws Throwable{
		driver.findElement(By.id("contact_link")).click();
	}
	
	@And("^populate the contact form$")
	public void populateForm() throws Throwable{
		driver.findElement(By.name("name_field")).sendKeys("Ciaran");
		driver.findElement(By.name("address_field")).sendKeys("Athenry");
		driver.findElement(By.name("postcode_field")).sendKeys("A1 35487");
		driver.findElement(By.name("email_field")).sendKeys("me@gamil.com");
		driver.findElement(By.id("submit_message")).click();
	}
	
	@Then("^I should be on the contact confirmation page$")
	public void checkConfirmation() throws Throwable{
		Assert.assertTrue("Not on contact confirmation page", driver.getTitle().equalsIgnoreCase("Contact Confirmation"));
	}
}

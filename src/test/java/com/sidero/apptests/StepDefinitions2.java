package com.sidero.apptests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions2 {
	
	@Given("^I navigated to the zoo website$")
	public void shouldNavigate() throws Throwable{
		System.out.println("navigated");
	}
	
	@When("^I click on the about link$")
	public void shouldClickOnAbout() throws Throwable{
		System.out.println("clicked about");
	}
	
}

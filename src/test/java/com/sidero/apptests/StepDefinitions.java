package com.sidero.apptests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@When("^I click on the adoption link$")
	public void shouldClickOnAdoption() throws Throwable{
		System.out.println("clicked adoption");
	}
	
	//we look for a step which matches the below string.
	@Then("^I check to see that no animals are available$")
	public void checkAnimalStringVisible() throws Throwable{
		System.out.println("checked");
	}
	
}

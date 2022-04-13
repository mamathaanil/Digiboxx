package com.mamatha.dev.automation.stepdefinitions;

import org.junit.Assert;

import com.mamatha.dev.automation.pageObjects.FirstPageObjects;
import com.mamatha.dev.automation.pageObjects.HomePageObjects;
import com.mamatha.dev.automation.pageObjects.LoginPageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

	FirstPageObjects firstPO = new FirstPageObjects();
	LoginPageObjects loginPO = new LoginPageObjects();
	HomePageObjects homePO = new HomePageObjects();

	@Given("^I press the skip button$")
	public void i_press_the_skip_button() throws Throwable {
		firstPO.clickSkip();
	}

	@Then("^I input the spacename$")
	public void i_input_the_spacename() throws Throwable {
		loginPO.enterSpaceName();
	}

	@And("^I input the email$")
	public void i_input_the_email() throws Throwable {
		loginPO.enterEmail();
	}

	@And("^I input the password$")
	public void i_input_the_password() throws Throwable {
		loginPO.enterPassword();
	}

	@Then("^I click the signin button$")
	public void i_click_the_signin_button() throws Throwable {
		loginPO.clickSignin();
	}

	@And("^verify that I have reached the homepage$")
	public void verify_that_i_have_reached_the_homepage() throws Throwable {
		Thread.sleep(5000);
		Assert.assertEquals(homePO.getHomePage(), "MyBoxx");
		System.out.println("We are in the homepage");
	}

}

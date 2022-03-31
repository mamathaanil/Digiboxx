package com.mamatha.dev.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LoginPage {

	AppiumDriver driver;

	By skip = AppiumBy.id("com.liqvd.digibox.test:id/btnSkipIntroSlideOne");
	By name = AppiumBy.id("com.liqvd.digibox.test:id/edtDigiSpaceName");
	By email = AppiumBy.id("com.liqvd.digibox.test:id/edtEmail");
	By pwd = AppiumBy.id("com.liqvd.digibox.test:id/edtPassword");
	By signIn = AppiumBy.id("com.liqvd.digibox.test:id/btnSignIn");

	public LoginPage(AppiumDriver appDriver) {
		this.driver = appDriver;
	}

	public AppiumDriver getDriver() {
		return this.driver;

	}

	/**
	 * @return the skip element
	 */
	public WebElement getSkip() {
		return driver.findElement(skip);
	}

	/**
	 * @return the name element
	 */
	public WebElement getName() {
		return driver.findElement(name);
	}

	/**
	 * @return the email element
	 */
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	/**
	 * @return the password element
	 */
	public WebElement getPwd() {
		return driver.findElement(pwd);
	}

	/**
	 * @return the signIn element
	 */
	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}

}

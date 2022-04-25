package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.LoginPageFactory;

public class LoginPageObjects extends LoginPageFactory {

	public LoginPageObjects() {
		super();
	}

	public void enterSpaceName() {
		getName().sendKeys("mozark1");
	}

	public void enterEmail() {
		getEmail().sendKeys("testing.mob2@digiboxx.com");

	}

	public void enterPassword() {
		getPwd().sendKeys("Test@123");

	}

	public void clickSignin() {
		getSignIn().click();

	}

}

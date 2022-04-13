package com.mamatha.dev.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;

public class LoginPageFactory extends BaseCombinedDriver {

	@FindBy(id = "com.liqvd.digibox.test:id/edtDigiSpaceName")
	@CacheLookup
	WebElement name;

	@FindBy(id = "com.liqvd.digibox.test:id/edtEmail")
	@CacheLookup
	WebElement email;

	@FindBy(id = "com.liqvd.digibox.test:id/edtPassword")
	@CacheLookup
	WebElement pwd;

	@FindBy(id = "com.liqvd.digibox.test:id/btnSignIn")
	@CacheLookup
	WebElement signIn;

	public LoginPageFactory() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		// WaitHandler.waitForElement(name);
	}

	public WebElement getName() {
		return name;
	}

	/**
	 * @return the email element
	 */
	public WebElement getEmail() {
		return email;
	}

	/**
	 * @return the password element
	 */
	public WebElement getPwd() {
		return pwd;
	}

	/**
	 * @return the signIn element
	 */
	public WebElement getSignIn() {
		return signIn;
	}

}

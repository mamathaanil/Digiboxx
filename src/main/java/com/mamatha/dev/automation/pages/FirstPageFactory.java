package com.mamatha.dev.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamatha.dev.automation.diggiboxAuto.BaseDriverClass;

public class FirstPageFactory extends BaseDriverClass {

	@FindBy(id = "com.liqvd.digibox.test:id/btnSkipIntroSlideOne")
	@CacheLookup
	WebElement skip;

	public FirstPageFactory() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSkip() {
		return this.skip;
	}

}

package com.mamatha.dev.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;

public class FirstPageFactory extends BaseCombinedDriver {

	@FindBy(id = "com.liqvd.digibox.test:id/btnSkipIntroSlideOne")
	@CacheLookup
	WebElement skip;

	public FirstPageFactory() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		// WaitHandler.waitForElement(skip);
	}

	public WebElement getSkip() {
		return skip;
	}

}

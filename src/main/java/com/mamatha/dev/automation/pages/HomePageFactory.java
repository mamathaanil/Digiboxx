package com.mamatha.dev.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;

public class HomePageFactory extends BaseCombinedDriver {

	@FindBy(id = "com.liqvd.digibox.test:id/tvFolderTitle")
	@CacheLookup
	WebElement homePage;

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	@CacheLookup
	WebElement addFile;

	@FindBy(id = "com.liqvd.digibox.test:id/upload_new_file")
	@CacheLookup
	WebElement uploadFile;

	public HomePageFactory() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		// WaitHandler.waitForElement(homePage);
	}

	public String getHomePage() {

		return homePage.getAttribute("text");
	}

	public WebElement getAddFile() {
		return addFile;
	}

	public WebElement getUploadFile() {

		return uploadFile;
	}

}

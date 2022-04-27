package com.mamatha.dev.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;
//import com.mamatha.dev.automation.utils.WaitHandler;

public class UploadPageFactory extends BaseCombinedDriver {

	@FindBy(xpath = "//android.widget.TextView[@text=\"DIGIBOX\"]")
	@CacheLookup
	WebElement title;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"More options\"]")
	@CacheLookup
	WebElement moreOptions;

	public UploadPageFactory() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		// WaitHandler.waitForElement(title);

	}

	public WebElement getUploadPageTitle() {
		return title;
	}

	public WebElement getImage(String imageName) {
		WebElement image = driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + imageName + "\"]"));
		return image;
	}

	public WebElement getMoreOptions() {
		return moreOptions;
	}

	public WebElement getSelectAll() {
		WebElement selectAll = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select all\"]"));
		return selectAll;
	}

	public WebElement getOpen() {
		WebElement open = driver.findElement(By.id("com.android.documentsui:id/option_menu_list"));
		return open;
	}
}

/*
 * By.xpath("//android.widget.ImageButton[@content-desc="More options"]")
 *
 * By.xpath("//android.widget.TextView[@text="Select all"]")
 * 
 * By.id("com.android.documentsui:id/option_menu_list")
 * 
 */
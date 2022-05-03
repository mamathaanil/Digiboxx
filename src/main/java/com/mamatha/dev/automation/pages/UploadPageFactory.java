package com.mamatha.dev.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mamatha.dev.automation.diggiboxAuto.BaseCombinedDriver;
//import com.mamatha.dev.automation.utils.WaitHandler;

public class UploadPageFactory extends BaseCombinedDriver {

	@FindBy(xpath = "//android.widget.TextView[@text=\"DIGIBOX\"]")
	@CacheLookup
	WebElement title;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"More options\"]")
	@CacheLookup
	WebElement moreOptions;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public UploadPageFactory() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		// WaitHandler.waitForElement(title);

	}

	public WebElement getUploadPageTitle() {
		return title;
	}

	public WebElement getImage(String imageName) {
		By byImage = By.xpath("//android.widget.TextView[@text=\"" + imageName + "\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byImage));
		WebElement image = driver.findElement(byImage);
		return image;
	}

	public WebElement getMoreOptions() {
		return moreOptions;
	}

	public WebElement getSelectAll() {
		By bySelectAll = By.xpath("//android.widget.TextView[@text=\"Select all\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySelectAll));
		WebElement selectAll = driver.findElement(bySelectAll);
		return selectAll;
	}

	public WebElement getOpen() {
		By byOpen = By.id("com.android.documentsui:id/option_menu_list");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byOpen));
		WebElement open = driver.findElement(byOpen);
		return open;
	}
}

/*
 * 

 * 
 */
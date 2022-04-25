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

//	@FindBy(xpath = "//android.widget.TextView[@text=\"Phoenix1.jpeg\"]")
//	@CacheLookup
//	WebElement image1;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Phoenix2.jpeg\"]")
	@CacheLookup
	WebElement image2;

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

	public WebElement getImage2() {
		return image2;
	}

}

//MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
//el1.click();
//MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
//el2.click();

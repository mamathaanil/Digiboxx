package com.mamatha.dev.automation.pages;

import org.openqa.selenium.By;
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

	@FindBy(id = "com.liqvd.digibox.test:id/create_new_folder")
	@CacheLookup
	WebElement createFolder;

	@FindBy(id = "com.liqvd.digibox.test:id/edtCreateFolderName")
	@CacheLookup
	WebElement enterFolderName;

	@FindBy(id = "com.liqvd.digibox.test:id/ivSelectAll")
	@CacheLookup
	WebElement selectAll;

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

	public WebElement getCreateFolder() {

		return createFolder;
	}

	public WebElement getTypeFolderName() {

		return enterFolderName;
	}

	public WebElement getImage(String imageName) {

		WebElement image = driver
				.findElement(By.xpath("//android.widget.TextView[contains(@text,\"" + imageName + "\")]"));
		return image;
	}

	public WebElement getSelectAll() {
		return selectAll;
	}

	public WebElement getDelete() {
		WebElement delete = driver.findElement(By.id("com.liqvd.digibox.test:id/ivDelete"));
		return delete;
	}

	public WebElement getConfDelete() {
		WebElement confDelete = driver.findElement(By.id("com.liqvd.digibox.test:id/tvContinue"));
		return confDelete;
	}

	/*
	 * 
	 * driver.findElementById("com.liqvd.digibox.test:id/tvDeleteFile");
	 * el2.click(); MobileElement el3 = (MobileElement)
	 * driver.findElementById("com.liqvd.digibox.test:id/tvContinue"); el3.click();
	 * MobileElement el4 = (MobileElement)
	 * driver.findElementById("com.liqvd.digibox.test:id/tvName"); el4.click();
	 * 
	 * com.liqvd.digibox.test:id/ivSelectAll
	 */
}

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

//	@FindBy(id = "com.liqvd.digibox.test:id/ivSelectAll")
//	@CacheLookup
//	WebElement selectAll;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

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

		// By byImage = By.xpath("//android.widget.TextView[contains(@text,\"" +
		// imageName + "\")]");
		By byImage = By.xpath("//android.widget.TextView[@text=\"" + imageName + "\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byImage));
		WebElement image = driver.findElement(byImage);
		return image;
	}

	public boolean waitTillAllImagesLoad() {

		By byImages = By.xpath("//android.widget.TextView[@resource-id=\"com.liqvd.digibox.test:id/tvName\"]");
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(byImages)));
		return true;
	}

	public WebElement getSelectAll() {

		By bySelectAll = By.id("com.liqvd.digibox.test:id/ivSelectAll");
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySelectAll));
		WebElement selectAll = driver.findElement(bySelectAll);
		return selectAll;
	}

	public WebElement getDelete() {
		By byDelete = By.id("com.liqvd.digibox.test:id/ivDelete");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byDelete));
		WebElement delete = driver.findElement(byDelete);
		return delete;
	}

	public WebElement getConfDelete() {

		By byConfDelete = By.id("com.liqvd.digibox.test:id/tvContinue");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byConfDelete));
		WebElement confDelete = driver.findElement(byConfDelete);
		return confDelete;
	}

	public WebElement getCreateFolderButton() {

		By byCreateButton = By.id("com.liqvd.digibox.test:id/btnCreateFolder");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byCreateButton));
		WebElement createButton = driver.findElement(byCreateButton);
		return createButton;
	}

	public WebElement getFolder(String folderName) {

		By byFolder = By.xpath("//android.widget.TextView[@text=\"" + folderName + "\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byFolder));
		WebElement folder = driver.findElement(byFolder);
		return folder;
	}

	/*
	 * com.liqvd.digibox.test:id/btnCreateFolder folder
	 * com.liqvd.digibox.test:id/tvName text = Mamatha
	 * com.liqvd.digibox.test:id/btnCreateFolder
	 * "//android.widget.TextView[@text()=\""+folderName+"\]"
	 */
}

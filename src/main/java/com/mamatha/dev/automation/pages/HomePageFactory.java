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
	WebElement homePageTitle;

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView")
	@CacheLookup
	WebElement homePage;

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")
	@CacheLookup
	WebElement addFile;
//
//	@FindBy(id = "com.liqvd.digibox.test:id/upload_new_file")
//	@CacheLookup
//	WebElement uploadFile;

//	@FindBy(id = "com.liqvd.digibox.test:id/create_new_folder")
//	@CacheLookup
//	WebElement createFolder;
//
//	@FindBy(id = "com.liqvd.digibox.test:id/edtCreateFolderName")
//	@CacheLookup
//	WebElement enterFolderName;

//	@FindBy(id = "com.liqvd.digibox.test:id/ivSelectAll")
//	@CacheLookup
//	WebElement selectAll;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));

	public HomePageFactory() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
		// WaitHandler.waitForElement(homePage);
	}

	public String getHomePageTitle() {

		return homePageTitle.getAttribute("text");
	}

	public WebElement getHomePage() {

		return homePage;
	}

	public WebElement getAddFile() {
		return addFile;
	}

	public WebElement getUploadFile() {

		By byUploadFolder = By.id("com.liqvd.digibox.test:id/upload_new_file");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byUploadFolder));
		WebElement uploadFile = driver.findElement(byUploadFolder);
		return uploadFile;
	}

	public WebElement getCreateFolder() {

		By byCreateFolder = By.id("com.liqvd.digibox.test:id/create_new_folder");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byCreateFolder));
		WebElement createFolder = driver.findElement(byCreateFolder);
		return createFolder;
	}

	public WebElement getTypeFolderName() {

		By byEnterFolderName = By.id("com.liqvd.digibox.test:id/edtCreateFolderName");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byEnterFolderName));
		WebElement enterFolderName = driver.findElement(byEnterFolderName);
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

		// By byImages =
		// By.xpath("//android.widget.TextView[@resource-id=\"com.liqvd.digibox.test:id/tvName\"]");
		By byImages = By.id("com.liqvd.digibox.test:id/tvName");
		// wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(byImages)));
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byImages));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(byImages)));

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

	public WebElement getFolderName(String folderName) {

		By byFolderName = By.xpath("//android.widget.TextView[@text=\"" + folderName + "\"]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byFolderName));
		WebElement folderByName = driver.findElement(byFolderName);
		return folderByName;
	}

	public WebElement getFolder() {

		By byFolder = By.id("com.liqvd.digibox.test:id/cvFolder");
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

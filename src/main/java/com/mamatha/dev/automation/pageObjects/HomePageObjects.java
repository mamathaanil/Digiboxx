package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.HomePageFactory;

public class HomePageObjects extends HomePageFactory {

	public HomePageObjects() {
		super();
	}

	public void clickAddFile() {
		getAddFile().click();
	}

	public void clickUploadFile() {
		getUploadFile().click();
	}

	public void clickCreateFolder() {
		getCreateFolder().click();
	}

	public void enterFolderName(String folderName) {
		getTypeFolderName().sendKeys(folderName);
		// TouchActions action = new TouchActions(driver);
		// action.
	}

	public void clickCreateBtn() {
		getCreateFolderButton().click();

	}

	public boolean checkFolder(String folderName) {

		return getFolder(folderName).isDisplayed();
	}

	public boolean checkImage(String imageName) throws InterruptedException {

		return getImage(imageName).isDisplayed();

	}

	public void deleteAllImages() throws InterruptedException {
		getSelectAll().click();
		getDelete().click();
		getConfDelete().click();
	}

	public boolean checkImages() {
		return waitTillAllImagesLoad();
	}

}

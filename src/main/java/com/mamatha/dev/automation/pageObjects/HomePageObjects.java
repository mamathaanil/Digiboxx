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

	public void enterFolderName() {

	}

	public boolean checkImage(String imageName) throws InterruptedException {
		Thread.sleep(5000);
		return getImage(imageName).isDisplayed();

	}

	public void deleteAllImages() throws InterruptedException {
		getSelectAll().click();
		getDelete().click();
		Thread.sleep(5000);
		getConfDelete().click();
	}

	public boolean checkImages() {
		return true;
	}

}

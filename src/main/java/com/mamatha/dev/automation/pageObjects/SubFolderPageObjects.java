package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.SubFolderPageFactory;

public class SubFolderPageObjects extends SubFolderPageFactory {

	public SubFolderPageObjects() {
		super();
	}

	public boolean checkImage(String imageName) throws InterruptedException {

		return getImage(imageName).isDisplayed();

	}

	public boolean checkImages() {
		return waitTillAllImagesLoad();
	}
}

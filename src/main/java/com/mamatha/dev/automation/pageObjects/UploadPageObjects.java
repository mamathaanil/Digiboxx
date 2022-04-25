package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.UploadPageFactory;

public class UploadPageObjects extends UploadPageFactory {

	public UploadPageObjects() {
		super();
	}

	public String UploadFilePageTitle() {
		return getUploadPageTitle().getAttribute("text");
	}

	public void clickImage(String imageName) {
		System.out.println("The image name is :" + getImage(imageName).getText());
		getImage(imageName).click();

	}

	public void clickImage2() {
		getImage2().click();
	}
}

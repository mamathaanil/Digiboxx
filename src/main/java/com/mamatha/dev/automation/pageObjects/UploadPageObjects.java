package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.UploadPageFactory;

public class UploadPageObjects extends UploadPageFactory {

	public UploadPageObjects() {
		super();
	}

	public String UploadFilePageTitle() {
		return getUploadPageTitle().getAttribute("text");
	}

	public void clickImage1() {
		System.out.println("The image name is :" + getImage1().getText());
		getImage1().click();

	}

	public void clickImage2() {
		getImage2().click();
	}
}

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

}

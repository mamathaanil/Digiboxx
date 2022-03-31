package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.FirstPageFactory;

public class FirstPageObjects extends FirstPageFactory {

	public FirstPageObjects() {
		super();
	}

	public void clickSkip() {
		getSkip().click();
	}
}

package com.mamatha.dev.automation.pageObjects;

import com.mamatha.dev.automation.pages.FolderMenuPageFactory;

public class FolderMenuPageObjects extends FolderMenuPageFactory {

	public FolderMenuPageObjects() {
		super();
	}

	public void clickFolderMenu() {
		getFolderMenu().click();
	}

	public void clickRenameOption() {
		getRenameOption().click();
	}

	public void clickRenameButton() {
		getRenameFolderButton().click();
	}

	public void enterNewFolderName(String newFolderName) {

		getEditRenameFolder().sendKeys(newFolderName);
	}

}

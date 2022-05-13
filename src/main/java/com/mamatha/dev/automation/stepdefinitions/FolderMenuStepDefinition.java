package com.mamatha.dev.automation.stepdefinitions;

import com.mamatha.dev.automation.pageObjects.FolderMenuPageObjects;
import com.mamatha.dev.automation.pageObjects.HomePageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FolderMenuStepDefinition {

	HomePageObjects homePO = new HomePageObjects();
	FolderMenuPageObjects folderPO = new FolderMenuPageObjects();

	@And("^I click on the menu button$")
	public void i_click_on_the_menu_button() throws Throwable {
		folderPO.clickFolderMenu();
	}

	@And("^I click on the rename option$")
	public void i_click_on_the_rename_option() throws Throwable {
		folderPO.clickRenameOption();
	}

	@When("^I click the rename folder button$")
	public void i_click_the_rename_folder_button() throws Throwable {
		folderPO.clickRenameButton();
	}

	@Then("^I rename folder with \"([^\"]*)\"$")
	public void i_rename_folder_with_something(String strArg1) throws Throwable {

		folderPO.enterNewFolderName(strArg1);
	}
}

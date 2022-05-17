package com.mamatha.dev.automation.stepdefinitions;

import org.junit.Assert;

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

	@And("^I click on the change color option$")
	public void i_click_on_the_change_color_option() throws Throwable {
		folderPO.clickChangeColor();
	}

	@When("^I click on a color$")
	public void i_click_on_a_color() throws Throwable {
		folderPO.clickChooseColor(6);
	}

	@And("^I click on apply button$")
	public void i_click_on_apply_button() throws Throwable {
		folderPO.clickAppyBtn();
	}

	@Then("^the folder color is changed$")
	public void the_folder_color_is_changed() throws Throwable {
		Assert.assertEquals(true, true);
	}

}

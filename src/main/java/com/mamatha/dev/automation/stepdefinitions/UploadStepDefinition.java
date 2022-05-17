package com.mamatha.dev.automation.stepdefinitions;

import org.junit.Assert;

import com.mamatha.dev.automation.pageObjects.HomePageObjects;
import com.mamatha.dev.automation.pageObjects.UploadPageObjects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadStepDefinition {

	HomePageObjects homePO = new HomePageObjects();
	UploadPageObjects uploadPO = new UploadPageObjects();

	@And("^I click on add button$")
	@Given("I click on the add button")
	public void i_click_on_the_add_button() {
		homePO.clickAddFile();
	}

	@And("I click on the upload button")
	public void i_click_on_the_upload_button() {
		homePO.clickUploadFile();
	}

	@Then("I reach the folder with files")
	public void i_reach_the_folder_with_files() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(uploadPO.UploadFilePageTitle(), "DIGIBOX");
	}

	@When("I click on single image")
	public void i_click_on_single_image() throws InterruptedException {
		uploadPO.clickImage("fish.jpeg");
	}

	@Then("The image is uploaded to digiboxx homepage")
	public void the_image_is_uploaded_to_digiboxx_homepage() throws InterruptedException {
		Assert.assertEquals(homePO.checkImage("fish.jpeg"), true);

	}

	@When("^I select multiple images$")
	public void i_select_multiple_images() throws Throwable {
		uploadPO.selectImages();
	}

	@Then("^The images are uploaded to digiboxx homepage$")
	public void the_images_are_uploaded_to_digiboxx_homepage() throws Throwable {
		Assert.assertEquals(homePO.checkImages(), true);
	}

	@And("^I click on the create folder button$")
	public void i_click_on_the_create_folder_button() throws Throwable {
		homePO.clickCreateFolder();
	}

	@Then("^I provide a filename \"([^\"]*)\"$")
	public void i_provide_a_filename_something(String strArg1) throws Throwable {
		homePO.enterFolderName(strArg1);
	}

	@When("^I click the create button$")
	public void i_click_the_create_button() throws Throwable {
		homePO.clickCreateBtn();
	}

	@Then("^a folder \"([^\"]*)\" is created$")
	public void a_folder_something_is_created(String strArg1) throws Throwable {
		Assert.assertEquals(homePO.checkFolder(strArg1), true);
	}

	@When("^I click on folder$")
	public void i_click_on_folder() throws Throwable {
		homePO.clickFolder();
	}

}

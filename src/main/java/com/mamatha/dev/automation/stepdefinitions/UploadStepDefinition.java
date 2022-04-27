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
		uploadPO.clickImage("Phoenix1.jpeg");
		Thread.sleep(10000);
	}

	@Then("The image is uploaded to digiboxx homepage")
	public void the_image_is_uploaded_to_digiboxx_homepage() throws InterruptedException {
		Assert.assertEquals(homePO.checkImage("Phoenix1"), true);

	}

	@When("^I select multiple images$")
	public void i_select_multiple_images() throws Throwable {
		uploadPO.selectImages();
		Thread.sleep(5000);
	}

	@Then("^The images are uploaded to digiboxx homepage$")
	public void the_images_are_uploaded_to_digiboxx_homepage() throws Throwable {
		Assert.assertEquals(homePO.checkImages(), true);
	}

}

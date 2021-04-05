package com.magna.bdd.steps;

import org.openqa.selenium.WebDriver;

import com.magna.bdd.SetUP;
import com.magna.bdd.pages.CommonComponents;
import com.magna.bdd.pages.WURegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WURegistrationSteps {

	WebDriver driver = SetUP.getDriver();

	WURegistrationPage regPage = new WURegistrationPage(driver);
	CommonComponents common = new CommonComponents(driver);

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		common.launchBrowser();
	}

	@When("user enters WU Registration URL")
	public void user_enters_WU_Registration_URL() {
		common.enterUrl();
	}

	@Then("User should land on WU Registration page")
	public void user_should_land_on_WU_Registration_page() {
		regPage.verifyRegistrationPageLanding();
	}

	@Then("User enters first name in the first name field as (.*)")
	public void user_enters_first_name_in_the_first_name_field(String firstName) {
		regPage.fillFirstName(firstName);
	}

	@Then("User enters middle name in the middle name field as (.*)")
	public void user_enters_middle_name_in_the_middle_name_field(String middleName) {
		regPage.fillMiddleName(middleName);
	}

	@Then("User enters last name in the last name field as (.*)")
	public void user_enters_last_name_in_the_last_name_field(String lastName) {
		regPage.fillLastName(lastName);
	}

	@Then("user enters DOB in dob input filed as (.*)")
	public void user_enters_DOB_in_dob_input_filed(String dob) {
		regPage.fillDOB(dob);
	}

	@Then("User click on submit button on the bottom of the section")
	public void user_click_on_submit_button_on_the_bottom_of_the_section() {
		regPage.clickOnSubmitButton();
	}

	@Then("user closes the browser")
	public void user_close_the_browser() {
		common.closeBrowser();
	}
}

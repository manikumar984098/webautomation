package com.magna.bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WURegistrationPage {

	public WebDriver driver;

	public WURegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt = 'logo']")
	WebElement logoEle;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstNameInput;

	@FindBy(xpath = "//input[@id='middleName']")
	WebElement middleNameInput;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastNameInput;

	@FindBy(xpath = "//input[@id='dob']")
	WebElement dobInput;

	@FindBy(xpath = "//button[@id = 'button-continue']")
	WebElement continueButton;

	public void verifyRegistrationPageLanding() {
		String appCurrentURL = driver.getCurrentUrl();
		String appTitle = driver.getTitle();

		Assert.assertEquals(appCurrentURL, "https://www.westernunion.com/in/en/web/user/register");
		Assert.assertEquals(appTitle, "Register a profile with Western Union IN");
		Assert.assertTrue(logoEle.isDisplayed());
	}

	public void fillFirstName(String firstName) {
		Assert.assertTrue(firstNameInput.isDisplayed());
		Assert.assertTrue(firstNameInput.isEnabled());
		firstNameInput.sendKeys(firstName);
	}

	public void fillMiddleName(String middleName) {
		Assert.assertTrue(middleNameInput.isDisplayed());
		Assert.assertTrue(middleNameInput.isEnabled());
		middleNameInput.sendKeys(middleName);

	}

	public void fillLastName(String lastname) {
		Assert.assertTrue(lastNameInput.isDisplayed());
		Assert.assertTrue(lastNameInput.isEnabled());
		lastNameInput.sendKeys(lastname);

	}

	public void fillDOB(String dob) {
		WebElement dobInput = driver.findElement(By.xpath("//input[@id='dob']"));
		Assert.assertTrue(dobInput.isDisplayed());
		Assert.assertTrue(dobInput.isEnabled());
		dobInput.sendKeys(dob);
	}

	public void clickOnSubmitButton() {
		Assert.assertTrue(continueButton.isDisplayed());
		Assert.assertTrue(continueButton.isEnabled());
		continueButton.click();

	}
}

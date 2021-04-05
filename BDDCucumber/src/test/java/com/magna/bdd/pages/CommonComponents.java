package com.magna.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.magna.bdd.SetUP;

public class CommonComponents {

	public WebDriver driver;

	public CommonComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchBrowser() {
		SetUP.getDriver();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void enterUrl() {
		driver.get("https://www.westernunion.com/in/en/web/user/register"); // application url
	}
}

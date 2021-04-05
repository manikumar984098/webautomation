package com.magna.bdd;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetUP {

	public static WebDriver driver;
	public static final String AUTOMATE_USERNAME = "manikumar18";
	public static final String AUTOMATE_ACCESS_KEY = "Z3ycqshggWzud7gJ9izK";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriver() {
		if (driver == null) {
			// System.setProperty("webdriver.chrome.driver",
			// "./res/drivers/chromedriver.exe");
			// driver = new ChromeDriver();
			// driver.manage().window().maximize();

			try {
				
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("os_version", "8.1");
				caps.setCapability("resolution", "1024x768");
				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "86.0");
				caps.setCapability("os", "Windows");
				caps.setCapability("name", "Automation Hive test"); // test name
				caps.setCapability("build", "00001"); // CI/CD job or build name
				
				driver = new RemoteWebDriver(new URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// driver.get("https://www.google.com");
		}
		return driver;
	}
}

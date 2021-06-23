package com.automationPages;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.BrowserFactory;

public class BaseClass {

	public WebDriver driver;
	@BeforeClass   
	public void setup(){
		driver=BrowserFactory.startApp(driver, "Chrome", "https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	@AfterClass
	public void terminateapp(){
		BrowserFactory.quiteBrowser(driver);
	}
}

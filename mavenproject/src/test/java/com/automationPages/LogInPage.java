package com.automationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage  {
	
	WebDriver driver;
	
	public LogInPage(WebDriver ldriver){
		
		this.driver=ldriver;
		}
	
	@FindBy(name="email") WebElement uname;
	@FindBy(name="pass") WebElement pword;
	@FindBy(name="login") WebElement loginButton;
	
          public void loginToCRM(String usernameforapp, String passwordforapp) throws Exception{
        	  
        	  Thread.sleep(2000);
        	  uname.sendKeys(usernameforapp);
        	  pword.sendKeys(passwordforapp);
        	  loginButton.click();
          }
	
}

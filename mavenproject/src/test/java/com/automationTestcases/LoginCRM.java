package com.automationTestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.automationPages.BaseClass;
import com.automationPages.LogInPage;



public class LoginCRM extends BaseClass {
	
	
	
	@Test
	public void logInapp() throws Exception{
		
		
		LogInPage loginpage= PageFactory.initElements(driver,LogInPage.class );
		loginpage.loginToCRM("8454983559", "vpceb44eN");
		
		
	}

}

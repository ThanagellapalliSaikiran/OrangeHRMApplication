package com.OrangeHRMApplicationPagesTests;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.BaseTest.LogInPage;

public class LogInPageTest extends BaseTest {
	
	@Test(priority=1,description=" Validating OrangeHRM Application LogIN Page Text")
	public void orangeHRMApplicationLogInPage_logInPannelTextTest()
	{

	LogInPage logInPage = new LogInPage();
	logInPage.orangeHRMApplicationLogInPage_logInPannelTextValidation();

	}


	@Test(priority=2,description=" Validating OrangeHRM Applicaiton LogIn Page Logo ")
	public void orangeHRMApplicationLogInPage_LogoValidationTest()
	{
	LogInPage logInPage = new LogInPage();
	logInPage.orangeHRMApplicationLogInPageLogoValidation();
	}

	@Test(priority=3,description=" Validating OrangeHRM Applicaiton LogIn Functionality ")
	public void orangeHRMApplicationLogInPage_LogInTest()
	{
	LogInPage logInPage = new LogInPage();
	logInPage.orangeHRMApplicationLogInPage_logInValdiation("Admin", "Livetech@123");
	}


	
	
	
	
	
	
	
}

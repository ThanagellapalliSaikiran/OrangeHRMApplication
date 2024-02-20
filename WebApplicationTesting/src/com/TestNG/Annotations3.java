package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	
	
	
	public void logInTest() // its a User-Defined method - is called as a Test Case Name
	{
	System.out.println(" Gmail LogIn Functionality Test Successful ");
	}

	@BeforeMethod
	public void applicationLaunch()
	{
	System.out.println(" Gmail Application Launch Successful ");
	}

	@Test(priority=3)
	public void ComposeMailTest()
	{
	System.out.println(" Compose Mail Functionality Test Successful ");
	}

	@Test(priority=2)
	public void inBoxTest()
	{
	System.out.println(" Gmail InBox Functionalty Test Successful ");
	}

	@Test(enabled=false) // during the Test run - The TestNG will Ignore the current Test Case
	                    //   TestNG will consider it as a False Test Case during Test Run
	                    //   The Default Status of the Test Case is "enabled=true"
	public void draftsTest()
	{
	System.out.println(" Gmail Drafts Functionality Test Successful ");
	}

	@Test(priority=5)
	public void sentMail()
	{
	System.out.println(" Gmail SentMail Functioanlity Test Successful ");
	}

	@AfterMethod
	public void applicationClose()
	{
	System.out.println(" Gmail Application Close Successful ");
	}




}

package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.remote.server.handler.GetElementText;

public class AutomateTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		//OrangeHRM navigation
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		
		//Automation the browser
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		
		// Validating the Web page
		// Expected OrangeHRM Title
		String expected_OrangeHRMHWebpageTitle="OrangeHRM";
		 
		System.out.println(" The Expected OrangHRM Home page Title is :- "+expected_OrangeHRMHWebpageTitle);


		String actual_OrangeHRMHWebpageTitle=driver.getTitle();
		System.out.println(" The Actual Web page Title is :- "+actual_OrangeHRMHWebpageTitle);

		if(actual_OrangeHRMHWebpageTitle.equals(expected_OrangeHRMHWebpageTitle))
		{
		System.out.println(" The Title of the OrangeHRM web Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM web Page NOT Matched - FAIL");
		}
System.out.println();
//driver.close();
		
		
		// Expected URL TO Actual URL
		
		String expected_OrangeHRMUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("the expected OrangeHRM URL is :-"+expected_OrangeHRMUrl);
		String actual_OrangeHRMUrl=driver.getCurrentUrl();
		System.out.println("the actual orangeHRM URL is :-"+actual_OrangeHRMUrl);
		if(actual_OrangeHRMUrl.equals(expected_OrangeHRMUrl))
		{
		System.out.println(" The Title of the OrangeHRM web Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM web Page NOT Matched - FAIL");
		}
		
		System.out.println();
		
		//Expected text login panel
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		String expected_logInPanel="LOGIN Panel";
		System.out.println("The expected login panel is :-"+expected_logInPanel);
		WebElement actual_logInPanel=driver.findElement(By.id("logInPanelHeading"));
		System.out.println("the actual Login Panel  is :-"+actual_logInPanel.getText());
		if(actual_logInPanel.getText().equals(expected_logInPanel))
		{
		System.out.println(" The Title of the Login Pane should be  same - PASS");
		}
		else
		{
			System.out.println(" The Title of the Login Pane should not be  same - Fail");
		}
		System.out.println();
		
		//validating data user name and password
		//User name 
		String userNameTestData="Admin"; 
		By userNamePoperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNamePoperty); 
		userName.sendKeys(userNameTestData); 
		
		//Password
		String userpasswordTestData="Livetech@123";
		By userpasswordPoperty=By.id("txtPassword");
		WebElement password=driver.findElement(userpasswordPoperty);
		password.sendKeys(userpasswordTestData);

		//login 
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
	
		//Validating the home page
		String expected_ValidatingOrangeHRMHomePage="OrangeHRM";
		System.out.println(" The Expected OrangHRM Home page  is :- "+expected_ValidatingOrangeHRMHomePage);


		String actual_ValidatingHomePage=driver.getTitle();
		System.out.println(" The Actual Validating Home Page is :- "+actual_ValidatingHomePage);

		if(actual_ValidatingHomePage.equals(expected_ValidatingOrangeHRMHomePage))
		{
		System.out.println(" The Validating of the OrangeHRM Home Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Validating of the OrangeHRM Home Page NOT Matched - FAIL");
		}
		System.out.println();
		
		//title 
		String expected_OrangeHRMTitle="OrangeHRM";
		 
		System.out.println(" The Expected OrangHRM Home page Title is :- "+expected_OrangeHRMTitle);


		String actual_OrangeHRMTitle=driver.getTitle();
		System.out.println(" The Actual Web page Title is :- "+actual_OrangeHRMTitle);

		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
		System.out.println(" The Title of the OrangeHRM web Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM web Page NOT Matched - FAIL");
		}
		
		System.out.println();
		
		//text to welcome
		
	//	<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
	/*	By welcomeProperty=By.id("welcome");
		WebElement welcome=driver.findElement(welcomeProperty);
		String welcomeAttributeValue=welcome.getAttribute("href");
		System.out.println(" The href Attribute value of welcome WebElement is :- "+welcomeAttributeValue);
		
		String webPageUrlAddress=driver.getCurrentUrl();
		System.out.println(" The WebPage Url Address is :- "+webPageUrlAddress);

		
		
		if(welcomeAttributeValue.contains(webPageUrlAddress))
		{
		System.out.println(" Url Matched - PASS ");
		}
		else
		{
		System.out.println(" Url NOT Matched - FIAL ");
		}
		*/
		By welComeAdminProperty=By.partialLinkText("Admin");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

		String expected_OrangeHRMApplicationHomePageText="Welcome";
		System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		}


		welComeAdmin.click();
		System.out.println();
		//Logout
		Thread.sleep(1000);

	
		By logOutProperty=By.linkText("Logout");
		WebElement logOutt=driver.findElement(logOutProperty);
		logOutt.click();
		driver.close();

		
		
		
		
		
		
		
		
	}

	}

package com.ValidatingURlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURLAddress_GoogleHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserDriveFiles/chromedriver.exe");
		ChromeDriver chromeBrowser1 = new ChromeDriver();

		// Navigating to Google Application HomePage
		chromeBrowser1.get("http://instagram.com");


		// google.com - should have in the URl Address

		String expected_instagramHomePageURlAddress="instagram.com";
		System.out.println(" The Expected Url Address of the instagram Home Page is :- "+expected_instagramHomePageURlAddress);

		// getting the URL Address of the current WebPage
		String actual_instagramCurrentWebPageUrlAddress1=chromeBrowser1.getCurrentUrl();
		System.out.println(" The Actual Current URL Address of the WebPage is :- "+actual_instagramCurrentWebPageUrlAddress1);

		if(actual_instagramCurrentWebPageUrlAddress1.contains(expected_instagramHomePageURlAddress))
		{
		System.out.println(" Successfully Navigated to instagram Home Page  - Url Address found - PASS");
		}
		else
		{
		System.out.println(" Failed to navigate instagram Home Page  - Url Address NOT found - FAIL");
		}


		chromeBrowser1.quit();
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver .get("http://facebook.com");
		String expected_facebookHomePageURlAddress="facebook.com";
		System.out.println(" The Expected Url Address of the Facebook Home Page is :- "+expected_facebookHomePageURlAddress);
		String actual_facebookCurrentWebPageUrlAddress1=driver.getCurrentUrl();
		System.out.println(" The Actual Current URL Address of the WebPage is :- "+actual_facebookCurrentWebPageUrlAddress1);
		if(actual_facebookCurrentWebPageUrlAddress1.contains(expected_facebookHomePageURlAddress))
		{
		System.out.println(" Successfully Navigated to Facebook Home Page  - Url Address found - PASS");
		}
		else
		{
		System.out.println(" Failed to navigate Facebook Home Page  - Url Address NOT found - FAIL");
		}


		
		//driver.quit();
		
		




	}

}

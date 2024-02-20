package com.OrengHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class ORHMUrlAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		String expected_OrangeHRMUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		 
		System.out.println(" The Expected OrangHRMurl  is :- "+expected_OrangeHRMUrl);


		String actual_WebPagesUrl=driver.getCurrentUrl();
		System.out.println(" The Actual Web page URL is :- "+actual_WebPagesUrl);

		if(actual_WebPagesUrl.equals(expected_OrangeHRMUrl))
		{
		System.out.println(" The Title of the OrangeHRM URL Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM URL NOT Matched - FAIL");
		}

		driver.close();
	}

}

package com.OrengHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORHMHomePageTile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		String expected_OrangeHRMHomePageTitle="OrangeHRM";
		//1. Identifying the Element of the WebPage - done using the properties
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");

				//<input name="txtPassword" auto complete="off" type="password">
				driver.findElement(By.id("txtPassword")).sendKeys("Livetech@123");

				//<input type="submit"  class="button"  value="LOGIN">
				driver.findElement(By.className("button")).click();
				
		 
		System.out.println(" The Expected OrangHRM Home page Title is :- "+expected_OrangeHRMHomePageTitle);


		String actual_WebPageTitles1=driver.getTitle();
		System.out.println(" The Actual Web page Title is :- "+actual_WebPageTitles1);

		if(actual_WebPageTitles1.equals(expected_OrangeHRMHomePageTitle))
		{
		System.out.println(" The Title of the OrangeHRM Home Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM Home Page NOT Matched - FAIL");
		}

		driver.close();
	}

}

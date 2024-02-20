package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class OrangeHRM_LogInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
ChromeDriver driver=new ChromeDriver();
driver.get(applicationUrl);

/*
String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
System.out.println(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);



String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
System.out.println(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);



if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
{
System.out.println("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
}
else
{
System.out.println("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
}*/
/*
<input name="txtUsername" id="txtUsername" type="text">

< - tag
input - tag Name

name - attribute / locator
txtUsername - corresponding value

id - attribute / locator
txtUsername - corresponding value / selector

type - attribute / its not a locator of WebDriver
text -  corresponding value / selector
*/

//1. Identifying the Element of the WebPage - done using the properties
driver.findElement(By.id("txtUsername")).sendKeys("Admin");

//<input name="txtPassword" auto complete="off" type="password">
driver.findElement(By.id("txtPassword")).sendKeys("Livetech@123");

//<input type="submit"  class="button"  value="LOGIN">
driver.findElement(By.className("button")).click();


/*String applicationURL="https://www.instagram.com/";
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
ChromeDriver driver1=new ChromeDriver();
driver.get(applicationURL);

driver1.findElement(By.name("username")).sendKeys("chinna_dio_boy");
driver1.findElement(By.name("password")).sendKeys("Amma@2326");

driver1.findElement(By.className("button")).click();*/






	
	}

}

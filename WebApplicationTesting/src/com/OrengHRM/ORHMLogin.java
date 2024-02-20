package com.OrengHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORHMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		//1. Identifying the Element of the WebPage - done using the properties
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		//<input name="txtPassword" auto complete="off" type="password">
		//driver.findElement(By.id("txtPassword")).sendKeys("Livetech@123");

		//<input type="submit"  class="button"  value="LOGIN">
		//driver.findElement(By.className("button")).click()
		
		
		;

		String userNameTestData="Admin"; // Test Data
		By userNamePoperty=By.id("txtUsername"); // Property of an element is identified and assigned to a variable
		WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Web page
		userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement
		
		
		
		
		
String userpasswordTestData="Livetech@123";
By userpasswordPoperty=By.id("txtPassword");
WebElement password=driver.findElement(userpasswordPoperty);
password.sendKeys(userpasswordTestData);





//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By logInButtonProperty=By.className("button");
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();

	}

}

package com.OrengHRM;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoLogOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		Thread.sleep(1000);
		
			
		String userNameTestData="Admin"; // Test Data
		By userNamePoperty=By.id("txtUsername"); // Property of an element is identified and assigned to a variable
		WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Web page
		userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement
		Thread.sleep(1000);		
		
		
String userpasswordTestData="Livetech@123";
By userpasswordPoperty=By.id("txtPassword");
WebElement password=driver.findElement(userpasswordPoperty);
password.sendKeys(userpasswordTestData);
Thread.sleep(1000);


//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By logInButtonProperty=By.className("button");
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();
//Thread.sleep(1000);
//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		 
By welcomeproperty=By.id("welcome");
WebElement welcome=driver.findElement(welcomeproperty);
welcome.click();
Thread.sleep(1000);
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

//By logOutProperty=By.linkText("Logout");
//String LogOut=("logout");
//WebElement logout=driver.findElement(logOutProperty);
//logout.click();
Thread.sleep(1000);

By logOutProperty=By.xpath("//a[text()='Logout']");
WebElement logout=driver.findElement(logOutProperty);
logout.click();
























	}

}

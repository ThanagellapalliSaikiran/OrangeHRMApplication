package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import com.Utility.Log;

public class BaseTest {
	
	public static WebDriver driver;
	
	 String apilcationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	 
	 @BeforeMethod
public void applicationLanch(){
	System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
	driver=new ChromeDriver();
	Log.info("**** Chrome Browser Launched Successfully **********");
	driver.get(apilcationUrlAddress);
	
	driver.manage().window().maximize();
	
}
	 @AfterMethod
	 public void applicationClose() {
		driver.quit();
		
		
		Log.info(" ************ Chrome Browser along with OrangeHRM Application Closed Successfully ********");
	 }
}

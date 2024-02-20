package com.Frames;

import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";

	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "./BrowserDriveFiles/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	}

	public void applicationClose()
	{
	driver.close();
	}
	/*public static void main(String[] args) {
		
		BaseTest test=new BaseTest();
		test.applicationLaunch();
		//test.applicationClose();
		
	}*/
}
	

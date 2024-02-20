package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Google_lanch {
	
	public WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	@Test
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");

	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

}
}

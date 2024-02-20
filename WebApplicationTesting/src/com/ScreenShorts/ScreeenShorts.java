package com.ScreenShorts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeenShorts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver;
		String applicationUrlAddress="http://Instagram.com";

		System.setProperty("webdriver.chrome.driver", "./BrowserDriveFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// TakesScreenshot - its an interface
		// driver - is an object of a Class / Interface
		// ((TakesScreenshot)driver) - this process is referred to as Type Casting

		File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenShot, new File("./Screenshorts/bingHomePageScreenShot.png"));
System.out.println("printed sucesfully");
		driver.quit();
	}

}

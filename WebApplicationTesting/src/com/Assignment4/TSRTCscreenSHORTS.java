package com.Assignment4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTCscreenSHORTS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
		driver = new ChromeDriver();
		

		System.out.println(" ********* Chrome Browser Launched Successfully *********");
		
		File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenShot, new File(".//Screenshorts/TSRTC.png"));
	
	

		// Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);
		System.out.println(" Navigated to TSRTC Application ");

		// Property of the Header Block of TSRTC Application HomePage
		// class="menu-wrap"

		// Identifying the Header Block of the Webpage
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);

		// Identifying the Element in the Header Block

		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		// <a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		// <a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>

		By headerBlock_LinksProperty=By.tagName("a");

		// going to the header Block and finding all the elements of the Header Block
		List<WebElement>headerBlock_links=tsrtc_HeaderBlock.findElements(headerBlock_LinksProperty);

		// finding the number of links in the header block

		int headBlockLinksCount=headerBlock_links.size();
		System.out.println(" The number of links in the Header Block of TSRTC Application HomePage is :- "+headBlockLinksCount);


		for(int index=0;index<headBlockLinksCount;index++)
		{
		// getting the names of the identified elements of the Header Block
		String headBlockLinkName=headerBlock_links.get(index).getText();
		System.out.println(index +" - " +headBlockLinkName);

		headerBlock_links.get(index).click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();

		
		driver.navigate().back();


		

		//Thread.sleep(5000);
		tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		headerBlock_links=tsrtc_HeaderBlock.findElements(headerBlock_LinksProperty);

		headBlockLinksCount=headerBlock_links.size();
		System.out.println(" The current size of the arrayList is :- "+headBlockLinksCount);
		}

		driver.quit();

	}

}

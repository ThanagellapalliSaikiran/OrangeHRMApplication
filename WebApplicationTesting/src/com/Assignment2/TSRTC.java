package com.Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println(" ********* Chrome Browser Launched Successfully *********");

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

	}

}

package com.getUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetURl_GoogleHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://googele.com");
String  googleCurrentWebPageUrlAddress=driver.getCurrentUrl();
System.out.println(" The Current URL Address of the WebPage is :- "+googleCurrentWebPageUrlAddress);

driver.quit();

System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver1=new ChromeDriver();
driver1.get("http://youtube.com");
String  youtubeCurrentWebPageUrlAddress=driver1.getCurrentUrl();
System.out.println(" The Current URL Address of the WebPage is :- "+youtubeCurrentWebPageUrlAddress);

driver1.quit();



System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver2=new ChromeDriver();
driver2.get("http://Tsrtc.com");
String  TsrtcCurrentWebPageUrlAddress=driver2.getCurrentUrl();
System.out.println(" The Current URL Address of the WebPage is :- "+TsrtcCurrentWebPageUrlAddress);

driver2.quit();
	}

}

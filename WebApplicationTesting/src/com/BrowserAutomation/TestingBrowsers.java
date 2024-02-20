package com.BrowserAutomation;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;




public class TestingBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ChromeDriver sai=new ChromeDriver();
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver sai=new ChromeDriver();
sai.get("https://www.google.com/");
 
		
		
		
		
		
System.setProperty("webdriver.edge.driver","C:\\Users\\diobo\\OneDrive\\Desktop\\chinna\\WebApplicationTesting\\BrowserDriveFiles\\msedgedriver.exe ");
 EdgeDriver madhu=new EdgeDriver();
 madhu.get("https://www.youtube.com/");

 //System.setProperty("webdriver.gecko.driver","BrowserDriveFiles/geckodriver.exe" );
//FirefoxDriver chandu=new FirefoxDriver();

 System.setProperty("webdriver.opera.driver", "./BrowserDriveFiles/operadriver.exe");
 OperaDriver chandu=new OperaDriver();
 chandu.get("https://www.instagram.com");
	
	}
}

package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		String expected_BingHomePageTitle="Bing";
		 // Should Be Bing
		System.out.println(" The Expected Bing Home page Title is :- "+expected_BingHomePageTitle);


// Of the Current WebPage - identifying the Title
String actual_WebPageTitle=driver.getTitle();
System.out.println(" The Actual Web page Title is :- "+actual_WebPageTitle);

if(actual_WebPageTitle.equals(expected_BingHomePageTitle))
{
System.out.println(" The Title of the Bing Home Page Matched - PASS");
}
else
{
System.out.println(" The Title of the Bing Home Page NOT Matched - FAIL");
}

driver.close();

System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver1=new ChromeDriver();
driver1.get("http://google.com");
String expected_GoogleHomePageTitle="Google";
 
System.out.println(" The Expected Google Home page Title is :- "+expected_GoogleHomePageTitle);


String actual_WebPagesTitle=driver1.getTitle();
System.out.println(" The Actual Web page Title is :- "+actual_WebPagesTitle);

if(actual_WebPagesTitle.equals(expected_GoogleHomePageTitle))
{
System.out.println(" The Title of the Google Home Page Matched - PASS");
}
else
{
System.out.println(" The Title of the Google Home Page NOT Matched - FAIL");
}

driver1.close();

System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver2=new ChromeDriver();
driver2.get("http://instagram.com");
String expected_InstagramHomePageTitle="Instagram";
 
System.out.println(" The Expected Instagram Home page Title is :- "+expected_InstagramHomePageTitle);


String actual_WebPagesTitles=driver2.getTitle();
System.out.println(" The Actual Web page Title is :- "+actual_WebPagesTitles);

if(actual_WebPagesTitles.equals(expected_InstagramHomePageTitle))
{
System.out.println(" The Title of the Instagram Home Page Matched - PASS");
}
else
{
System.out.println(" The Title of the Instagram Home Page NOT Matched - FAIL");
}

driver2.close();


/*System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver3=new ChromeDriver();
driver3.get("http://Flipkart.com");
String expected_FlipkartHomePageTitle="Flipkart";
 
System.out.println(" The Expected Flipkart Home page Title is :- "+expected_FlipkartHomePageTitle);


String actual_WebPagesTitles1=driver3.getTitle();
System.out.println(" The Actual Web page Title is :- "+actual_WebPagesTitles1);

if(actual_WebPagesTitles1.equals(expected_InstagramHomePageTitle))
{
System.out.println(" The Title of the Flipkart Home Page Matched - PASS");
}
else
{
System.out.println(" The Title of the Flipkart Home Page NOT Matched - FAIL");
}

driver3.close();*/


System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver driver4=new ChromeDriver();
driver4.get("http://Youtube.com");
String expected_youtubeHomePageTitle="Youtube";
 
System.out.println(" The Expected youtube Home page Title is :- "+expected_youtubeHomePageTitle);


String actual_WebPagesTitles1=driver4.getTitle();
System.out.println(" The Actual Web page Title is :- "+actual_WebPagesTitles1);

if(actual_WebPagesTitles1.equals(expected_youtubeHomePageTitle))
{
System.out.println(" The Title of the youtube Home Page Matched - PASS");
}
else
{
System.out.println(" The Title of the youtube Home Page NOT Matched - FAIL");
}

driver4.close();

	}

}

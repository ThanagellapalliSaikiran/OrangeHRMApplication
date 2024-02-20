package com.ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo_Bing_HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver sai=new ChromeDriver();
//Navigating to Bing Application HomePage


/*sai.get("https://www.bing.com/");
 * 
 * 
sai.get("https://www.instagram.com/");
sai.close();*/


//sai.navigate().to(null);
sai.navigate().to("https://bing.com/");
sai.quit(); //quit browser
 
	}

}

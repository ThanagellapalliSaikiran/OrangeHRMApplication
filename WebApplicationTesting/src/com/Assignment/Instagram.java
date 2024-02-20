package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		String applicationURL="https://www.instagram.com/";
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationURL);

	
		driver.findElement(By.name("username")).sendKeys("chinna_dio_boy");
		
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("Amma@2326");
		
		Thread.sleep(4000);
		
	//	By logInButtonProperty=By.className("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1");
		
		//By logInButtonProperty=By.partialLinkText("Log in");
		By logInButtonProperty=By.xpath("//div[text()=Log in]");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		
		//String logInButtonText=logInButton.getText();
		//System.out.println("The Text of the webElement logInButton is  "+logInButtonText);
		logInButton.click();
	}

}
//<div class="x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s
//xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1">Log in</div>
package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver Chrom=new ChromeDriver();
Chrom.get("http://bing.com");
//Of the Current WebPage - identifying the Title

String bingTitle=Chrom.getTitle(); // the identified title is assigned to a variable "bingTitle"

System.out.println(" The Title of the Bing Current WebPage is :- "+bingTitle);

Chrom.quit();

System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver Chrom1=new ChromeDriver();
Chrom1.get("http://google.com");
//Of the Current WebPage - identifying the Title

String googleTitle=Chrom1.getTitle(); // the identified title is assigned to a variable "bingTitle"

System.out.println(" The Title of the Google Current WebPage is :- "+googleTitle);

Chrom1.quit();

System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
ChromeDriver Chrom2=new ChromeDriver();
Chrom2.get("http://instagram.com");

//Of the Current WebPage - identifying the Title

String instagramTitle=Chrom2.getTitle(); // the identified title is assigned to a variable "bingTitle"

System.out.println(" The Title of the Instagram Current WebPage is :- "+instagramTitle);

Chrom2.quit();
	}

}

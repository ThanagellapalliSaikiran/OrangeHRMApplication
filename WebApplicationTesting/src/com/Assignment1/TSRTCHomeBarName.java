package com.Assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTCHomeBarName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String applicatinUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(applicatinUrlAddress);*/


String applicationUralAddress="https://www.tsrtconline.in/oprs-web/";
System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(applicationUralAddress);

By tsrtc_headerBlockProperty=By.className("menu");
WebElement tsrtc_headerBlock=driver.findElement(tsrtc_headerBlockProperty);

By TSRTCLinkProperty=By.tagName("a");
List<WebElement>TSRTCLinkName=tsrtc_headerBlock.findElements(TSRTCLinkProperty);

int TSRTCHeaderLink_Count=TSRTCLinkName.size();
System.out.println("The no of webElement which are of the type link of the TSRTCLinkName is :- "+TSRTCHeaderLink_Count);

for( int arrayindex=0; arrayindex<TSRTCHeaderLink_Count;  arrayindex++)  
{
	String TSRTCHeaderLink_count_LinkName=TSRTCLinkName.get(arrayindex).getText();
	System.out.println(arrayindex+"   "+TSRTCHeaderLink_count_LinkName);
}
driver.quit();





/*<div class="menu-wrap">
<div class="menu">
<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		Home</a>
	<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
	<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
	<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
	<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
	<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
	<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
	<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
</div>
</div>*/
/*By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
List<WebElement>tsrtc_HeaderBlock=driver.findElements(tsrtc_HeaderBlockProperty);
int tsrtc_HeaderBlock_Count=tsrtc_HeaderBlock.size();
System.out.println("The no of webElement which are of the type link of the tsrtc_HeaderBlock is :-  "+tsrtc_HeaderBlock_Count);
for(int index=0; index<tsrtc_HeaderBlock_Count; index++) {
	String tsrtc_HeaderBlock_Count_LinkName=tsrtc_HeaderBlock.get(index).getText();
	System.out.println(index +" "+ tsrtc_HeaderBlock_Count_LinkName);*/
}
/*
By HeaderBlockProperty=By.tagName("a");
List<WebElement>HeaderBlock=driver.findElements(HeaderBlockProperty);
int headerBloclkcount=HeaderBlock.size();

System.out.println("the number of tsrtc manu links "+headerBloclkcount);
for(int index=0;index<headerBloclkcount;index++)
{

// getting the names of the identified elements of the Header Block
String TSRCTHeaderBloclkLink=HeaderBlock.get(index).getText();
System.out.println(index +"  "+ TSRCTHeaderBloclkLink);
}
*/
















	}



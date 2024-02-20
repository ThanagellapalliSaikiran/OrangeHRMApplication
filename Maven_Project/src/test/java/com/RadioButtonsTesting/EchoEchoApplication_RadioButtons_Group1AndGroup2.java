package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Application_Lanching.BaseTest;

public class EchoEchoApplication_RadioButtons_Group1AndGroup2 extends BaseTest {
	
	@Test
	public void group1RadioButtonsTesting() throws InterruptedException
	{
	/*
	<input type="radio" name="group1" value="Milk">
	<input type="radio" name="group1" value="Butter" checked="">
	<input type="radio" name="group1" value="Cheese">

	<input type="radio" name="group2" value="Water">
	<input type="radio" name="group2" value="Beer">
	<input type="radio" name="group2" value="Wine" checked="">
	*/

	// System.out.println(" Application Functionality Testing ");


	By group1RadioButtonsProperty=By.name("group1");
	List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsProperty);
	
	By group2RadioButtonsProperty=By.name("group2");
	List<WebElement>group2RadioButtons=driver.findElements(group2RadioButtonsProperty);


	int group1RadioButtonsCount=group1RadioButtons.size();
	System.out.println(" The number of Radio Buttons in Group1 are :- "+group1RadioButtonsCount);
	
	int group2RadioButtonsCount=group2RadioButtons.size();
	System.out.println(" The number of Radio Buttons in Group2 are :- "+group1RadioButtonsCount);

	for(int radioButtonClick=0;radioButtonClick<group2RadioButtonsCount;radioButtonClick++)
	{
	String group1RadioButtonName=group1RadioButtons.get(radioButtonClick).getAttribute("value");
	
	System.out.println(group1RadioButtonName);
	System.out.println();
	
	String group2RadioButtonName=group2RadioButtons.get(radioButtonClick).getAttribute("value");
	System.out.println(group2RadioButtonName);
    group2RadioButtons.get(radioButtonClick).click();


	//Thread.sleep(10000);

	// Getting the Status of the Radio Buttons
	for(int radioButtonsStatus=0;radioButtonsStatus<group2RadioButtonsCount;radioButtonsStatus++ )
	{
	
		System.out.println(group1RadioButtons.get(radioButtonsStatus).getAttribute("value")+" - "+ group1RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
	System.out.println();
		
		
		System.out.println(group2RadioButtons.get(radioButtonsStatus).getAttribute("value")+" - "+ group2RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
	}
	
	}


	}
	
	
	
}

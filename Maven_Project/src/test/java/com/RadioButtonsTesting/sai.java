package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Application_Lanching.BaseTest;

public class sai extends BaseTest {

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

	int group1RadioButtonsCount=group1RadioButtons.size();
	System.out.println(" The number of Radio Buttons in Group1 are :- "+group1RadioButtonsCount);

	for(int radioButtonClick=0;radioButtonClick<group1RadioButtonsCount;radioButtonClick++)
	{
	String group1RadioButtonName=group1RadioButtons.get(radioButtonClick).getAttribute("value");
	System.out.println(group1RadioButtonName);

	group1RadioButtons.get(radioButtonClick).click();


	//Thread.sleep(10000);

	// Getting the Status of the Radio Buttons
	for(int radioButtonsStatus=0;radioButtonsStatus<group1RadioButtonsCount;radioButtonsStatus++ )
	{
	System.out.println(group1RadioButtons.get(radioButtonsStatus).getAttribute("value")+" - "+ group1RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
	}
	}

	By group2RadioButtonsProperty=By.name("group2");
	List<WebElement>group2RadioButtons=driver.findElements(group2RadioButtonsProperty);

	int group2RadioButtonsCount=group2RadioButtons.size();
	System.out.println(" The number of Radio Buttons in Group2 are :- "+group2RadioButtonsCount);

	for(int radioButtonClick2=0;radioButtonClick2<group2RadioButtonsCount;radioButtonClick2++)
	{
	String group2RadioButtonName=group2RadioButtons.get(radioButtonClick2).getAttribute("value");
	System.out.println(group2RadioButtonName);

	group1RadioButtons.get(radioButtonClick2).click();


	//Thread.sleep(10000);

	// Getting the Status of the Radio Buttons
	for(int radioButtonsStatus2=0;radioButtonsStatus2<group2RadioButtonsCount;radioButtonsStatus2++ )
	{
	System.out.println(group2RadioButtons.get(radioButtonsStatus2).getAttribute("value")+" - "+ group2RadioButtons.get(radioButtonsStatus2).getAttribute("checked"));
	}
	}
	}
	
	
}
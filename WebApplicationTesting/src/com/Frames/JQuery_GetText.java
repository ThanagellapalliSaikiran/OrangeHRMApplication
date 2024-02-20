package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JQuery_GetText extends BaseTest {
	

	public void jQuery_getText_DragMeToMyTarget() throws InterruptedException
	{
	Thread.sleep(3000);

	// Property of the Frame
	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

	By jQueryFrameProperty=By.className("demo-frame");
	WebElement jQueryFrame=driver.findElement(jQueryFrameProperty);

	// we should Switch into the Frame of the WebPage

	driver.switchTo().frame(jQueryFrame);


	// finding the Element in the Frame of the WebPage

	// id="draggable" - property of "Drag Me To My Target"
	// id="draggable"
	By dragMeToMyTargetProperty=By.id("draggable");
	WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
	String dragMeToMyTarget_Text=dragMeToMyTarget.getText();

	System.out.println(" The Text of the WebElement is :- "+dragMeToMyTarget_Text);


	}

	public static void main(String[] args) throws InterruptedException {

	JQuery_GetText jQuery = new JQuery_GetText();
	jQuery.applicationLaunch();
	jQuery.jQuery_getText_DragMeToMyTarget();

	// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
	// Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element

	jQuery.applicationClose();


	}

	
}

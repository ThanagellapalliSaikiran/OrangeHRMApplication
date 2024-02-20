package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation extends BaseTest {
	
	public void dragAndDropOperation() throws InterruptedException
	{
	// Thread.sleep(3000);

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

	// id="droppable" - Drop Here WebElement Property
	By droppableProperty=By.id("droppable");
	WebElement droppable=driver.findElement(droppableProperty);
	String droppableText=droppable.getText();

	System.out.println(" The Text of Droppable WebElement is :- "+droppableText);

	// Drag and Drop Operation

	Actions action = new Actions(driver);
	action.dragAndDrop(dragMeToMyTarget, droppable).build().perform();


	}

	public static void main(String[] args) throws InterruptedException {

	DragAndDropOperation dragAndDropTest = new DragAndDropOperation();
	dragAndDropTest.applicationLaunch();
	dragAndDropTest.dragAndDropOperation();
	// dragAndDropTest.applicationClose();

	}


	}	
	
	
	



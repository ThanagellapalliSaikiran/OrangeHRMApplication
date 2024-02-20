package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResizableTest extends BaseTest {

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

	// driver should be made to exit from the frame - should be made it back to the Actual WebPage

	driver.switchTo().defaultContent();


	}


	public void resizableTest() throws InterruptedException
	{
	// <a href="https://jqueryui.com/resizable/">Resizable</a>
	// <a href="https://jqueryui.com/resizable/">Resizable</a>

	// Thread.sleep(5000);

	By reziableProperty=By.linkText("Resizable");
	WebElement resizable=driver.findElement(reziableProperty);

	resizable.click();

	System.out.println(" The Title of the Resizable WebPage is :- "+driver.getTitle());

	}

	public static void main(String[] args) throws InterruptedException {

	ResizableTest test = new ResizableTest();
	test.applicationLaunch();
	test.dragAndDropOperation();
	test.resizableTest();

	}


}

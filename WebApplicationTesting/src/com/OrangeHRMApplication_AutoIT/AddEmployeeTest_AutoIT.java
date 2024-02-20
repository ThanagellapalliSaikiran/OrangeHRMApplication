package com.OrangeHRMApplication_AutoIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployeeTest_AutoIT extends BaseTest {
	

	
	String expected_OrangeHRMApplicationLogInPageText;
	By orangeHRMApplicationLogInPageTextProperty;
	WebElement orangeHRMApplicationLogInPage;

	String actual_OrangeHRMApplicationLogInPageText;

	@Test(priority=1,description="Validating OrangeHRM Application LogIn WebPage")
	public void logInPageTest()
	{

	// Validating Title
	String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
	System.out.println(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);

	String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
	System.out.println(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);

	if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
	{
	System.out.println("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
	}

	// validating Url

	// Validating Text - LOGIN Panel

	expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
	orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

	actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	System.out.println(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
	}
	else
	{
	System.out.println(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
	}


	}

	Row logInTestDataRow;
	Cell userNameTestDataCell;
	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet Sheet;

	@Test(priority=2,description="Validating OrangeHRM Application LogIn Functionality")
	public void logInTest() throws IOException
	{

	logInTestDataFile= new FileInputStream("./src/com/excel/AddEmployee _2.xlsx");
	workBook= new XSSFWorkbook(logInTestDataFile);
	Sheet= workBook.getSheet("Sheet3");

	logInTestDataRow=Sheet.getRow(1);
	userNameTestDataCell=logInTestDataRow.getCell(6);

	String userNameTestData=userNameTestDataCell.getStringCellValue();


	// String userNameTestData="srini"; // Test Data
	By userNamePoperty=By.id("txtUsername"); // Property of an element is identified and assigned to a variable
	WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Webpage
	userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement


	Cell passwordTestDataCell=logInTestDataRow.getCell(7);
	String passwordTestData=passwordTestDataCell.getStringCellValue();
	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">


	// String passwordTestData="Q@Trainer7";
	By passwordProperty=By.name("txtPassword");
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);



	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();



	}
	WebElement welComeAdmin;
	@Test(priority=3,description="Validating OrangeHRM Application HomePage WebPage")
	public void homePageTest() throws IOException
	{

	// Validating Title
	String expected_OrangeHRMAplicationHOMEPageTitle="OrangeHRM";
	System.out.println(" The expected title of the OrangeHRm Application HOME Page is :- "+expected_OrangeHRMAplicationHOMEPageTitle);
	
	

	String actual_OrangeHRMAplicationHOMEPageTitle=driver.getTitle();
	System.out.println(" The actual title of the OrangeHRm Application HOME Page is :- "+actual_OrangeHRMAplicationHOMEPageTitle);

	if(actual_OrangeHRMAplicationHOMEPageTitle.equals(expected_OrangeHRMAplicationHOMEPageTitle))
	{
	System.out.println("Successfully Navigated to OrangeHRM Application HOME WebPage - PASS");
	
	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application HOME WebPage - FAIL");
	
	
	}

	// Validating OrangeHRM Appliation Home Page - expected Text - Welcome (should have)

	// Properties of WelCome Admin Element
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	// By welComeAdminProperty=By.id("welcome");
	//By welComeAdminProperty=By.linkText("Welcome Admin");
	// By welComeAdminProperty=By.partialLinkText("Welcome");
	By welComeAdminProperty=By.partialLinkText("Admin");

	welComeAdmin=driver.findElement(welComeAdminProperty);

	String expected_OrangeHRMApplicationHomePageText="Welcome";
	System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
	Sheet.getRow(1).createCell(9).setCellValue(actual_OrangeHRMApplicationHomePageText);
	Sheet.getRow(1).createCell(10).setCellValue("pass");

	//Row newRow=logInTestDataSheet.createRow(1);
	Cell testRowOfCell=logInTestDataRow.createCell(2);
	testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");

	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
	Sheet.getRow(1).createCell(9).setCellValue("Not macth"+actual_OrangeHRMApplicationHomePageText);
	Sheet.getRow(1).createCell(10).setCellValue("Fail");
	

	//Row newRow=logInTestDataSheet.createRow(1);
	Cell testRowOfCell=logInTestDataRow.createCell(2);
	testRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
	}

	
	}


	@Test(priority=4,description="Validating OrangeHRM Application Home Page PIM Functionality ")
	public void pimTest() throws IOException
	{

	// id="menu_pim_viewPimModule"

	By pimProperty=By.id("menu_pim_viewPimModule");
	WebElement pim=driver.findElement(pimProperty);

	Actions pimAction = new Actions(driver);
	pimAction.moveToElement(pim).build().perform();
	
	String Expect_AddAdminText="Full Name";
	System.out.println("The Expect OrangeHrm AddAdmin page Text is :-  " +Expect_AddAdminText);

	//<label class="hasTopFieldHelp">Full Name</label>
	By fullNameProperty=By.className("hasTopFieldHelp");
	WebElement fullName=driver.findElement(fullNameProperty);

	String Actual_AddEmployeeText=fullName.getText();
	System.out.println("The Actual OrangeHrm AddAdmin Page text is :-  "+Actual_AddEmployeeText);

	if(Actual_AddEmployeeText.equals(Expect_AddAdminText))
	{
	System.out.println("The Add Employee Page Text is Match ;-  PASS");
	Sheet.getRow(1).createCell(12).setCellValue(Actual_AddEmployeeText);
	Sheet.getRow(1).createCell(13).setCellValue("PASS");
	}
	else {
	System.out.println("The Add Employee Page Text is NOT Match :-  FAIL");
	Sheet.getRow(1).createCell(12).setCellValue("NOT Match Text - "+Actual_AddEmployeeText);
	Sheet.getRow(1).createCell(13).setCellValue("FAIL");
	}

	
	

	

	}

	@Test(priority=5,description="Validating OrangeHRM Application Home Page PIM - AddEmployee Functionality ")
	public void pimAddEmployeeTest()
	{
	// id="menu_pim_addEmployee"
	By addEmployeeProperty=By.id("menu_pim_addEmployee");
	WebElement pimAddEmployee=driver.findElement(addEmployeeProperty);
	pimAddEmployee.click();


	}



	@Test(priority=6,description="Validating OrangeHRM Application AddEmployee WebPage Test ")
	public void AddEmployeeWebPageTest()
	{
	System.out.println("*********** Add Employee WebPage Test Successfull ***********");
	}



	@Test(priority=7,description="Validating OrangeHRM Application AddEmployee Functionality  Test ")
	public void AddEmployeeTest() throws InterruptedException, IOException
	{
		
	String	Firstname=logInTestDataRow.getCell(14).getStringCellValue();
		
		
	// id="firstName"
	By firstNameProperty=By.id("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys(Firstname);


	
	// working with the Keys of the KeyBoard

	Actions keyBoardActions = new Actions(driver);
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	
	
	// MiddleName
	String Middlename=logInTestDataRow.getCell(15).getStringCellValue();
	keyBoardActions.sendKeys(Middlename).build().perform();

	// LastName
	 String LastName=logInTestDataRow.getCell(16).getStringCellValue();
	keyBoardActions.sendKeys(Keys.TAB).build().perform();
	keyBoardActions.sendKeys(LastName).build().perform();


	// EmployeeID
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// Photograph
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// Enter Key of KeyBoard
	keyBoardActions.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(10000);

	java.lang.Runtime.getRuntime().exec("./AutoIT/sai.exe");

	Thread.sleep(5000);

	// <input type="button" class="" id="btnSave" value="Save">

	By saveButtonProperty=By.id("btnSave");
	WebElement saveButton=driver.findElement(saveButtonProperty);

	saveButton.click();
	
	
	


	}


	// Validing Personal Details Webpage

	@Test(priority=8,description="Validating OrangeHRM Application Personal Details WebPage  Test ")
	public void personalDetailsWebPageTest()
	{
	System.out.println(" **** Successfully Navigaed to Persoanl Details WebPage **********");
	}


	@Test(priority=9,description="Validating OrangeHRM Application Personal Details Functionality Test ")
	public void personalDetailsTest() throws InterruptedException, IOException
	{

	// validating FirstName, MiddleName, LastName , EmployeeID  and Photograph
	// id="empPic"

	By personalDetailsPageImageProperty=By.id("empPic");
	WebElement personalDetailsEmployeeImage=driver.findElement(personalDetailsPageImageProperty);

	boolean flag=personalDetailsEmployeeImage.isDisplayed();

	if(flag)
	{
	System.out.println(" Employee Photograph existing - PASS ");
	}
	else
	{
	System.out.println(" Employee Photograph NOT existing - FAIL" );
	}

	

	FileOutputStream testResultFile = new FileOutputStream("./src/com/excel/AddEmployee _2.xlsx");
	workBook.write(testResultFile);



	}


}

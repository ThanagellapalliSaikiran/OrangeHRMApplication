package com.Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.ByteString;

public class OrangHRM_PIM_AddEmployee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		//OrangeHRM navigation
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		
		//Automation the browser
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		driver.manage().window().maximize();
		// Validating the Web page
		// Expected OrangeHRM Title
		String expected_OrangeHRMHWebpageTitle="OrangeHRM";
		 
		System.out.println(" The Expected OrangHRM Home page Title is :- "+expected_OrangeHRMHWebpageTitle);


		String actual_OrangeHRMHWebpageTitle=driver.getTitle();
		System.out.println(" The Actual Web page Title is :- "+actual_OrangeHRMHWebpageTitle);

		if(actual_OrangeHRMHWebpageTitle.equals(expected_OrangeHRMHWebpageTitle))
		{
		System.out.println(" The Title of the OrangeHRM web Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM web Page NOT Matched - FAIL");
		}
System.out.println();
//driver.close();
		
		
		// Expected URL TO Actual URL
		
		String expected_OrangeHRMUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("the expected OrangeHRM URL is :-"+expected_OrangeHRMUrl);
		String actual_OrangeHRMUrl=driver.getCurrentUrl();
		System.out.println("the actual orangeHRM URL is :-"+actual_OrangeHRMUrl);
		if(actual_OrangeHRMUrl.equals(expected_OrangeHRMUrl))
		{
		System.out.println(" The Title of the OrangeHRM web Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM web Page NOT Matched - FAIL");
		}
		
		System.out.println();
		
		//Expected text login panel
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		String expected_logInPanel="LOGIN Panel";
		System.out.println("The expected login panel is :-"+expected_logInPanel);
		WebElement actual_logInPanel=driver.findElement(By.id("logInPanelHeading"));
		System.out.println("the actual Login Panel  is :-"+actual_logInPanel.getText());
		if(actual_logInPanel.getText().equals(expected_logInPanel))
		{
		System.out.println(" The Title of the Login Pane should be  same - PASS");
		}
		else
		{
			System.out.println(" The Title of the Login Pane should not be  same - Fail");
		}
		System.out.println();
		
		//validating data user name and password
		//User name 
		String userNameTestData="Admin"; 
		By userNamePoperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNamePoperty); 
		userName.sendKeys(userNameTestData); 
		
		//Password
		String userpasswordTestData="Livetech@123";
		By userpasswordPoperty=By.id("txtPassword");
		WebElement password=driver.findElement(userpasswordPoperty);
		password.sendKeys(userpasswordTestData);

		//login 
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
	
		//Validating the home page
		String expected_ValidatingOrangeHRMHomePage="OrangeHRM";
		System.out.println(" The Expected OrangHRM Home page  is :- "+expected_ValidatingOrangeHRMHomePage);


		String actual_ValidatingHomePage=driver.getTitle();
		System.out.println(" The Actual Validating Home Page is :- "+actual_ValidatingHomePage);

		if(actual_ValidatingHomePage.equals(expected_ValidatingOrangeHRMHomePage))
		{
		System.out.println(" The Validating of the OrangeHRM Home Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Validating of the OrangeHRM Home Page NOT Matched - FAIL");
		}
		System.out.println();
		
		//title 
		String expected_OrangeHRMTitle="OrangeHRM";
		 
		System.out.println(" The Expected OrangHRM Home page Title is :- "+expected_OrangeHRMTitle);


		String actual_OrangeHRMTitle=driver.getTitle();
		System.out.println(" The Actual Web page Title is :- "+actual_OrangeHRMTitle);

		if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
		{
		System.out.println(" The Title of the OrangeHRM web Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the OrangeHRM web Page NOT Matched - FAIL");
		}
		
		System.out.println();
		
		//text to welcome
		
	
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
		//id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>	
		
			//driver.findElement(By.id("menu_pim_viewPimModule")).click();
			By MenuProperty= By.id("menu_pim_viewPimModule");
			WebElement Pim_manu=driver.findElement(MenuProperty);
			Pim_manu.click();
			
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee
			//" id="menu_pim_addEmployee">Add Employee</a>
		//driver.findElement(By.id("menu_pim_addEmployee")).click();
			
			By AddEmployeeProperty=By.id("menu_pim_addEmployee");
			WebElement Pim_AddEmployee=driver.findElement(AddEmployeeProperty);
			Pim_AddEmployee.click();
	//	<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		
		//driver.findElement(By.name("firstName")).sendKeys("Thangellapalli");
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		
		By firstNameProperty=By.name("firstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys("Thangellapalli");
		
		
		
		
		//driver.findElement(By.name("middleName" )).sendKeys("Sai");
		
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		
		By middleNameProperty=By.name("middleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.sendKeys("Sai");
		
		
		
		//driver.findElement(By.name("lastName")).sendKeys("Kiran");
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
		
		By lastNameProperty=By.name("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys("Kiran");
		
		//<input value="0001" type="text" name="personal[txtEmployeeId]"
		//maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">	
		
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0013" id="employeeId">
		By empoyeeid=By.id("employeeId");
		WebElement employeeidname=driver.findElement(empoyeeid);
		String employeeidproperty=employeeidname.getAttribute("value");
		System.out.println("the value of employee id is :- "+employeeidproperty);
				
	//	<input type="button" class="" id="btnSave" value="Save">
By	saveProperty=By.id("btnSave");
 WebElement save =driver.findElement(saveProperty);
 save.click();
 
// After saving user details 
 
//<input value="Thangellapalli" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name"
 //id="personal_txtEmpFirstName" disabled="disabled"> 

	By SavingFirstNameProperty=By.id("personal_txtEmpFirstName" );
	WebElement FirstName =driver.findElement(SavingFirstNameProperty);
	String Expected_firstname=FirstName.getAttribute("value");
	
	//<input value="Sai" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" 
	//id="personal_txtEmpMiddleName" disabled="disabled">	
	By SavingMiddleNameProperty=By.id("personal_txtEmpMiddleName");
	WebElement MiddleName=driver.findElement(SavingMiddleNameProperty);
	String Expected_middlename=MiddleName.getAttribute("value");
	
	
	//<input value="Kiran" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" 
	//id="personal_txtEmpLastName" disabled="disabled">
	
	By SavigLastNameProperty=By.id("personal_txtEmpLastName");
	WebElement Expected_LastName=driver.findElement(SavigLastNameProperty);
	String LastName=Expected_LastName.getAttribute("value");
	//<input value="0017" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" 
	//id="personal_txtEmployeeId" disabled="disabled">
	
By	EmplyeeIdProperty=By.id("personal_txtEmployeeId");
WebElement EmplyeeId=driver.findElement(EmplyeeIdProperty);
 String Expected_EmplyeeId=EmplyeeId.getAttribute("value");
 
 

	
	if(Expected_firstname.equals("Thangellapalli")) {
		System.out.println("After saving both are :- pass");
		
	}
	else {
		System.out.println("After saving both are :- Fail");
		
	
	}
	
		
	
	if(Expected_middlename.equals("Sai")) {
		
		System.out.println("After saving both are :- pass");
		
	}
	else {
		
		System.out.println("After saving both are :- Fail");
		
	}
		
	if(LastName.equals("Kiran")) {
	
		System.out.println("After saving both are :- pass");
	}
	else {
		System.out.println("After saving both are :- Fail");
	}
		
	if(Expected_EmplyeeId.equals(Expected_EmplyeeId)){
		
		System.out.println("After saving both are :- pass");
	}
	else {
		System.out.println("After saving both are :- Fail");
	}	
	
	By welComeAdminProperty=By.partialLinkText("Admin");

	WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

	String expected_OrangeHRMApplicationHomePageText="Welcome";
	System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
	}
	else
	{
	System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
	}


	welComeAdmin.click();
	System.out.println();
	//Logout
	Thread.sleep(1000);


	By logOutProperty=By.linkText("Logout");
	WebElement logOutt=driver.findElement(logOutProperty);
	logOutt.click();
	driver.close();
	
		
		
		
		
		
		
		
	
	
	}}
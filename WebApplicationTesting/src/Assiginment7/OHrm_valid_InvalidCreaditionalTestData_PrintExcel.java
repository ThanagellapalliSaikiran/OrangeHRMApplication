package Assiginment7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHrm_valid_InvalidCreaditionalTestData_PrintExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "./BrowserDriveFiles/chromedriver.exe");

		driver=new ChromeDriver();

		driver.get(applicationUrlAddress);

		//Maximizing the Browser
		driver.manage().window().maximize();



		// Identify the file in the system

		FileInputStream creaditionalTestData=new FileInputStream("./src/com/excel/OHRM_LogInTestData.xlsx");

		// Identify workbook in the file
		XSSFWorkbook workBook=new XSSFWorkbook(creaditionalTestData);

		// Identify the Sheet in the WorkBook
		XSSFSheet sheet=workBook.getSheet("Sheet1");

		// Identifying the number Active Rows with the test data in the sheet
		int row_Count=sheet.getLastRowNum();
		    System.out.println("The number of rows in the sheet is :-  "+row_Count);

		// To goto all the Action Rows in the sheet

		for(int rowIndex=1; rowIndex<=sheet.getLastRowNum(); rowIndex++) {





		//**** Expetced Text - LOGIN Panel (should be same)


		// <div id="logInPanelHeading">LOGIN Panel</div>


		String expected_OrangeHrmLogInPanel="LOGIN Panel";
		System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);


		// of the current webpage - identifying the LOGIN Panel



		By OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
		WebElement OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);

		String actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
		System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);


		if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
		{
		System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
		sheet.getRow(rowIndex).createCell(2).setCellValue(actual_OrangeHrmLogInPanel);
		sheet.getRow(rowIndex).createCell(3).setCellValue("PASS");
		}
		else {
		System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
		sheet.getRow(rowIndex).createCell(2).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
		sheet.getRow(rowIndex).createCell(3).setCellValue("FAIL");
		}

		FileOutputStream sai=new FileOutputStream("./src/com/excel/OHRM_LogInTestData.xlsx");
		                 
		                 workBook.write(sai);

		System.out.println();



		XSSFRow row =sheet.getRow(rowIndex);

		             
		     
		           String userName=row.getCell(4).getStringCellValue();  //TestData
		           System.out.println("The no of rowOfCell userName is :-   "+userName);
		           
		           
		By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
		WebElement userNames=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
		userNames.sendKeys(userName);


		String userNamePassword=row.getCell(5).getStringCellValue();
		System.out.println("The no of rowOfCell userNamePassword  :-"+userNamePassword);

		   By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(userNamePassword);

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


		By logInButtonProperty=By.className("button");
		   WebElement LogInButton=driver.findElement(logInButtonProperty);
		LogInButton.click();


		String Expected_WebpageUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.out.println("The Expected webpage Url is :-  "+Expected_WebpageUrl);

		          String actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
		          System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
		         

		//if (welcomeHrefAttributeValue.equals(Actual_WebpageText))
		          if(actual_OrangeHrmLogInPageURL.equals(Expected_WebpageUrl))
		{



		 
		         
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		String Actual_WebpageText= "welcome";
		System.out.println("The Expected OrangeHrm Home page text is Welcome  :-  "+Actual_WebpageText);


		By welcomeAdminProperty=By.linkText("Welcome Admin");
		WebElement welcome=driver.findElement(welcomeAdminProperty);


		String welcomeHrefAttributeValue=welcome.getAttribute("id");
		System.out.println("The href Attribute value of welcome webElement is :- "+welcomeHrefAttributeValue);



		System.out.println("Url is Matched - PASS");
		   sheet.getRow(rowIndex).createCell(7).setCellValue(welcomeHrefAttributeValue);
		   sheet.getRow(rowIndex).createCell(8).setCellValue("PASS ");
		   

		   
		   welcome.click();
		   
		Thread.sleep(5000);

		 //******************************************************************************************


		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>


		 
		By LogoutButtonProperty=By.linkText("Logout");
		WebElement LogoutButton=driver.findElement(LogoutButtonProperty);
		LogoutButton.click();
		 

		//******************************************************************************************    
		   



		                  // <div id="logInPanelHeading">LOGIN Panel</div>


		expected_OrangeHrmLogInPanel="LOGIN Panel";
		System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);


		                 //     of the current webpage - identifying the LOGIN Panel



		OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
		OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);

		actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
		System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);


		if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
		{
		System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
		sheet.getRow(rowIndex).createCell(10).setCellValue(actual_OrangeHrmLogInPanel);
		sheet.getRow(rowIndex).createCell(11).setCellValue("PASS");
		}
		else {
		System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
		sheet.getRow(rowIndex).createCell(10).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
		sheet.getRow(rowIndex).createCell(11).setCellValue("FAIL");
		}



		   
		   
		}
		else {
		   System.out.println("Url is NOT Matched - FAIL");
		sheet.getRow(rowIndex).createCell(7).setCellValue("Not Match the title Welcome");
		sheet.getRow(rowIndex).createCell(8).setCellValue("Not Match The webpage FAIL");
		//driver.get(actual_OrangeHrmLogInPageURL);

		sheet.getRow(rowIndex).createCell(10).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
		sheet.getRow(rowIndex).createCell(11).setCellValue("FAIL");


		//driver.get(actual_OrangeHrmLogInPageURL);
		}
		          if(actual_OrangeHrmLogInPageURL.equals(Expected_WebpageUrl))
		          {    

		          System.out.println("Url is Matched - PASS");
		          sheet.getRow(rowIndex).createCell(1).setCellValue("Valid_Credentials "); 
		          }
		          else
		          {
		                System.out.println("Url is NOT Matched - FAIL");
		                sheet.getRow(rowIndex).createCell(1).setCellValue("InValid_Credentials ");
		                 }
		          
		          
		         
		          FileOutputStream Sai=new FileOutputStream("./src/com/excel/OHRM_LogInTestData.xlsx");
		workBook.write(Sai);


		         
		          driver.get(actual_OrangeHrmLogInPageURL);


		}

		driver.quit();		
		
		
		
		
	}

}

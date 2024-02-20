package OrangeHRM_Multipul_Data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class LogIn_With_Multiple_Data extends BaseTest {
	
	public LogIn_With_Multiple_Data() // Constructor - When  a class Name is similar to the Method Name
	{
	// TODO Auto-generated constructor stub


	PageFactory.initElements(driver, this);


	}



	// <div id="logInPanelHeading">LOGIN Panel</div>

	// 1. Identification of WebElements
	@FindBy(id="logInPanelHeading")
	WebElement logInPanelText;

	// 2. Performing Operation on the WebElement - Business Logics(user defined method)


	public void orangeHRMApplicationLogInPage_logInPannelTextValidation() {


	String expected_OrangeHRMApplicationLogInPageLogINPannelText="LOGIN Panel";
	Log.info(" The Expected Text of the WebElement LogIn Pannel is :-  "+expected_OrangeHRMApplicationLogInPageLogINPannelText);


	String actual_OrangeHRMApplicationLogInPageLogInPannelText=logInPanelText.getText();
	Log.info(" The Expected Text of the WebElement LogIn Pannel is :-  "+actual_OrangeHRMApplicationLogInPageLogInPannelText);

	if(actual_OrangeHRMApplicationLogInPageLogInPannelText.equals(expected_OrangeHRMApplicationLogInPageLogINPannelText)) {

	Log.info(" LogIn pannel Text Validation Successful - PASS ");
	}
	else {
	Log.info(" LogIn Pannel Text Validation NOT Successful - FAIL ");
	}



	}


	// /html/body/div[1]/div/div[2]/div/img

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMApplicationLogInPageLogo;

	public void orangeHRMApplicationLogInPageLogoValidation() {

	boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();

	if(flag) {

	Log.info(" OrangeHRM Application LogIn page Logo Found - PASS ");

	}
	else {
	Log.info(" OrangeHRM Application LogIn Page Logo NOT Found - FAIL");
	}



	}


	// id="txtUsername"
	@FindBy(id = "txtUsername")
	WebElement userName;

	// name="txtPassword"
	@FindBy(name = "txtPassword")
	WebElement password;

	// class="button"
	@FindBy(className = "button")
	WebElement logInButton;


	static String applictaionUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	public void orangeHRMApplicationLodInPage_logInValidation(String UserName,String Password) throws IOException, InterruptedException {

	/*
	  userName.sendKeys(UserName);
	  password.sendKeys(Password);
	  logInButton.click();
	 
	  */
	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet Sheet;

	XSSFRow row;
	String userNameTestData;
	String userNamePassword;

	String expected_OrangeHrmLogInPageURL;
	     String actual_OrangeHrmLogInPageURL;


	    


	     //Identify the File in the system
	logInTestDataFile=new FileInputStream("./src/test/java/OrangeHRM_Multipul_Data/sai.xlsx");
	       
	//Identify the WorkBook in the File
	workBook=new XSSFWorkbook(logInTestDataFile);

	//Identify the Sheet in the WorkBook
	     Sheet=workBook.getSheet("Sheet2");
	 
	     
	     int row_Count =Sheet.getLastRowNum();
	System.out.println(row_Count);
	 
	     
	     for(int indexrow=1;  indexrow<=Sheet.getLastRowNum();  indexrow++)
	     {
	    row =Sheet.getRow(indexrow);

	               //   String userName=row.getCell(0).getStringCellValue();
	              //    String userNamePassword=row.getCell(1).getStringCellValue();
	                 
	     
	                userNameTestData=row.getCell(0).getStringCellValue();  //TestData
	   // By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
	// WebElement userNames=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
	                userName.sendKeys(userNameTestData);


	 userNamePassword=row.getCell(1).getStringCellValue();
	      //  By passwordProperty=By.name("txtPassword");
	 //  WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(userNamePassword);

	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


	// By logInButtonProperty=By.className("button");
	// WebElement LogInButton=driver.findElement(logInButtonProperty);
	logInButton.click();

	
	         
	         
	                 expected_OrangeHrmLogInPageURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	         
	         
	          System.out.println("The Expected OrangeHrm LogIn page URL is :- "+expected_OrangeHrmLogInPageURL);
	         
	          //of the current webpage - identifying the URL
	         
	          actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
	          System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
	         
	         
	         
	         
	          if (actual_OrangeHrmLogInPageURL.equals(expected_OrangeHrmLogInPageURL))
	          {
	         
	          System.out.println("Successfully Navigated to OrangeHrm LogIn Page URL Address Matched - PASS");
	          Sheet.getRow(indexrow).createCell(2).setCellValue("pass");
	         
	         
	          }
	          else
	          {
	         
	          System.out.println("Failed Navigated to OrangeHrm LogIn Page URL Address NOT Matched - FAIL");
	          Sheet.getRow(indexrow).createCell(2).setCellValue("FAIL");
	         
	          //driver.get(applictaionUrlAddress);
	          }
	         
	                     
	         
	         
	        
	                 
	                 driver.get(applictaionUrlAddress);
	         
	         
	          System.out.println("_____________________________________________________________________");
	         
	         
	             
	     
	     }
	 
	 
	     
	     
	     
	}


}

package com.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.Log;


public class LogInPage extends BaseTest {
	
		
	public LogInPage() {
	
	PageFactory.initElements(driver, this);	

	// <div id="logInPanelHeading">LOGIN Panel</div>
		
		
	}
	
@FindBy(id ="logInPanelHeading")
WebElement logInPanelText;

public void orangeHRMApplicationLogInPage_logInPannelTextValidation()
{

String expected_OrangeHRMApplicationLogInPageLogInPannelText="LOGIN Panel";

//System.out.println(" The Expected Text of the WebElement LogIn Pannel is :- "+expected_OrangeHRMApplicationLogInPageLogInPannelText);
Log.info(" The Expected Text of the WebElement LogIn Pannel is :- "+expected_OrangeHRMApplicationLogInPageLogInPannelText);

String actual_OrangeHRMApplicationLogInPageLogInPannelText=logInPanelText.getText();
//System.out.println(" The Actual Text of the WebElement LogIn Pannel is :- "+actual_OrangeHRMApplicationLogInPageLogInPannelText);
Log.info(" The Actual Text of the WebElement LogIn Pannel is :- "+actual_OrangeHRMApplicationLogInPageLogInPannelText);

if(actual_OrangeHRMApplicationLogInPageLogInPannelText.equals(expected_OrangeHRMApplicationLogInPageLogInPannelText))
{
Log.info(" LogIn Pannel Text Validation Successful - PASS");
}
else
{
Log.info(" LogIn Pannel Text Validation NOT Successful - FAIL");
}

}


// OrangeHRM Application WebElement Property
// /html/body/div[1]/div/div[2]/div/img

@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
WebElement orangeHRMApplicationLogInPageLogo;


public void orangeHRMApplicationLogInPageLogoValidation()
{

boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();

if(flag)
{
// System.out.println(" OrangeHRM Applicaiton LogIn page Logo found - PASS ");
Log.info(" OrangeHRM Applicaiton LogIn page Logo found - PASS ");
}
else
{
Log.info(" OrangeHRM Applicaiton LogIn page Logo NOT found - FAIL ");
}

}


// id="txtUsername"

@FindBy(id="txtUsername")
WebElement userName;


// name="txtPassword"
@FindBy(name="txtPassword")
WebElement password;

// class="button"
@FindBy(className="button")
WebElement logInButton;


public void orangeHRMApplicationLogInPage_logInValdiation(String UserName,String Password)
{
userName.sendKeys(UserName);
password.sendKeys(Password);
logInButton.click();

// Log Message
}



	
}

package com.OrangeHRMApplication_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipulData_Login extends BaseTest {
	
@Test
public void  login() throws IOException{
	
	FileInputStream file = new FileInputStream("./src/com/OrangeHRMApplication_TestNG/Chinna.xlsx");

	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet2");
	
	int rowcount =sheet.getLastRowNum();
	for (int i =1; i<=rowcount; i++) {
		
		XSSFRow row =sheet.getRow(i);
		
		String userName= row.getCell(0).getStringCellValue();
		String userPassword=row.getCell(1).getStringCellValue();
		
	//driver.findElement(By.id("txtUsername")).sendKeys(userName);
	
		By userNamePoperty=By.id("txtUsername"); 
		WebElement Excel_userName=driver.findElement(userNamePoperty); 
		 Excel_userName.sendKeys(userName); 
	
	
	
	//driver.findElement(By.id("txtPassword")).sendKeys(userPassword);
	
	
	By passwordProperty=By.name("txtPassword");
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(userPassword);

	
		//driver.findElement(By.className("button")).click();

	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();

		
		String expectedURl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		String actualURL=driver.getCurrentUrl();
		
		
//if(message.contentEquals(message)) {
if(actualURL.equals(expectedURl)) {
	

		sheet.getRow(i).createCell(2).setCellValue("pass");
		
		 System.out.println("Login Sucessfull");  
		
	}
	else {
		
		
		sheet.getRow(i).createCell(2).setCellValue("Fail");	
		System.out.println("Login Failed");
	}
//driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");		
	FileOutputStream fOut=new FileOutputStream("./src/com/OrangeHRMApplication_TestNG/Chinna.xlsx");
	
	
	workbook.write(fOut);
	
	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	
	}
	driver.close();
  
	
}
	
	
}
	
	
	
	
	


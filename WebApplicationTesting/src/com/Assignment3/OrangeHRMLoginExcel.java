package com.Assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class OrangeHRMLoginExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String applicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriveFiles/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrl);
		
		
		FileInputStream file = new FileInputStream("./src/com/excel/Chinna.xlsx");

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
		FileOutputStream fOut=new FileOutputStream("./src/com/excel/Chinna.xlsx");
		
		
		workbook.write(fOut);
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		}
		driver.close();
	  
		
	}
}

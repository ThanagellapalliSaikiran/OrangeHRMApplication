package Assignment6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_ScreenShorts {

	public static void main(String[] args) throws IOException {
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
		for (int Index =1; Index<=rowcount; Index++) {
			
			XSSFRow row =sheet.getRow(Index);
			
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
			
			String actual_OrangeHrmLogInPageURL1=driver.getTitle();
	         
	          System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL1);
	         
	         
	          for (int Index1 =Index; Index1<=Index; Index1++) {
	         
	          String webpageScreenShorts=actual_OrangeHrmLogInPageURL1;
	               
	                System.out.println(Index1 +"  _  "+webpageScreenShorts);
	               
	         
			
			
	//if(message.contentEquals(message)) {
	if(actualURL.equals(expectedURl)) {
		
	
			sheet.getRow(Index1).createCell(2).setCellValue("pass");
			
			 System.out.println("Login Sucessfull");  
			
		}
		else {
			
			
			sheet.getRow(Index1).createCell(2).setCellValue("Fail");	
			System.out.println("Login Failed");
			File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(webPageScreenShot, new File("./OrangHRM_Screenshorts/OrangeHRM"+Index1 +"  _  "+webpageScreenShorts+".png"));

			
		}
	
	
	
	
		}
	          FileOutputStream fOut=new FileOutputStream("./src/com/excel/Chinna.xlsx");
	  		
	  		
	  		workbook.write(fOut);
	  		
	  		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");	
	  
	}

}
}
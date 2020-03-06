package com.TestScenarios;
import org.testng.annotations.Test;

import com.ObjectRepository.Locators;
import com.Utilities.CommonFunctions;
import com.Utilities.StaticVariables;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class FB_Login extends StaticVariables {
	//WebDriver driver;
	
	Locators obj = new Locators();
	CommonFunctions cfn =new CommonFunctions();
	@AfterMethod
	public void TakesScreenshot() throws Exception {
		cfn.takesScreenshot("FB_login");
	}
  @Test
  public void login() throws Exception {
	  
	  
	 File testDataPath = new File("Users/kotla/Desktop/workspace selenium/Maven_Project/TestData/testData.properties");
	 //read the input file
	 FileInputStream fi = new FileInputStream(testDataPath);
	 
	 //to read and write of properties files java people implemented one class : Properties
	 Properties prop = new Properties();
	 
	 //to load the properties file value to a prop variables
	 prop.load(fi);
	 
	 driver.get(prop.getProperty("URL"));	
	 cfn.sendKeysByAnyLocator(obj.userName, prop.getProperty("UserName"));
	 cfn.takeScreenshot("FBlogin_UN");
     cfn.sendKeysByAnyLocator(obj.password, prop.getProperty("Password"));
	 cfn.clickByAnyLocator(obj.login);
		
		Thread.sleep(5000);
		
		
		if (driver.findElement(By.id("loginbutton")).isDisplayed()) {
			driver.findElement(By.id("loginbutton")).click();
			
		} else {
			driver.findElement(By.name("login")).click();

		}
		
		Thread.sleep(5000);
		//Validate pass/fail
		//if element is present on page that element size=1 else size=0
		if(driver.findElements(By.xpath("(//*[@role='button'])[1]")).size()>0) {
		System.out.println("given credentials are invalid");
		driver.get("https://www.facebook.com/");
}
  else
  {
	  System.out.println("given credentials are valid");
	  driver.get("https://www.facebook.com/");
}
  }
  
  @BeforeClass//Pre-condition
  public void beforeClass() {
		
			cfn.chromeBrowserLaunch();	
		
  }

  @AfterClass//Post-Condition
  public void afterClass() {
	  //close browser
	  driver.quit();
	 

}
}

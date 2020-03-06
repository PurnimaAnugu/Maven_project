package com.TestScenarios;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.ObjectRepository.Locators;
import com.Utilities.CommonFunctions;

public class ClassTemplate extends StaticVariables{
	Locators obj = new Locators();
	CommonFunctions cfn =new CommonFunctions();
	
	@AfterMethod
	public void TakesScreenshot() throws Exception {
		cfn.takesScreenshot("Testing");
	}
  @Test
  public void login() throws Exception {
	  
	  
	 File testDataPath = new File("Users/kotla/Desktop/workspace selenium/Maven_Project/TestData/testData.properties");
	 FileInputStream fi = new FileInputStream(testDataPath);
	 Properties prop = new Properties();
	 prop.load(fi);
	 
	 driver.get(prop.getProperty("URL"));
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 
	 //Develop the actual scripts..
	 
  @Parameters("browser") 
  @BeforeClass
  public void beforeClass(@Optional("chrome")String browser ) {
		
			cfn.chromeBrowserLaunch(browser);	
		
  }

  @AfterClass
  public void afterClass() {
	  //close browser
	  driver.quit();
	 

}
}


}

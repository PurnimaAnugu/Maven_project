package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SecondClass {
  @Test
  public void f() {
	//launch the chrome driver
		
			System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
			WebDriver driver = new ChromeDriver();	
			
			//open URL
			
			driver.get("https://www.spicejet.com/");
			
			//check the element tagname is select or not ?
			new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("AED");;
			
			//maximize the window
			driver.manage().window().maximize();

  }
}

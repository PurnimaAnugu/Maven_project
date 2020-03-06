package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting {
	
	WebDriver driver;
  @Test
  public void f() {
	  

		driver.findElement(By.name("email")).sendKeys("asfhbfsdk@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jkasgfshd");
		
		//click on login button
		driver.findElement(By.id("loginbutton")).click();
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
			WebDriver driver = new ChromeDriver();	
		
	} else if (browser.equalsIgnoreCase("firefox")) {

		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new FirefoxDriver();	
		
		
	}else if (browser.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new InternetExplorerDriver();
		
	}
	  
	  else {
		  System.out.println("Please provide chrome/ie/firefox browser name");

	}
  }

}

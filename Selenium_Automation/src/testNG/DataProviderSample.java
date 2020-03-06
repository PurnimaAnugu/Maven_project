package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DataProviderSample {
	  WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws Exception {
	

		    driver.findElement(By.name("email")).sendKeys("asfhbfsdk@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("jkasgfshd");
			driver.findElement(By.xpath("*[@id='loginbutton' or @name='login']")).click();
			Thread.sleep(5000);
			
			if (driver.findElement(By.id("loginbutton")).isDisplayed()) {
				driver.findElement(By.id("loginbutton")).click();
				
			} else {
				driver.findElement(By.name("login")).click();

			}
			
		
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
			
				System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
				WebDriver driver = new ChromeDriver();	
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
	  }

	  @AfterClass//Post-Condition
	  public void afterClass() {
		  //close browser
		  driver.quit();
		 

	}
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "asghdg@gmail.com", "ajksadnj" },
      new Object[] { "jbshshsak@gmail.com", "adsjhjsa" },
    };
  }
}

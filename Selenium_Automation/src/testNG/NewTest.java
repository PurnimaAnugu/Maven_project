package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {

		//launch the chrome driver
		
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		//open URL
		driver.get("https://www.facebook.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("asfhbfsdk@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("jkasgfshd");
		
		//click on login button
		driver.findElement(By.id("loginbutton")).click();

  }
}

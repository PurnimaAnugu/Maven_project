package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Sample {

	public static void main(String[] args) {
		
	
		String baseURL = "https://www.google.com/";
		
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		System.out.println("Google page URL IS : "+driver.getCurrentUrl());
		
		
		
		
	   //click on gmail link
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		//partial window
		driver.findElement(By.partialLinkText("mail")).click();
		
		//GET THE CURRENT PAGE URL
		
System.out.println("Gmail page URL is : "+driver.getCurrentUrl());


       //to close the current window
      driver.quit();
     // driver.close();to close the window only
	}

}

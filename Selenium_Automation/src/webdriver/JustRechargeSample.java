package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeSample {

	public static void main(String[] args) {
	
		String URL = "https://www.justrechargeit.com/SignIn.aspx";
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get(URL);
			driver.manage().window().maximize();
			//which page cursor is available that page only
			//driver.close();
			
			
			//UN &PWD
			driver.findElement(By.id("txtUserName")).sendKeys("ajxhajsv@gmail.com");
			driver.findElement(By.name("txtPasswd")).sendKeys("gfsmhgckg");
			
			//click on secure signin button
			
			driver.findElement(By.id("imgbtnSignin")).click();
			
			driver.quit();

	}

}

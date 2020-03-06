package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextFromApplication {

	public static void main(String[] args) {
		//launch the chrome driver
		
				System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
				WebDriver driver = new ChromeDriver();	
				
				//open URL
				driver.get("https://www.justrechargeit.com/SignUp.aspx");
				
				//get text
				
		//System.out.println("driver.findElement(By.id(\"Label1\")).getText()");
		
String abc = driver.findElement(By.id("Label1")).getText();
System.out.println(abc);
	}

}

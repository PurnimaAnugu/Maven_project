package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recharge_Assgn2 {

	public static void main(String[] args) {
		//launch the chrome driver
		
				System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
				WebDriver driver = new ChromeDriver();	
				
				//open URL
				driver.get("https://www.justrechargeit.com/SignUp.aspx");
				
				//Name label
           if (driver.findElement(By.id("signup_name")).isDisplayed()) {
					
					System.out.println("Name displayed");
					
				} else {
					System.out.println("Name not displayed");
				}
				//checkbox1
				if (driver.findElement(By.id("checkbox1")).isSelected()) {
					
					System.out.println("Checkbox1 is selected by default");
					
				} else {
					System.out.println("Checkbox1 is not selected by default");
				}
				//checkbox2
	if (driver.findElement(By.id("checkbox")).isSelected()) {
					
					System.out.println("T&C element is selected by default......");
					
				} else {
					System.out.println("T&C element is NOT selected by default......");
				}
		//button
	
		if (driver.findElement(By.id("imgbtnSubmit")).isEnabled()) {
			
			System.out.println("The create account button is enabled state......");
		} else {
			System.out.println("The create account button is disabled state......");
		}
			}

		


	

}

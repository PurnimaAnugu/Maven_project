package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class ValidationCommands {

	public static void main(String[] args) {
    //isSelected(),IsEnabled(),isDisplayed()
		
		//launch the chrome driver
		
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		//open URL
		driver.get("https://hdpp.ttdsevaonline.com/Registration/VolunteerRegistration");
		
		//validate district element is enabled r not
		
		if (driver.findElement(By.id("DistrictsList")).isEnabled()) {
			
			System.out.println("The Districtlist is enabled state*******");
			
		} else {
			System.out.println("The Districtlist is disabled state*******");
		}
		//terms and conditions checkbox is selected or not
if (driver.findElement(By.name("IsDeclareHindu")).isSelected()) {
	System.out.println("T&C element is selected by default......");
} else {
	System.out.println("T&C element is not selected by default......");
}
//validate submit button is displayed
if (driver.findElement(By.id("btnSubmit")).isDisplayed()) {
	
	System.out.println("The element is displayed......");
} else {
	System.out.println("The element is not displayed......");
}
	}

}

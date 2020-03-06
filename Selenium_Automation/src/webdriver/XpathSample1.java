package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathSample1 {

	public static void main(String[] args) {
		String URL = "https://hdpp.ttdsevaonline.com/Registration/VolunteerRegistration";
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get(URL);
			driver.manage().window().maximize();
			
			//select calender
			
   driver.findElement(By.xpath("//button[@role='button']")).click();
	new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByVisibleText("Mar");
	new Select(driver.findElement(By.xpath("(//selct[@class='ui-datepicker-year'][1])"))).selectByVisibleText("2010");
	
	driver.findElement(By.xpath("(//a[@class='ui-state-default'][12])")).click();
	
	//

			

	}

}

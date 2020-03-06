package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle_FB {

	public static void main(String[] args) throws  Exception{
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com/help/570785306433644?helpref=hc_global_nav");
		
		//click on create new account
		
		driver.findElement(By.id("_42ft _42fu _1lye selected _42gz")).click();
		
	Thread.sleep(5000);
		
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("april");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("12");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
		
		
	

	}

}

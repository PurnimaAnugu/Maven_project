package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAndGetAttribute {

	public static void main(String[] args) throws Exception {
		String URL = "https://retail.onlinesbi.com/retail/login.htm";
		   System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
			WebDriver driver = new ChromeDriver();	
			
			driver.get(URL);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
		//GETTEXT
			String text = driver.findElement(By.xpath("")).getText();
			String text = driver.findElement(By.xpath("")).getAttribute("");
			System.out.println(text);
			
			//getattribute

	}

}

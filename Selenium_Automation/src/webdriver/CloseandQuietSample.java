package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuietSample {

	public static void main(String[] args) {
		
   String URL = "https://www.naukri.com/";
   System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
	WebDriver driver = new ChromeDriver();	
	
	driver.get(URL);
	driver.manage().window().maximize();
	
	
	//which page cursor is available that page alone will be closed
	
	
	driver.close();
	
	//quit method will close cursor page and its related page(s)
	//driver.quit();
	}

}

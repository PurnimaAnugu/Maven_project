package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws Exception {
		String URL = "https://www.justrechargeit.com/";
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get(URL);
			driver.manage().window().maximize();
			
		//click on 	just recharge it
		driver.findElement(By.name("imgbtnMobileRecharge")).click();
		Thread.sleep(3000);
		
		//get the validation msg and print it
		System.out.println("Validation message is:"+driver.findElement(By.id("errorMsgMobile")).getText());
		//click refresh icon
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		//click on back icon on browser
		driver.navigate().back();
		Thread.sleep(3000);
		//click on forward icon on browser
		driver.navigate().forward();
		Thread.sleep(3000);
	}

}

package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
	
		 String URL = "https://retail.onlinesbi.com/retail/login.htm";
		   System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
			WebDriver driver = new ChromeDriver();	
			
			driver.get(URL);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.className("login_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("Button2")).click();
			Thread.sleep(5000);
			
			//alert
			//get the alert text
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();//to click on ok button
			Thread.sleep(5000);
			driver.findElement(By.linkText("New User ? Register here/Activate ")).click();
			//confirmation alert
			System.out.println("confirmation Alert :"+driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();//to click on cancel button
			
			
	}

}

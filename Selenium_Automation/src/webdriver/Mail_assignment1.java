package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail_assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mail.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup-button")).click();
		
		//WebElement radio1 = driver.findElement(By.name("pos-input-radio__checker"));
	     //radio1.click();
		
		driver.findElement(By.id("pos-input-radio__checker")).click();
		driver.findElement(By.id("ng-pristine ng-invalid ng-touched")).sendKeys("Purnima");
		driver.findElement(By.id("ng-pristine ng-invalid ng-touched")).sendKeys("Anugu");
	
		
		
		
		
		
		
		


	}

}

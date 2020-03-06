package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSample {

	public static void main(String[] args) {
		
		String URL = "https://www.timeanddate.com/date/duration.html";
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get(URL);
			driver.manage().window().maximize();
			
		//type date using xpath	
		driver.findElement(By.xpath("(//input[@placeholder='mm'])[1])")).sendKeys("04");	
		driver.findElement(By.xpath("(//input[@placeholder='dd'])[1])")).sendKeys("20");
		driver.findElement(By.xpath("(//input[@placeholder='yyyy'])[1])")).sendKeys("1990");
		
		//click on second today link
		
		driver.findElement(By.xpath("(//a[@class='bigger'])[1]")).click();
		
		//click on calculate button
		driver.findElement(By.xpath("//input[@id='subbut2']")).click();
	}

}

package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gettext_Assgn3 {

	public static void main(String[] args) {
	
		//launch the chrome driver
		
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		//open URL
		driver.get("https://www.timeanddate.com/date/duration.html");
		
	    driver.findElement(By.id("m1")).sendKeys("02");
	    driver.findElement(By.id("d1")).sendKeys("04");
		driver.findElement(By.id("y1")).sendKeys("2018");
			
		driver.findElement(By.id("m2")).sendKeys("02");
		driver.findElement(By.id("d2")).sendKeys("04");
		driver.findElement(By.id("y2")).sendKeys("2019");
			
      WebElement checkbox = driver.findElement(By.id("ti"));
      checkbox.click();
      
      driver.findElement(By.id("subbut2")).click();
      
    driver.findElement(By.xpath("driver.findElement(By.xpath(\"/html/body/div[1]/div[7]/div[2]/div[2]/div/div/div[1]/div/div/div[1]/h2\"))")).getText();
     


}
	
	

}

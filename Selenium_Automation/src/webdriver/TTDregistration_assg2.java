package webdriver;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.OutputKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TTDregistration_assg2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://hdpp.ttdsevaonline.com/Registration/VolunteerRegistration");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("Name")).sendKeys("Purnima");
		driver.findElement(By.name("SurName")).sendKeys("Anugu");
		//radio button
	     driver.findElement(By.id("genFemale")).click();
	     
	     //dropdown
	      Select Occupation = new Select(driver.findElement(By.id("Occupation")));
	      Occupation.selectByVisibleText("Business");
	      
	      

	      Select Education = new Select(driver.findElement(By.id("EducationCat")));
	      Education.selectByVisibleText("Graduation and above");

			driver.findElement(By.name("Address1")).sendKeys("Hyderabad");
		
			Thread.sleep(3000);
			
			 Select State = new Select(driver.findElement(By.id("State")));
		State.selectByVisibleText("Telangana");
		
		 Select District = new Select(driver.findElement(By.id("District")));
	District.selectByIndex(2);
	Thread.sleep(3000);
	
	driver.findElement(By.name("PinNum")).sendKeys("501218");
	driver.findElement(By.name("MobNum")).sendKeys("78267421594");
    driver.findElement(By.id("IsExperienced")).click();
	
    Thread.sleep(3000);
    
    Select ExperienceCategory = new Select(driver.findElement(By.id("ExperienceCategory")));
    ExperienceCategory.selectByIndex(1);
    driver.findElement(By.id("IsDeclareHindu")).click();
    
    //take screenshot
    //path of the screenshot folder
    String path = ".\\Screenshots\\";
    
   //take screenshot
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    //move screenshot to local folder
  
    FileHandler.copy(src, new File(path+"MyTest.PNG"));	
    driver.findElement(By.id("btnSubmit")).click();
    driver.quit();
	}
}



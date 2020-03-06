package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonFunctions extends StaticVariables {
	
	//browser launch
	public void chromeBrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		 driver = new ChromeDriver();
	}

	//sendkeys
	public void sendKeysByAnyLocator(By locator,String inputdata) {
		WebElement element = driver.findElement(locator);
		
		if(element.isDisplayed()) {
			
			if(element.isEnabled()) {
				
				element.clear();
				element.sendKeys(inputdata);
				System.out.println("Data has entered sucessfully into "+locator);
			}}else {
				System.out.println("Element is not disable state");
			}{
				System.out.println("Element is Not displayed");
			}
			
			}
		/******* click **********/
		public void sendKeysByAnyLocator(By locator) {
			WebElement element = driver.findElement(locator);
			
			if(element.isDisplayed()) {
				if(element.isEnabled()) {
					element.click();
					System.out.println("Click action has  done on"+locator);
				
				}else {
					System.out.println("Element is not disable state");
				}}
			else
				 {
					System.out.println("Element is Not displayed");
				}
				
				}
		//Timestamp
		
		public String timeStamp() {
			Date d = new Date(0);
			System.out.println("System Date & Time is :"+d);
			
			//ddmmyyyyhhmmss
			DateFormat df =new SimpleDateFormat("ddmmyyyyhhmmss");
			String timeStamp = df.format(d);
			
			return timeStamp;
			
		}
	
	//Takescreenshot
		public void takeScreenshot() throws IOException {
			
			//path
			String screenshotPath = "/Users/kotla/Desktop/workspace selenium/Maven_Project/screenshots";
			
			//take screenshot and store it into RAM location
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//move it to local area
			FileHandler.copy(srcFile, new File(screenshotPath + nameofTheScreenshot+timeStamp()+"PNG"));
			
			
		}

	//cross browser launch
	
		public void crossBrowserLaunch(String browser) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			} else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/geckodriver");
				WebDriver driver = new FirefoxDriver();	
				driver.manage().window().maximize();
				
			}else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.gecko.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();	
				driver.manage().window().maximize(); {
				
			}
			
			
			{

			}
			
		}
		
		
		
		
		
		
		
		
		
		
		}


package webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class GetTheSystemDate {

	public static void main(String[] args) throws IOException {
		

		String baseURL = "https://www.google.com/";
		
		System.setProperty("webdriver.chrome.driver","/Users/kotla/Desktop/selenium/workspace/Selenium_Automation/browserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
	Date abc = new Date();
System.out.println(abc);//output Fri Feb 14 16:27:43 EST 2020

//DDMMYYYHHMMSS
DateFormat xyz = new SimpleDateFormat("dd_mmm_yyyy_hh_mm_ss");

//convert system date to customized format
String timeStamp = xyz.format(abc);
System.out.println("timeStamp");

//take screen shot

String path = ".\\Screenshots\\";

File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File(path+ "Testing_"+timeStamp+".PNG"));


	}

}

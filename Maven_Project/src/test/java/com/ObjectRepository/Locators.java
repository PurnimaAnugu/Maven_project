package com.ObjectRepository;

import org.openqa.selenium.By;

public class Locators {

	public final By userName = By.name("email");
	public final By password = By.name("pass");
	public final By login = By.xpath("*[@id='loginbutton' or @name='login']");


//SBI page lacators
	
	public final By sbi_login = By.xpath("(//*[text()='LOGIN'])(1)");
	public final By sbi_ContinuetoLogin = By.xpath("//*[text()='CONTINUE TO LOGIN']");
	public final By sbi_LoginPage_LoginButton =By.id("Button2");



}

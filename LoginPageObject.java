package com.automation.junittestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public static WebElement LoginBtn(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()=\"Log in\"]"));
	}
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='email']"));
		
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));
		
	}

	public static WebElement submitbtn(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='LOGIN']"));
		
	}

}

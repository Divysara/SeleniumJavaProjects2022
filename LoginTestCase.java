package com.automation.junittestcases;

import java.time.Duration;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test

	public void LoginPageTest() {
		
		LoginPageObject.LoginBtn(driver).click();
		LoginPageObject.username(driver).sendKeys("divyas94@gmail.com");
		
		LoginPageObject.password(driver).sendKeys("Divyas1984!");
		
		LoginPageObject.submitbtn(driver).click();
	}
	

}

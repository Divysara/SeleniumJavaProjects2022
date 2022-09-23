package com.automation.selenium;

import java.time.Duration;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckingAssertion {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\ishan\\eclipse\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.walmart.com");
		
		
		String expected  = "Walmart.com | Save Money. Live Better";
		String actual = driver.getTitle();
		System.out.println(actual);
		assert(expected.equals(actual)):"not equal";
		System.out.println("The title is right!");
		
		int n= 10;
		assert(n==10):"not equal";
		System.out.println("equal");
        driver.quit();
		
	}

}

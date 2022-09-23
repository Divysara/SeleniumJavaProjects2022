package com.automation.selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


/*Difference between hard and soft assertion:
 * Hard assert comes from the Assert class, whereas the softassert come from SoftAssert class
 * while using hard assertion the code after the assert terminates without execution if the assert fails. 
 * but in soft assertion the prgm doesn't terminate, it continues. using assertAll we can get the failed assert messeges.
 * To use softassert we have to create a object for that class.
 *  since its methods are not static, we create the object to access the assertEquals method.
 */
public class Assertions {
	
	WebDriver driver;
	@Test
	public void softAssertionTest(){
	    WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String actualtitle = driver.getTitle();
	    System.out.println(actualtitle);
	    String expectedtitle = "Facebook  log in or sign up";
	    SoftAssert softassert = new SoftAssert();
	    softassert.assertEquals(actualtitle,expectedtitle);
	    System.out.println("in hard assertion");
	    softassert.assertAll();
	}
	@AfterClass
    public void tearDown()
{
    driver.quit();
}

}

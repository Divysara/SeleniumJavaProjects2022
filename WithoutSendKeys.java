package com.testNgSelenium.InterviewPractice;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSendKeys {

	@Test
	public void googleTest() throws AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("duckling");
/*we can send input values without using send keys option. by:
 * 1.JavaScript Executor
 * 2.Robot class. plz refer the test cases-WithoutSendKeysTest- for detailed understanding.
 */
		

	}

}

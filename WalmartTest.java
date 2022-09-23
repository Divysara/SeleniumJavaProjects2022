package training;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WalmartTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\ishan\\eclipse\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.walmart.com");
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		boolean logo = driver.findElement(By.xpath("//img[@class='db']")).isDisplayed();
		System.out.println("The logo is displayed? "+ logo);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/span/header/form/div")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/div/span/header/form/div")).click();
		driver.findElement(By.cssSelector("[aria-label='Search']")).click();

		driver.findElement(By.cssSelector("[aria-label='Search']")).sendKeys("iPhone");
		driver.findElement(By.cssSelector("[aria-label='Search icon']")).sendKeys(Keys.RETURN);

		//driver.findElement(By.cssSelector(".ld")).click();
		//driver.findElement(xpath(HomePage.searchTextboxXPath)).click();
		//driver.findElement(xpath(HomePage.searchTextboxXPath)).sendKeys("iphone");
		

		
		//driver.findElement(By.xpath("/html/body/div/div[1]/div/span/header/form/div")).click();
		
		/*
		 * WebElement search = driver.findElement
		 * (By.xpath("/html/body/div/div[1]/div/span/header/form/div/input[@name ='q']")
		 * ); System.out.println(" the text "+ search);
		 */
		
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//	      j.executeScript("arguments[0].click();", search);
//	      boolean t = search.isSelected();
//	      if (t) {
//	         System.out.println("Checkbox is not checked");
//	      }else {
//	         System.out.println("Checkbox is checked");
//	      }
		/*
		 * search.sendKeys("iphone"); Thread.sleep(3000);
		 */
		
	//driver.findElement(By.xpath("/html/body/div/div[1]/div/span/header/form/div/button")).click();
//	driver.findElement(By.xpath("/html/body/div/div[1]/div/span/header/form/div/button/i")).click();
//		//driver.findElement(By.xpath("/html/body/div/div[1]/div/span/header/form/div/button/i")).click();
//	
	//	driver.quit();
		
	}

}

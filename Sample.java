package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\Users\\ishan\\eclipse\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.walmart.com");
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("iphone");
	}

}

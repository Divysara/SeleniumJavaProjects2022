package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuy {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ishan\\eclipse\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.com");
		System.out.println(driver.getTitle());
		String expected = driver.getTitle();
		String title = "Best Buy | Official Online Store | Shop Now & Save";
		if(title.equals(expected))
			System.out.println("we are in the right page");
		else
			System.out.println("not the right page");
		
		driver.findElement(By.id("gh-search-input")).sendKeys("iphone");
		driver.findElement(By.cssSelector(".header-search-icon")).click();
		Thread.sleep(3000);
		List<WebElement> search = driver.findElements(By.xpath("//h4//a[contains(text(),'iPhone')]"));
		System.out.println(search.size());
		
		for(int i= 0;i<search.size();i++)
		{
			String s = search.get(i).getText();
			System.out.println(s);
		}
		
	
	
	
	}

}

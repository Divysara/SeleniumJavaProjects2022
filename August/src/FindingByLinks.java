import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindingByLinks {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialrepublic.com/html-tutorial/html-links.php");

		//driver.findElement(By.linkText("HTML Introduction")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("the no of links: "+ list.size());
		driver.close();
	}

}



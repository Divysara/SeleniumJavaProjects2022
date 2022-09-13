

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		//driver.findElement(By.linkText("HTML Introduction")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("the no of links: "+ list.size());
		List<WebElement> inputtext = driver.findElements(By.tagName("input"));
		System.out.println(inputtext);

		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		for(WebElement txt : list) {
			System.out.println(txt.getText());
		}
		
		driver.close();

	}

}


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("the no of links: "+ list.size());

		List<WebElement> inputtext = driver.findElements(By.tagName("input"));
		System.out.println("the no of inputs: "+ inputtext.size());



		for(WebElement txt : list) {
			System.out.println(txt.getText());
		}
		driver.close();

	}

}




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FramesTest {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/ul[1]/li[1]/a")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();

		driver.navigate().back();
		driver.switchTo().frame("/html/body/main/div/div[1]/div[2]/iframe");
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();

	}

}


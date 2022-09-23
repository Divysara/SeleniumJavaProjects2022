import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreeShot {



	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();		
		driver.get("https://letcode.in/buttons");

		//how to take screen shot: two ways:

		//first method
		TakesScreenshot take = (TakesScreenshot)driver;
		File filesrc = 	take.getScreenshotAs(OutputType.FILE);
		File fileDest = new File("./screenshotimage/img1.png");
		FileHandler.copy(filesrc, fileDest);

		//second method
		/*File filesrc =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			//File fileDest = new File("./screenshotimage/img1.png");
			//FileHandler.copy(filesrc, fileDest);*/

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"property\"]"));
		File filesrc1 = ele.getScreenshotAs((OutputType.FILE));
		File fileDest1 = new File("./screenshotimage/img3.png");
		FileHandler.copy(filesrc1, fileDest1);

		WebElement sect = driver.findElement(By.cssSelector("body > app-root > app-buttons > section.section.has-background-white-ter > div > div > div.column.is-3-desktop.is-4-tablet > app-learning-point > div > div > div")
				);
		File filesrc2 = sect.getScreenshotAs((OutputType.FILE));
		File fileDest2 = new File("./screenshotimage/img2.png");
		FileHandler.copy(filesrc2, fileDest2);

		driver.close();


	}

}




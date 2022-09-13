import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextBoxCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
		//create instance for browser driver and get the url
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");

		//find the box using the id and enter the values

		driver.findElement(By.id("fullName")).sendKeys("Dhivya sarangaraja");

		//this command appends the text to the existing txt

		driver.findElement(By.id("join")).sendKeys(". Thanks");

		//this is for fetching the values already present in the txt box
		String gettext =  driver.findElement(By.id("getMe")).getAttribute("value");

		System.out.println("the text :"+  gettext);

		//clearing the txt entered in the box.
		WebElement cleartxt =  driver.findElement(By.id("clearMe"));
		cleartxt.clear();
		Thread.sleep(2000);

		boolean enables = driver.findElement( By.xpath("//*[@id=\'noEdit\']")).isEnabled();

		System.out.println("The value enabled ? :"+ enables);

		String checktxt =  driver.findElement(By.id("dontwrite")).getAttribute("value");

		String val = "This text is readonly";

		if(checktxt.equals(val))
			System.out.println("yes the values are same");
		else
			System.out.println("no the value is not same");

		driver.quit();


	}

}

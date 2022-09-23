package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleDefinitions {


	
	WebDriver driver;

	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ishan\\eclipse\\chromedriver.exe" );
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	    driver.get("http://google.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String search) {

		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(search);
	}
	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

	}
	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions

	Boolean status =driver.findElement(By.partialLinkText("wiki")).isDisplayed();
	if(status)
		System.out.println("Results displayed");
	
	}



}

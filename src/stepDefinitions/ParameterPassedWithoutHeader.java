package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterPassedWithoutHeader {

	public WebDriver driver = null;

	@Given("^open with browser$")
	public void open_with_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Open Browser");
	}

	@When("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String url) throws Throwable {
		driver.get(url);
		System.out.println("Enter the URL");  
	}

	@When("^Click on my Account$")
	public void click_on_my_Account() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
		System.out.println("Click on my account");
	}

	@When("^Enter the Username  and password$")
	public void enter_the_Username_and_password(DataTable credential) throws Throwable {
		List<List<String>> data =    credential.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		System.out.println("Enter the username and password");
	}

	@When("^Click on loginPage$")
	public void click_on_loginPage() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("Click on LoginPage");
	}

	@Then("^User is getting Error$")
	public void user_is_getting_Error() throws Throwable {
		String capture = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		System.out.println("User is getting error");
		System.out.println(capture);
		//Assert.assertEquals(true, capture.contains("Error"));
		driver.close();
	}

}

package stepDefinitions;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsPassesParamter {
    public WebDriver driver = null;

	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Open Browser");
	}
	
	@When("^enter the Url \"(.*?)\"$")
	public void enter_the_Url(String url) throws Throwable {
		driver.get(url);
		System.out.println("Enter the URL");

	}

	@When("^click on my account$")
	public void click_on_my_account() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
		System.out.println("Click on my account");
	
	}
	@When("^enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_the_username_and_password(String user, String pass) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		System.out.println("Enter the username and password");
	    
	}
	@And("^click on LoginPage$")
	public void click_on_LoginPage() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("Click on LoginPage");
	}

	
	@Then("^user is getting error$")
	public void user_is_getting_error() throws Throwable {
		String capture = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		System.out.println("User is getting error");
		System.out.println(capture);
		driver.close();
	}



}

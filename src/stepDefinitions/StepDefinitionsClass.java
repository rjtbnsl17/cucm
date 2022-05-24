package stepDefinitions;

import org.junit.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
*/

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;

public class StepDefinitionsClass {

	public WebDriver driver = null;
  public static  ConfigFileReader configFileReader;
	@Given("^Open browser$")
	public void open_browser() throws Throwable {
		  configFileReader = new ConfigFileReader();
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
			 */
		  System.setProperty("webdriver.chrome.driver",
					  configFileReader.getdriverPath()); // through configfilereader
		  
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Open Browser");

	}

	@When("^Enter the Url \"(.*?)\"$")
	public void enter_the_Url(String arg1) throws Throwable {
		driver.get("http://practice.automationtesting.in/");
		System.out.println("Enter the URL");

	}

	@When("^Click on my account$")
	public void click_on_my_account() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
		System.out.println("Click on my account");
	}

	@And("^Enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("rajatbansal");
		driver.findElement(By.id("password")).sendKeys("Rajat@123");
		System.out.println("Enter the username and password");
	}

	@And("^Click on LoginPage$")
	public void click_on_LoginPage() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("Click on LoginPage");
	}

	
	@Then("^User is getting error$")
	public void user_is_getting_error() throws Throwable {
		String capture = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		System.out.println("User is getting error");
		System.out.println(capture);
		driver.close();
	//	Assert.assertTrue(false);
	}

}
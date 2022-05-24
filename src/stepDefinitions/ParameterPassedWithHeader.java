package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterPassedWithHeader {

	public WebDriver driver = null;
	
	@Given("^open with the Browser$")
	public void open_with_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("Open Browser");
	}

	@When("^Enter to the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
		driver.get(url);
		System.out.println("Enter the URL");  
	}

	@When("^Click my Account$")
	public void click_on_my_Account() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
		System.out.println("Click on my account");
	}

	@When("^Enter on the Username  and Password$")
	public void enter_the_Username_and_Password(DataTable credential) throws Throwable {
	List<Map<String, String>> data =    credential.asMaps(String.class, String.class);
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		System.out.println("Enter the username and password");
	}

	@When("^Click On the loginPage$")
	public void click_On_loginPage() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("Click on LoginPage");
	    	}

	@Then("^User is Getting the Error$")
	public void user_is_Getting_Error() throws Throwable {
		String capture = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		System.out.println("User is getting error");
		System.out.println(capture);
		//Assert.assertEquals(true, capture.contains("Error"));
		driver.close();
	   
	}
	
	
}

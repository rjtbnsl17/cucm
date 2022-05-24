package stepDefinitions;

import org.junit.Assert;
// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThroughPageObjects {

	public WebDriver driver;
	public LoginPage lp;

	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/rajatbansal/eclipse-workspace/CucumberLearning/chromedriver2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		System.out.println("Open Browser");
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
		driver.get(url);

	}

	@When("^User enter the email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_email_and_password(String user, String pass) throws Throwable {
		lp.setUserName(user);
		lp.setpass(pass);

	}

	@When("^Click on login$")
	public void click_on_login() throws Throwable {
		lp.loginbutton();
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {

		if (driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();

		} else {
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@Then("^click on logout$")
	public void click_on_logout() throws Throwable {
		lp.logoutbutton();
	}

}

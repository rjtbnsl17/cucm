package stepDefinitions;

import com.fasterxml.jackson.databind.Module.SetupContext;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TagsAndHooks {

	@Given("^It will alwaz excetue before all scenarios$") // background method
	public void it_will_alwaz_excetue_before_all_scenarios() throws Throwable {
	    System.out.println("---------It will alwaz excetue before all scenarios--------");
	}
	
	
	@Before(order = 0) // hooks are like testng Before test before suite etc with order exceuting
	public void SetupContext() {

		System.out.println("Open browser");

	}

	@Before(order = 1) // hooks are like testng Before test before suite etc with order exceuting
	public void SetupContext1() {

		System.out.println("********************");

	}

	@Before("@SanityTest") // hooks with tags
	public void SetupContext2() {

		System.out.println("&&&&&&&&&&  Before sanity test   &&&&&&&&&&&");

	}

	@After(order = 1) // order exceuting
	public void TearDown() {

		System.out.println("Close browser");

	}

	@After(order = 0) // hooks are like testng after test after suite etc
	public void TearDown1() {

		System.out.println("----------------");

	}

	@Given("^Login with valid credential$")
	public void login_with_valid_credential() throws Throwable {
		System.out.println("Login with valid credential");
	}

	@Given("^Logout with valid credential$")
	public void logout_with_valid_credential() throws Throwable {
		System.out.println("Logout with valid credential");
	}

	@Given("^All the testcases$")
	public void all_the_testcases() throws Throwable {
		System.out.println("All the testcases");
	}

	@Given("^all the new testcases$")
	public void all_the_new_testcases() throws Throwable {
		System.out.println("all the new testcases");
	}

	@Given("^this is prepaid test$")
	public void this_is_prepaid_test() throws Throwable {
		System.out.println("this is prepaid test");
	}

	@Given("^this is postpaid test$")
	public void this_is_postpaid_test() throws Throwable {
		System.out.println("this is postpaid test");
	}

}

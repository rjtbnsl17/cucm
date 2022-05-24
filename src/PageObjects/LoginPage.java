package PageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement textemail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//button[@type ='submit']")
	@CacheLookup
	WebElement loginbtn;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement logoutbtn;

	public void setUserName(String uname) {

		textemail.clear();
		textemail.sendKeys(uname);

	}

	public void setpass(String pass) {

		password.clear();
		password.sendKeys(pass);

	}

	public void loginbutton() {

		loginbtn.click();

	}

	public void logoutbutton() {

		logoutbtn.click();

	}

}
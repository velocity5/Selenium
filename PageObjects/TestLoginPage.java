package tutorial_selenium.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tutorial_selenium.BaseURL;

import java.io.IOException;

public class TestLoginPage {
	WebDriver driver;
	// constructor
	public TestLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By email = By.cssSelector("section input[name='email']");
	By password = By.cssSelector("[name='password']");
	By loginBtn = By.cssSelector("button#submit-login");
	public WebElement getEmail(){
		return driver.findElement(email);
	}
	public WebElement getPassword(){
		return driver.findElement(password);
	}
	public WebElement getLogin(){
		return driver.findElement(loginBtn);
	}
}

package tutorial_selenium.parameterize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tutorial_selenium.BaseURL;

import java.io.IOException;

public class LoginMethod_2 extends BaseURL {
	public LoginMethod_2() throws IOException {
		super();
	}
	@Parameters({"email","password"})
	@Test
	public void SignIn(String email, String password) throws InterruptedException, IOException {
		driver = getDriver();
		driver.get(getUrl());
		WebElement SignInTab = driver.findElement(By.cssSelector("[title] .hidden-sm-down"));
		SignInTab.click();
		WebElement emailSection = driver.findElement(By.cssSelector("section input[name='email']"));
		Thread.sleep(3000);
		emailSection.sendKeys(email);
		WebElement passSection = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		passSection.sendKeys(password);
		driver.findElement(By.id("submit-login")).click();
		takeSnapShot(driver);
	}
	@AfterSuite
		public void closeDriver(){
			driver.close();
			driver.quit();
		}
}
package tutorial_selenium.parameterize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tutorial_selenium.Constant;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginMethod_2 extends Constant {
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

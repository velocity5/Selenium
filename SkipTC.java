package tutorial_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SkipTC extends Constant{

	public SkipTC() throws IOException {
		super();
	}

	@Test (enabled = false)
	public void enterEmail() throws InterruptedException{
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		Thread.sleep(2000);
	}
	@Test
	public void enterPassword() throws InterruptedException{
		driver.findElement(By.name("password")).sendKeys("test123");
		Thread.sleep(1000);
	}
}

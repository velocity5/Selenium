package tutorial_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DependsOnMethod extends Constant{

	public DependsOnMethod() throws IOException {
		super();
	}

	@Test
	public void enterEmail() throws InterruptedException{
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		Thread.sleep(3000);
	}
	@Test
	public void enterPassword() throws InterruptedException{
		driver.findElement(By.name("password")).sendKeys("test123");
		Thread.sleep(3000);
	}
	// Below method only run till the enterPassword method is done
	@Test(dependsOnMethods = {"enterPassword"})
	public void clickBtn() throws InterruptedException{
		driver.findElement(By.id("submit-login")).click();
		Thread.sleep(3000);
		System.out.println("Logged in successfully");
	}
	@AfterSuite
	public void end(){
		driver.close();
		driver.quit();
	}
}

package tutorial_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
@Listeners(ITest_Listener.class)
public class TestNGAssert extends Constant{
	public TestNGAssert() throws IOException {
		super();
	}

	@Test
	public void enterEmail() throws InterruptedException{
		Assert.fail();
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		Thread.sleep(3000);
	}
	@Test
	public void enterPassword() throws InterruptedException{
		driver.findElement(By.name("password")).sendKeys("test123");
		Thread.sleep(3000);
	}
	@AfterSuite
	public void end(){
		driver.close();
		driver.quit();
	}
}
/* Does test-report create when TC run successfully?
How to make code more reusable, ez to maintain
 */
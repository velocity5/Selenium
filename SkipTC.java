package tutorial_selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class SkipTC extends BaseURL {

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

package tutorial_selenium;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.io.IOException;

public class AccessingForms_3 extends BaseURL {

	public AccessingForms_3() throws IOException {
		super();
	}

	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		// data set 1
		data[0][0] = "test2@test.com";
		data[0][1] = "test12345";
		// data set 2
		data[1][0] = "test@test.com";
		data[1][1] = "test123";
		// data set 3
		data[2][0] = "test4@test.com";
		data[2][1] = "test123";
		return data;
	}
	@Test(dataProvider = "getData")
	public void SignIn(String email, String password) throws InterruptedException, IOException {
		driver = getDriver();
		driver.get(getUrl());
		WebElement SignInTab = driver.findElement(By.cssSelector("[title] .hidden-sm-down"));
		SignInTab.click();
		WebElement emailSection = driver.findElement(By.cssSelector("section input[name='email']"));
		Thread.sleep(2000);
		emailSection.sendKeys(email);
		WebElement passSection = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		passSection.sendKeys(password);
		driver.findElement(By.id("submit-login")).click();
		System.out.println("User has logged in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@class,'logout')]")).click();
		System.out.println("User has logged out");
		Thread.sleep(1000);
	}

	@AfterSuite
	public void end(){
		driver.close();
		driver.quit();
	}

}

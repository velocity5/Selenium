package tutorial_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AccessingForms_2 extends Constant{

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
			System.out.println("User has logged in");
		}
//		@Test
//		public void Test(){
//			driver.findElement(By.linkText("CLOTHES")).click();
//			System.out.println("User has clicked the clothes link");
//
//		}
//		@AfterMethod
//		public void SignOut(){
//			driver.findElement(By.linkText("\uE7FF Sign out")).click();
//			System.out.println("User has logged out");
//		}
		@AfterSuite
		public void end(){
			driver.close();
			driver.quit();
			}
	}
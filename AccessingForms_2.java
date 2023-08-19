package tutorial_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class AccessingForms_2 extends Thread{
	public WebDriver driver;
	@BeforeSuite
	public void getSetup() {
		// TODO Auto-generated method stub
		System.getProperty("web-driver.chrome.driver", Constant.Driver_Path_Chrome);
		try {
			Thread.sleep(1000);
			System.out.println("Initializing...");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted ^_*!" + e);
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	}
	@Parameters({"email","password"})
		@Test
		public void SignIn(String email, String password) throws InterruptedException{
			String baseURL = "http://teststore.automationtesting.co.uk/";
			driver.get(baseURL);
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
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

public class LoginMethod {
	public WebDriver driver;
	@BeforeSuite
	public void getSetup() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("E:\\TestingDocs\\SeleniumInteliji\\maven_project\\src\\main\\java\\tutorial_selenium\\parameterize\\ConfigProp");
		prop.load(data);
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\TestingDocs\\SeleniumInteliji\\maven_project\\geckodriver_win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else{
			System.setProperty("webdriver.edge.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		driver.get(prop.getProperty("url"));
	}
	@Parameters({"email","password"})
	@Test
	public void SignIn(String email, String password) throws InterruptedException{

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
	@AfterSuite
	public void closeDriver(){
		driver.close();
		driver.quit();
	}
}

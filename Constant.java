package tutorial_selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Constant {
	public static WebDriver driver;
	private String url;

	public WebDriver getDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("E:\\TestingDocs\\SeleniumInteliji\\maven_project\\src\\main\\java\\tutorial_selenium\\parameterize\\ConfigProp");
		prop.load(data);
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\geckodriver_win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		return driver;
	}
	public String getUrl() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("E:\\TestingDocs\\SeleniumInteliji\\maven_project\\src\\main\\java\\tutorial_selenium\\parameterize\\ConfigProp");
		prop.load(data);
		url = prop.getProperty("url");
		return url;
	}
	public void takeSnapShot(WebDriver webDriver) throws IOException {
		File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\TestingDocs\\SeleniumInteliji\\maven_project\\src\\main\\resources\\Screenshots\\" + timeStamp() + ".png");
		FileUtils.copyFile(srcFile,destFile);
	}
	public String timeStamp(){
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}

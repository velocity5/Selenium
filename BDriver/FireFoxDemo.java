package tutorial_selenium.BDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\TestingDocs\\SeleniumInteliji\\maven_project\\geckodriver_win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
}

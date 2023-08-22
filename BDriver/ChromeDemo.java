package tutorial_selenium.BDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	}
}

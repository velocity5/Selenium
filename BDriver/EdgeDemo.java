package tutorial_selenium.BDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\TestingDocs\\SeleniumInteliji\\maven_project\\edgedriver_win32\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
	}
}

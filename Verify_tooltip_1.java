package tutorial_selenium;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Action;		
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class Verify_tooltip_1 {

	public static void main(String[] args) {
		String baseURL = "";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		driver.get(baseURL);
		String expectedTooltip = "What's new in 3.2";
		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		Actions builder = new Actions(driver);
		
	}

}

package tutorial_selenium;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;

public class Verify_tooltip {

	public static void main(String[] args) {
		String baseURL = "https://tiki.vn/";
		System.setProperty("webdriver.chrome.driver",Constant.Driver_Path_Chrome);
		
		WebDriver driver = new ChromeDriver();
		/* WebDriver: an interface 
		 	driver: reference variable 
		 	ChromeDriver(): Constructor
		 	new: keyword
		 	new ChromeDriver(): initiates an Object */
		driver.get(baseURL);
		String expectedTooltip = "Facebook";
		WebElement facebook = driver.findElement(By.xpath("//*[contains(@title, 'Face')]"));
		String actualTooltip = facebook.getAttribute("title");
		System.out.println("Actual title of tooltip: " + actualTooltip);
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test case passed");
		}
		driver.close();
	}

}

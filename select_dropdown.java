package tutorial_selenium;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class select_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		driver.get(baseURL);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		js.executeScript("arguments[0].scrollIntoView();", drpCountry);
		drpCountry.selectByIndex(4);
		System.out.println("Success!!");
		driver.close();
	}

}

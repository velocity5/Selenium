package tutorial_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class Alert_popup {

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		driver.close();
	}

}

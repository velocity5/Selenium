package tutorial_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://demo.guru99.com/test/write-xpath-table.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr[2]/td[2]")));
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(innerText);
		driver.quit();
	}

}

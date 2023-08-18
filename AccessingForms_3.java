package tutorial_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingForms_3 {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://automationtesting.co.uk/buttons.html";
		driver.get(baseURL);
		driver.manage().window().maximize();
		System.out.println(
				driver.findElement(By.xpath("//*[contains(@id,'btn_four')]")).isEnabled()
				);
		driver.close();

	}

}

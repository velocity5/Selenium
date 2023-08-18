package tutorial_selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;



public class Click_button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		String baseURL = "https://automationtesting.co.uk/buttons.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		//driver.findElement(By.xpath("//*[@id='btn_one']")).click();
		driver.findElement(By.cssSelector("button#btn_one")).click();
		
	}

}

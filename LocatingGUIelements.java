package tutorial_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingGUIelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://discord.com/login";
		String tagName = "";
		
		driver.get(baseURL);
		tagName = driver.findElement(By.xpath("//*[@id=\"uid_5\"]")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);
	}

}

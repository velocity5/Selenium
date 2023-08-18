package tutorial_selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_click_keyboard_event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "https://store.steampowered.com/?l=japanese";
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		WebElement link_Store = driver.findElement(By.linkText("ストア"));
		WebElement td_Store = driver.findElement(By.xpath("//*[@id=\"foryou_tab\"]"));
		
		Actions builder = new Actions(driver);
		Action mouseOverStore = builder.moveToElement(link_Store).build();
		
		String bgColor = td_Store.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverStore.perform();
		bgColor = td_Store.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();
	}

}

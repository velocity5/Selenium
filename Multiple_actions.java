package tutorial_selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		WebElement txtPass = driver.findElement(By.id("pass"));
		Actions builder = new Actions(driver);
		Action seriesOfActions_1 = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT).sendKeys(txtUsername,"whatever").keyUp(txtUsername, Keys.SHIFT).doubleClick().build();
		Action seriesOfActions_2 = builder.moveToElement(txtPass).click().keyDown(txtPass, Keys.SHIFT).sendKeys(txtPass,"12345567").keyUp(txtPass, Keys.SHIFT).doubleClick().build();
		
		seriesOfActions_1.perform();
		seriesOfActions_2.perform();
		System.out.println("Filled: " + "seriesOfActions_1");
		System.out.println("Filled: " + "seriesOfActions_2");
		
		driver.close();
//		System.exit(0);
	}

}

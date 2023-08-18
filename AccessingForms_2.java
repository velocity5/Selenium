package tutorial_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingForms_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("web-driver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://automationtesting.co.uk/dropdown.html";
		driver.get(baseURL);
		driver.manage().window().maximize();
//		WebElement radio1 = driver.findElement(By.id("cb_blue"));
//		radio1.click();
//		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//		radio2.click();
//		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
//		radio3.click();
//		
//		System.out.println("Radio buttons clicked");

		// interact with checkbox
		System.out.println(
				driver.findElement(By.cssSelector("input#cb_red")).isSelected()
				);
		System.out.println(
				driver.findElement(By.cssSelector("input#cb_green")).isSelected()
				);
		driver.close();
		
	}
	
}

package tutorial_selenium;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_dynamic_table {

	public static void main(String[] args) throws ParseException {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		List <WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of cols are : " +col.size()); 
		List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        wd.close();
	}

}

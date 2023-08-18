package tutorial_selenium;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Handle_dynamic_table_2 {

	public static void main(String[] args) throws ParseException {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement baseTable = wd.findElement(By.tagName("table"));
		
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table: " + rowtext);
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
	    System.out.println("Cell value is : " + valueIneed); 
	    wd.close();
	}

}

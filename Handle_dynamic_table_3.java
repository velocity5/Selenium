package tutorial_selenium;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;


public class Handle_dynamic_table_3 {

	public static void main(String[] args) throws ParseException {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		String max;
		double m=0, r=0;
		
		List col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are: " + col.size());
		List rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are: " + rows.size());
		for(int i = 0;i < rows.size(); i++) {
			max = wd.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if(m>r) {
				r = m;
			}
		}
		System.out.println("Maximum current price is: " + r);
	}
}

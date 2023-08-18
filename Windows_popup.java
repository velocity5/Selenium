package tutorial_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Iterator;		
import java.util.Set;

public class Windows_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		/* accessing methods using the driver object
		 * driver.manage(): returns an instance of the underlying implementation of Options Interface
		 * driver.manage().window(): return interface for managing the browser window.
		 * driver.manage().window().maximize(): maximize driver window
		 * */
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }	
		driver.switchTo().window(MainWindow);
		System.out.println("Completed");
//		driver.close();
	}

}

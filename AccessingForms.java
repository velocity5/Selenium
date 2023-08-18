package tutorial_selenium;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;


public class AccessingForms extends Thread{
    protected WebDriver driver;
@Test
    public void LaunchURL() {
    // TODO Auto-generated method stub

    System.getProperty("web-driver.chrome.driver", Constant.Driver_Path_Chrome);
    try{
        Thread.sleep(1000);
        System.out.println("Initilizing...");
    } catch(InterruptedException e){
        throw new RuntimeException("Thread interrupted..." +e);
    }
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    String baseURL = "https://automationtesting.co.uk/contactForm.html";
    driver.get(baseURL);
    WebElement firstName = driver.findElement(By.name("first_name"));
    WebElement lastName = driver.findElement(By.name("last_name"));

    WebElement email = driver.findElement(By.name("email"));

    WebElement comment = driver.findElement(By.name("message"));
    firstName.sendKeys("Mike");
    lastName.sendKeys("Henry");
    email.sendKeys("henrymike255@gmail.com"); // senKeys: send sth into element
    comment.sendKeys("abczyx");

    driver.findElement(By.xpath("//*[contains(@name,\"message\")]")).click();
    //System.out.println("Text Field Filled");
    // find submit button and click submit
    WebElement clickSubmit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
    clickSubmit.click();
    //System.out.println("Login done with Submit");
}
@AfterEach
    public void quitDriver() {
        this.driver.quit();
    }
}
/* Install chrome for test through Node.js - done
Figure out how to include testng instead of JUnit, and how to use @Annotations - undone
How to quit driver - undone
How to use Git
 */
package tutorial_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class AccessingForms extends Thread{
    WebDriver driver;
        @BeforeSuite
        public void getSetup() {
            System.getProperty("web-driver.chrome.driver", Constant.Driver_Path_Chrome);
            try{
                Thread.sleep(1000);
                System.out.println("Initilizing...");
            } catch(InterruptedException e){
                throw new RuntimeException("Thread interrupted..." +e);
            }
            driver = new ChromeDriver();
            String baseURL = "https://automationtesting.co.uk/contactForm.html";
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        @Test
        public void Test() throws InterruptedException {
            WebElement firstName = driver.findElement(By.name("first_name"));
            WebElement lastName = driver.findElement(By.name("last_name"));

            WebElement email = driver.findElement(By.name("email"));

            WebElement comment = driver.findElement(By.name("message"));
            firstName.sendKeys("Mike");
            lastName.sendKeys("Henry");
            email.sendKeys("henrymike255@gmail.com"); // senKeys: send sth into element
            comment.sendKeys("abczyx");

            driver.findElement(By.xpath("//*[contains(@name,\"message\")]")).click();
            WebElement clickSubmit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
            clickSubmit.click();
            Thread.sleep(1000);
        }
        @AfterSuite
        public void end() {
            driver.close();
            driver.quit();
            System.out.println("Filled the form");
        }
    };
/* Install chrome for test through Node.js - done
Figure out how to include testng instead of JUnit, and how to use @Annotations - done
How to quit driver - done
How to use Git - done
 */
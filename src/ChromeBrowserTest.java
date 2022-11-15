import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //1) Setup chrome browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2) Open Url
        driver.get(baseUrl);

        //we give implicit to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3)Print the title of the url
        System.out.println("Page title is:" + driver.getTitle());

        //4)Print the current url
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //5)Print the page source
        System.out.println("Page source:" + driver.getPageSource());

        //6)Enter the Username to Username field
        WebElement userfield = driver.findElement(By.name("username"));
        //Type Username to Username field
        userfield.sendKeys("Admin");

        //7)Field the password field element
        WebElement passwordfied = driver.findElement(By.name("password"));
        passwordfied.sendKeys("admin123");

        //close the browser
       driver.quit();
    }
}

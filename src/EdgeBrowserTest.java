import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        //1)Setup chrome browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //2) Open URL
        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3)Print the title of the page
        System.out.println("Page title is: "+ driver.getTitle());

        //4)Print the current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //5)Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //6)Enter the Username to Username field
        WebElement UsernameField = driver.findElement(By.name("username"));
        //Type user to user field
        UsernameField.sendKeys("Admin");

        //7)Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //8)Close the browser
        driver.quit();









    }
}

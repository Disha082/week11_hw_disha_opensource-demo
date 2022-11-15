import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {
        //1)Setup Firefox browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gheko.driver" , "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //2)Open URL
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3)Print the title of the page
        System.out.println("Page title is:" + driver.getTitle());

        //4)Print the current url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //5)Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //6)Enter the username to username field
        WebElement userfield = driver.findElement(By.name("username"));
        userfield.sendKeys("Admin");


        //7)Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //8)Close the browser
        driver.quit();






    }
}

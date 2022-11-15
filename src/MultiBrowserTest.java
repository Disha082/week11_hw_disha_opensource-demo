import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "chrome";

    static String baseurl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        // 1)setup browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        }else {
            System.out.println("Wrong Browser Name");
        }

        //2) Launch Url
        driver.get(baseurl);

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3) Print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //4) Print the current Url
        System.out.println("Current Url is " + driver.getCurrentUrl());

        //5) Print the page source
        System.out.println("Page source is " + driver.getPageSource());

        //6)Enter the Username to Username field
        WebElement userfield = driver.findElement(By.name("username"));
        userfield.sendKeys("Admin");

        //7)Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //8) Close the Browser
        driver.quit();

    }

}
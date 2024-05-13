/*
Created by emman at 7/14/2023 9:57 PM
*/
package partE.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverFactory {
     private WebDriver driver;
    public  static ChromeDriver getChromeDriver() {

       return new ChromeDriver();
    }

    public  static EdgeDriver getEdgeDriver() {
        return new EdgeDriver();
    }

    public  static FirefoxDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }

    public  static SafariDriver getSafariDriver() {
        return new SafariDriver();
    }

    public WebDriver getDriver() {
        if (driver == null) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\emman\\OneDrive\\Documents\\TestProject\\src\\test\\resources\\driver116\\chromedriver.exe");
            driver = getChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
            driver.manage().window().maximize();
        }
        return  driver;
    }

    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}

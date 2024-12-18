package core;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;
    protected  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

}

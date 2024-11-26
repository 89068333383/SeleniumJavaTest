package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}

package core;

import aqaAdmin.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.mobile.NetworkConnection;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
//        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--auto-accept-camera-and-microphone-capture");

        ChromeDriver driver = new ChromeDriver(chromeOptions);



        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // ожидание прогрузки страницы
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // ожидание взаимодействия с элементами станицы
        BaseSeleniumPage.setDriver(driver);

    }

    @AfterEach
    public void tearDown() {

        driver.quit(); // - закрытие хрома
        driver.close(); // - закрытие драйвера
    }
}

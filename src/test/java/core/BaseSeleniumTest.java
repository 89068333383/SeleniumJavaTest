package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
//        WebDriverManager.chromedriver().setup();

//        ChromeOptions options = new ChromeOptions();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--auto-accept-camera-and-microphone-capture");

        ChromeDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // ожидание прогрузки страницы
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // ожидание взаимодействия с элементами станицы
        BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown() {
//        driver.close(); // - закрытие драйвера
//        driver.quit(); // - закрытие хрома
    }
}

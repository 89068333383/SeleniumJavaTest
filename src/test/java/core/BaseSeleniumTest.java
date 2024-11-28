package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import java.time.Duration;

abstract public class BaseSeleniumTest {
    protected static WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--auto-accept-camera-and-microphone-capture");

        this.driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // ожидание прогрузки страницы
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // ожидание взаимодействия с элементами станицы
        BaseSeleniumPage.setDriver(driver);

    }

    @AfterEach
    public  void tearDown() {
        driver.close(); // - закрытие драйвера
        driver.quit(); // - закрытие хрома
    }
}

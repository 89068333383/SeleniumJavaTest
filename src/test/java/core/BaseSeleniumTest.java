package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // ожидание прогрузки страницы
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // ожидание взаимодействия с элементами станицы
        BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown() {
//        driver.close(); // - закрытие драйвера
//        driver.quit(); // - закрытие хрома
    }
}

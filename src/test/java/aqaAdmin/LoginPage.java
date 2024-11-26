package aqaAdmin;

import core.BaseSeleniumPage;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class LoginPage extends BaseSeleniumPage {
    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;



    public LoginPage() {
        driver.get(ConfigProvider.URL2);
        PageFactory.initElements(driver, this);
    }

    public MainPage auth(String username, String pass) {
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(pass, Keys.ENTER);
        return new MainPage();
    }
}

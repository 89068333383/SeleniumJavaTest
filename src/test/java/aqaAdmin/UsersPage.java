package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends BaseSeleniumPage {

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addUsersButton;
    public void clickAddUsersButton() {
        addUsersButton.click();
    }

    @FindBy(xpath = "//small[text() = 'Имя']/following-sibling::input")
    private WebElement inputName;

    public void enterInputName(String inputText) {
        inputName.sendKeys(inputText);
    }

    @FindBy(xpath = "//small[text() = 'Фамилия']/following-sibling::input")
    private WebElement userFamili;

    public void enterUserFamili(String userFamiliText) {
        userFamili.sendKeys(userFamiliText);
    }

    @FindBy(xpath = "//small[text() = 'Эл. почта']/following-sibling::input")
    private WebElement userMail;

    public void enterUserMail(String userMailText) {
        userMail.sendKeys(userMailText);
    }

    @FindBy(xpath = "//small[text() = 'Логин']/following-sibling::input")
    private WebElement userLogin;

    public void enterUserLogin(String userLoginText) {
        userLogin.sendKeys(userLoginText);
    }

    @FindBy(xpath = "//small[text() = 'Пароль']/following-sibling::input")
    private WebElement userPass;
    public void enterUserPass(String userPassText) {
        userPass.sendKeys(userPassText);
    }

    @FindBy(xpath = "//small[text() = 'Роли']/following-sibling::input")
    private WebElement userRole;
    public void enterUserRole(String userRoleText) {
        userRole.sendKeys(userRoleText);
    }

    @FindBy(xpath = "//small[text() = 'Карьерный трек?']/following-sibling::input")
    private WebElement isCV;
    public void enterIsCV() {
        isCV.click();
    }

    @FindBy(xpath = "//small[text() = 'Открытие поиска (передали в саилз отдел)']/following-sibling::input")
    private WebElement userOpenSea;
    public void enterUserOpenSea(String userOpenSeaText) {
        userPass.sendKeys(userOpenSeaText);
    }

    public void addUsers(String usersName,
                         String userFamili
            ,String userMail
            ,String userLogin
            ,String userPass
            ,String userRole
            ,String isCV
            ,String userOpenSea
            ,String userStatus
    ){
        clickAddUsersButton();
        enterInputName(usersName);
        enterUserFamili (userFamili);
        enterUserMail(userMail);
        enterUserLogin(userLogin);
        enterUserPass(userPass);
        enterUserRole(userRole);
        if (isCV.equals("true")) enterIsCV();
        enterUserOpenSea(userOpenSea);

    }


}

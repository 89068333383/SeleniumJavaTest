package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModulePage extends BaseSeleniumPage {
    public ModulePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addModule;

    public void clickAddModule() {
        addModule.click();
    }

    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement moduleName;

    public void enterModuleName(String moduleName) {
        this.moduleName.sendKeys(moduleName);
    }
    @FindBy(xpath = "//input[@placeholder='Кол-во квизов в экзамене'")
    private WebElement moduleCountQuiz;

    @FindBy(xpath = "//input[@placeholder='ID для перемещения'][1]")
    private WebElement moduleIdQuest;
    public void enterModuleIdQuest(String textModuleIdQuest) {
        moduleIdQuest.sendKeys(textModuleIdQuest);
    }

    @FindBy(xpath = "//button[@class='btn-primary btn '][1]")
    private WebElement addButtonModuleIdQuest;
    public void clickAddButtonModuleIdQuest() {
        addButtonModuleIdQuest.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createModuleButton;
    public void clickCreateModuleButton() {
        createModuleButton.click();
    }


    public void addModule(String moduleNameText, String textModuleIdQuest) {
        clickAddModule();
        enterModuleName(moduleNameText);
        enterModuleIdQuest(textModuleIdQuest);
        clickAddButtonModuleIdQuest();
        clickCreateModuleButton();
    }

}

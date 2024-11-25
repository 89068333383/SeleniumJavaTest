package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage extends BaseSeleniumPage {
    public CoursePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addCourseButton;
    public void clickAddCourseButton() {
        addCourseButton.click();
    }

    @FindBy(xpath = "//input[@placeholder='Название'][1]")
    private WebElement inputCourseName;
    public void enterInputCourseName(String courseNameText) {
        inputCourseName.sendKeys(courseNameText);
    }

    @FindBy(xpath ="//button[@class='btn btn-xs btn-default btn-push-add']")
    private WebElement addModuleButton;
    public void clickAddModuleButton() {
        addModuleButton.click();
    }

    @FindBy(xpath = "//input[@placeholder='Модуль']")
    private WebElement inputIdModule;
    public void enterInputIdModule(String moduleId) {
        inputIdModule.sendKeys(moduleId);
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createCourseButton;
    public void clickCreateCourseButton() {
        createCourseButton.click();
    }


    public void addCourse(String courseNameText, String moduleId) {
        clickAddCourseButton();
        enterInputCourseName(courseNameText);
        clickAddModuleButton();
        enterInputIdModule(moduleId);
        clickCreateCourseButton();
    }

}

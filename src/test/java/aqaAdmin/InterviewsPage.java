package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InterviewsPage extends BaseSeleniumPage {

    @FindBy(xpath = "//button[contains(text(),'+ Добавить')]")
    private WebElement addButtonInterviews;

    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement inputBoxName;

    @FindBy(xpath = "//button[contains(text() ,'Create')]")
    private WebElement createButtonInterviews;

    public void clickAddButtonInterviews() {
        addButtonInterviews.click();
    }
    public void enterInputBoxName(String inputName) {
        inputBoxName.sendKeys(inputName);
    }
    public void createButtonInterviews() {
        createButtonInterviews.click();
    }


    public InterviewsPage() {
        PageFactory.initElements(driver, this);
    }

    public void createInterviews(String interviewName) {
        clickAddButtonInterviews();
        enterInputBoxName(interviewName);
        createButtonInterviews();
    }
}

package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ExamPage extends BaseSeleniumPage {
    public ExamPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'+ Добавить')]")
    private WebElement addExamButton;
    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement examTitle;
    @FindBy(xpath = "//input[@placeholder='ID для перемещения']")
    private WebElement examID;
    @FindBy(xpath = "//button[contains(text(),'Переместить по Id')]")
    private WebElement examSubmit;
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createExamButton;

    public void clickAddExam(String title, String id) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        addExamButton.click();
        examTitle.sendKeys(title);
        examID.sendKeys(id);
        examSubmit.click();
        createExamButton.click();
    }
}

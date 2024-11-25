package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionsPage extends BaseSeleniumPage {

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement buttonAddQuestion;

    @FindBy(xpath = "//textarea[@class='w-md-editor-text-input ']")
    private WebElement questionText;

    @FindBy(xpath = "//button[@class='btn-primary btn ']")
    private WebElement createQuestionButton;

    public QuestionsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAddQuestion() {
        buttonAddQuestion.click();
    }
    public void enterQuestionText(String textQuestions) {
        questionText.sendKeys(textQuestions);
    }
    public void clickCreateQuestionButton() {
        createQuestionButton.click();
    }

    public void addQuestion(String question) {
        clickAddQuestion();
        enterQuestionText(question);
        clickCreateQuestionButton();
    }
}

package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuizesPage extends BaseSeleniumPage {
    public QuizesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement addQuiz;

    public void clickAddQuiz() {
        addQuiz.click();
    }

    @FindBy(xpath = "//textarea[@class='w-md-editor-text-input ']")
    private WebElement question;
    public void enterQuestion(String questionText) {
        question.sendKeys(questionText);
    }

    @FindBy(xpath = "//button[@class='btn btn-xs btn-default btn-push-add']")
    private WebElement buttonAddAnswerOptions;
    public void clickAddAnswerOptions() {
        buttonAddAnswerOptions.click();
    }

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    private WebElement checkboxOne;
    public void clickCheckboxOne() {
        checkboxOne.click();
    }
    @FindBy(xpath = "//textarea[@class='form-control mt20'][1]")
    private WebElement inpunBoxAnswerOptionsOne;
    public void enterInpunBoxAnswerOptionsOne(String answerOptionsOne) {
        inpunBoxAnswerOptionsOne.sendKeys(answerOptionsOne);
    }
    @FindBy(xpath = "//textarea[@class='form-control mt20'][2]")
    private WebElement inpunBoxAnswerOptionsTwo;
    public void enterInpunBoxAnswerOptionsTwo(String answerOptionsTwo) {
        inpunBoxAnswerOptionsTwo.sendKeys(answerOptionsTwo);
    }

    @FindBy(xpath = "//button[@class='btn-primary btn ']")
    private WebElement createQuizButton;
    public void clickCreateQuizButton() {
        createQuizButton.click();
    }

    public void addQuizes(String questionQuiz,String answerOptionsOne,String answerOptionsTwo) {
        clickAddQuiz();
        System.out.println("1");
        enterQuestion(questionQuiz);
        System.out.println("1");
        clickAddAnswerOptions();
        System.out.println("1");
        enterInpunBoxAnswerOptionsOne(answerOptionsOne);
        System.out.println("1");
        clickCheckboxOne();
        System.out.println("1");
        clickAddAnswerOptions();
        System.out.println("1");
        enterInpunBoxAnswerOptionsTwo(answerOptionsTwo);
        System.out.println("1");
        clickCreateQuizButton();
    }




}

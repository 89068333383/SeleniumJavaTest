package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BaseSeleniumPage {


    @FindBy(xpath = "//a[contains(text(),'Интервью')]")
    private WebElement linkInterviews;

    @FindBy(xpath = "//a[contains(text(),'Вопросы')]")
    private WebElement linkQuestions;

    @FindBy(xpath = "//a[contains(text(),'Квизы')]")
    private WebElement linkQuizes;

    @FindBy(xpath = "//a[contains(text(),'Модули')]")
    private WebElement linkModule;

    @FindBy(xpath = "//a[contains(text(),'Курсы')]")
    private WebElement linkCourse;


    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage createPage() {
        return this;
    }


    public InterviewsPage openInterviewsPage(){
        linkInterviews.click();
        return new InterviewsPage();
    }
    public QuestionsPage openQuestionsPage(){
        linkQuestions.click();
        return new QuestionsPage();
    }
    public QuizesPage openQuizesPage(){
        linkQuizes.click();
        return new QuizesPage();
    }
    public ModulePage openModulePage(){
        linkModule.click();
        return new ModulePage();
    }
    public CoursePage openCoursePage(){
        linkCourse.click();
        return new CoursePage();
    }
}

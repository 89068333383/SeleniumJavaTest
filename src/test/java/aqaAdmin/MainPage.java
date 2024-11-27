package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


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

    @FindBy(xpath = "//a[contains(text(),'Пользователи')]")
    private WebElement linkUsers;

    @FindBy(xpath = "//a[@href='/courses']")
    private WebElement linkCourses;

    @FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-h6 top-links css-1a3lqbo']/a")
    private WebElement menuInteviews;





    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage createPage() {
        return this;
    }


    public InterviewsPage openInterviewsPage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkInterviews));
        element.click();
        return new InterviewsPage();
    }
    public QuestionsPage openQuestionsPage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkQuestions));
        element.click();
        return new QuestionsPage();
    }
    public QuizesPage openQuizesPage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkQuizes));
        element.click();
        return new QuizesPage();
    }
    public ModulePage openModulePage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkModule));

        element.click();
        return new ModulePage();
    }
    public CoursePage openCoursePage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkCourse));
        element.click();
        return new CoursePage();
    }
    public UsersPage openUsersPage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkUsers));
        element.click();
        return new UsersPage();
    }

    public VoiceCoursePage openVoiceCoursePage(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linkCourses));
        element.click();
        return new VoiceCoursePage();
    }

    public EditInperviewPage openEditInterviewsPage(){

        WebElement elementMenuInterviews = wait.until(ExpectedConditions.visibilityOf(menuInteviews));
        elementMenuInterviews.click();
        return new EditInperviewPage();
    }

}

package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class TestPageEdit extends BaseSeleniumPage {
    public TestPageEdit() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-h6 top-links css-1a3lqbo']/a")
    private WebElement menuInteviews;
    public void openEditInterviewsPage(){
        WebElement elementMenuInterviews = wait.until(ExpectedConditions.elementToBeClickable(menuInteviews));
        elementMenuInterviews.click();
    }

    @FindBy(xpath = "//button[contains(text(),'+ Добавить')]")
    private WebElement addButtonInterviews;
    public void clickAddButtonInterviews() {
        addButtonInterviews.click();
    }

    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement inputBoxName;
    public void inputBoxName(String inputBoxNameInterview) {
        if (inputBoxNameInterview != null) {
            inputBoxName.sendKeys(inputBoxNameInterview);
        }else inputBoxName.sendKeys("");
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonInterviews;
    public void createButtonInterviews() {
        createButtonInterviews.click();
    }

    @FindBy(xpath = "//tbody[1]")
    private WebElement editButtonInterviews;
    public void clickEditButtonInterviews() {
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(editButtonInterviews));
        editButton.click();
    }

    @FindBy(xpath = "//div[@class='react-datepicker__input-container']/input")
    private WebElement inputBoxDateInterviews;
    public void enterInputBoxDateInterviews(String inputBoxDateInterviewsText) {
        if (inputBoxDateInterviewsText != null) {inputBoxDateInterviews.sendKeys(inputBoxDateInterviewsText, Keys.ENTER);}
    }
    //список типов
    @FindBy(xpath = "//select[@class='form-control']/option[1]")
    private WebElement selectTypeInterviews_0;
    @FindBy(xpath = "//select[@class='form-control']/option[2]")
    private WebElement selectTypeInterviews_hr;
    @FindBy(xpath = "//select[@class='form-control']/option[3]")
    private WebElement selectTypeInterviews_tech;


    public void enterSelectTypeInterviews(String selectTypeInterviewsText) {
        if (selectTypeInterviewsText != null ) {
            switch (selectTypeInterviewsText.toLowerCase()) {
                case "hr":
                    selectTypeInterviews_hr.click();
                case "tech":
                    selectTypeInterviews_tech.click();
            }
        }else selectTypeInterviews_0.click();
    }
    //видео ссылка
    @FindBy(xpath = "//input[@placeholder='Видео ссылка']")
    private WebElement inputBoxDateInterviewsLinkVideo;
    public void enterInputBoxDateInterviewsLinkVideo(String linkVideo){
        if (linkVideo != null) {inputBoxDateInterviews.sendKeys(linkVideo, Keys.ENTER);}
    }
    //собственная оценка
    @FindBy(xpath = "//textarea[@placeholder='Собственная оценка интервью']")
    private WebElement inputBoxDateInterviewsEstimation;
    public void enterInputBoxDateInterviewsEstimation(String textEstimation){
        if (textEstimation != null) {
            inputBoxDateInterviewsEstimation.sendKeys(textEstimation);
        }
    }
    //кнопка сохранить
    @FindBy(xpath = "//button[contains(text(),'Сохранить')][1]")
    private WebElement saveButtonInterviews;
    public void clickSaveButtonInterviews() {
        saveButtonInterviews.click();
    }
    //кнопка вернуть
    @FindBy(xpath = "//a[@class='back-link pull-left']")
    private WebElement backButtonInterviews;
    public void clickBackButtonInterviews() {
        backButtonInterviews.click();
    }

    public void addAndEditInperview(
            String inperviewName
            , String inperviewDate
            , String inperviewType
            , String linkVideo
            , String textEstimation
    ) throws InterruptedException {


        Thread.sleep(1000);

        openEditInterviewsPage();


        clickAddButtonInterviews(); //добавить интервью
        inputBoxName(inperviewName); //ввести название интервью
        createButtonInterviews(); //нажати кнопки create

        Thread.sleep(Duration.ofSeconds(5));


        clickEditButtonInterviews();
        enterInputBoxDateInterviews(inperviewDate);

        enterSelectTypeInterviews(inperviewType);

        enterInputBoxDateInterviewsLinkVideo(linkVideo);
        enterInputBoxDateInterviewsEstimation(textEstimation);
        clickSaveButtonInterviews();
        clickBackButtonInterviews();

    }
}

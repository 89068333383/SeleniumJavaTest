package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditInperviewPage extends BaseSeleniumPage {
    public EditInperviewPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'+ Добавить')]")
    private WebElement addButtonInterviews;
    public void clickAddButtonInterviews() {
        addButtonInterviews.click();
    }

    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement inputBoxName;
    public void inputBoxName(String inputBoxNameInterview) {
        inputBoxName.sendKeys(inputBoxNameInterview);
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonInterviews;
    public void createButtonInterviews() {
        createButtonInterviews.click();
    }

    @FindBy(xpath = "//tbody[1]")
    private WebElement editButtonInterviews;
    public void clickEditButtonInterviews() {
        WebElement editButton = wait.until(ExpectedConditions.visibilityOf(editButtonInterviews));
        editButton.click();
    }

    @FindBy(xpath = "//div[@class='react-datepicker__input-container']/input")
    private WebElement inputBoxDateInterviews;
    public void enterInputBoxDateInterviews(String inputBoxDateInterviewsText) {
        inputBoxDateInterviews.sendKeys(inputBoxDateInterviewsText, Keys.ENTER);
    }
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement selectTypeInterviews;
    public void enterSelectTypeInterviews(String selectTypeInterviewsText) {
        selectTypeInterviews.sendKeys(selectTypeInterviewsText);
    }
    @FindBy(xpath = "//input[@placeholder='Видео ссылка']")
    private WebElement inputBoxDateInterviewsLinkVideo;
    public void enterInputBoxDateInterviewsLinkVideo(String linkVideo){
        inputBoxDateInterviewsLinkVideo.sendKeys(linkVideo);
    }
    @FindBy(xpath = "//textarea[@placeholder='Собственная оценка интервью']")
    private WebElement inputBoxDateInterviewsEstimation;
    public void enterInputBoxDateInterviewsEstimation(String textEstimation){
        inputBoxDateInterviewsEstimation.sendKeys(textEstimation);
    }
    @FindBy(xpath = "//button[contains(text(),'Сохранить')][1]")
    private WebElement saveButtonInterviews;
    public void clickSaveButtonInterviews() {
        saveButtonInterviews.click();
    }
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
    ) {
        clickAddButtonInterviews(); //добавить интервью
        inputBoxName(inperviewName); //ввести название интервью
//        clickAddButtonInterviews();
        createButtonInterviews(); //нажати кнопки create

        clickEditButtonInterviews();
        enterInputBoxDateInterviews(inperviewDate);
        enterSelectTypeInterviews(inperviewType);
        enterInputBoxDateInterviewsLinkVideo(linkVideo);
        enterInputBoxDateInterviewsEstimation(textEstimation);
        clickSaveButtonInterviews();
        clickBackButtonInterviews();
    }
}

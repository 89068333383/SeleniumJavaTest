package aqaAdmin;

import core.BaseSeleniumPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class EditInterviewsPage extends BaseSeleniumPage {
    public EditInterviewsPage() {
        PageFactory.initElements(driver, this);
    }

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


    @FindBy(xpath = "//tbody[1]")
    private WebElement editButtonInterviews;
    public void clickEditButtonInterviews() {
        WebElement editButton = wait.until(ExpectedConditions.visibilityOf(editButtonInterviews));
        editButton.click();
    }

    @FindBy(xpath = "//input[@placeholder='Название']")
    private WebElement inputBoxNameInterviews;
    public void enterInputBoxNameInterviews(String textName){
        inputBoxNameInterviews.sendKeys(textName);
    }
    @FindBy(xpath = "//div[@class='react-datepicker__input-container']/input")
    private WebElement inputBoxDateInterviews;
//    public void enterInputBoxDateInterviews(){
//        inputBoxDateInterviews.click();
//    }
//    FindBy(xpath = "//in")



    public void enterInputBoxDateInterviews(String textDate){
        inputBoxDateInterviews.sendKeys(textDate);
    }

    @FindBy(xpath = "//textarea[@placeholder='Собственная оценка интервью']")
    private WebElement inputBoxDateInterviewsEstimation;
    public void enterInputBoxDateInterviewsEstimation(String textEstimation){
        inputBoxDateInterviewsEstimation.sendKeys(textEstimation);
    }

    @FindBy(xpath = "//input[@placeholder='Видео ссылка']")
    private WebElement inputBoxDateInterviewsLinkVideo;
    public void enterInputBoxDateInterviewsLinkVideo(String linkVideo){
        inputBoxDateInterviewsLinkVideo.sendKeys(linkVideo);
    }

    @FindBy(xpath = "//small[contains(text(),'Тип')]/following-sibling::select)")
    private WebElement selectButtonInterviews;

    public void clickSelectButtonInterviews(String textType) {
        selectButtonInterviews.sendKeys(textType);
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

    public void addAndEditInterviews() {

        clickAddButtonInterviews();
        enterInputBoxName("interviews for edit");
        createButtonInterviews();
        clickEditButtonInterviews();
        enterInputBoxNameInterviews("стринга на латинице"); //name
//        enterInputBoxDateInterviews("21/11/2024"); //date
        enterInputBoxDateInterviewsEstimation("стринга на кириллице"); //оцунка
        enterInputBoxDateInterviewsLinkVideo(" "); //link video
//        clickSelectButtonInterviews("tech");//выбор типа
        clickSaveButtonInterviews();
        clickBackButtonInterviews();
    }
}

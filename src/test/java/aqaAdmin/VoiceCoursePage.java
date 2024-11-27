package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.devtools.v130.browser.Browser.setPermission;


public class VoiceCoursePage extends BaseSeleniumPage {
    public VoiceCoursePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/courses']")
    private WebElement courseTitle;
    public void clickCourseTitle() {
        courseTitle.click();
    }

    @FindBy(xpath = "//a[@class='mainCont3 coursePreview']")
    private WebElement buttonKnowledgeCheck;
    public void clickButtonKnowledgeCheck() {
        buttonKnowledgeCheck.click();
    }

    @FindBy(xpath = "//button[@class='btn-primary btn btn btn-sm btn-primary']")
    private WebElement buttonKnowledge;
    public void clickButtonKnowledge() {
        buttonKnowledge.click();
    }

    @FindBy(xpath = "//button[@class='btndefault btn btn-md']")
    private WebElement buttonKnowledgeRec;
    public void clickButtonKnowledgeRec() {
        buttonKnowledgeRec.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Завершить запись')]")
    private WebElement buttonKnowledgeRecRec;
    public void clickButtonKnowledgeRecRec() {
        buttonKnowledgeRecRec.click();
    }

    @FindBy(xpath = "//span[@class='shortTag '][5]")
    private WebElement buttonNumBall;
    public void clickButtonNumBall() {
        buttonNumBall.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Дальше')]")
    private WebElement buttonNext;
    public void clickButtonNext() {
        buttonNext.click();
    }
    @FindBy(xpath = "//button[contains(text(),'Отлично, перейти к след модулю')]")
    private WebElement buttonPrev;
    public void clickButtonPrev() {
        buttonPrev.click();
    }



    public void addVoice() {

        clickButtonKnowledgeCheck();
        clickButtonKnowledge();

        clickButtonKnowledgeRecRec();
        clickButtonNumBall();
        clickButtonNext();
        clickButtonPrev();

    }




}

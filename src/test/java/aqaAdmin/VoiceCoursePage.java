package aqaAdmin;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoiceCoursePage extends BaseSeleniumPage {
    public VoiceCoursePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody[1]/descendant::span")
    private WebElement courseTitle;
    public void clickCourseTitle() {
        courseTitle.click();
    }

    @FindBy(xpath = "//button[@class=\'btn-primary btn btn btn-sm btn-primary\']")
    private WebElement buttonKnowledgeCheck;
    public void clickButtonKnowledgeCheck() {
        buttonKnowledgeCheck.click();
    }




}

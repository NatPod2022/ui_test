package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import test.interactions.BaseActions;

public class PreTrialDashboardAfterCancelTrialPage extends BaseActions {

    public PreTrialDashboardAfterCancelTrialPage(AppiumDriver driver) {
        super(driver);
    }


    public By labelNovakid = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public By logoParent = By.xpath("//android.view.View[@content-desc='PP']");
    public By title = By.xpath("//android.view.View[@content-desc='Claim your free lesson!']");
    public By textWeAreSorry = By.xpath("//android.view.View[@content-desc=\"We're sorry you had to cancel your trial lesson. But you can rebook it. Do it now!\"]");
    public By bookButton = By.xpath("//android.widget.Button[@content-desc='Book my trial lesson']");
    public By titleHomework = By.xpath("//android.view.View[@content-desc='Homework']");
    public By studentBlock = By.xpath("//android.widget.ImageView[contains(@content-desc, 'All exercises have been completed')]");
    public By dashboardTab = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Dashboard')]");
    public By scheduleTab = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Schedule')]");
    public By kaTab = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Classroom, homework')]");
    public By achievementTab = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Achievements')]");
    public By supportTab = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Support')]");




    public WebElement getLabelNovakid() {
        return waitForElementPresent(labelNovakid, "Cannot find Novakid label", 5, true);
    }

    public WebElement getLogoParent() {
        return waitForElementPresent(logoParent, "Cannot find parent logo", 5, true);
    }

    public WebElement getTitle() {
        return waitForElementPresent(title, "Cannot find 'Claim your free lesson!' title", 5, true);
    }

    public WebElement getTextWeAreSorry() {
        return waitForElementPresent(textWeAreSorry, "Cannot find apology text", 5, true);
    }

    public WebElement getBookButton() {
        return waitForElementPresent(bookButton, "Cannot find 'Book my trial lesson' button", 5, true);
    }

    public WebElement getTitleHomework() {
        return waitForElementPresent(titleHomework, "Cannot find 'Homework' title", 5, true);
    }

    public WebElement getStudentBlock() {
        return waitForElementPresent(studentBlock, "Cannot find student block", 5, true);
    }

    public WebElement getDashboardTab() {
        return waitForElementPresent(dashboardTab, "Cannot find Dashboard tab", 5, true);
    }

    public WebElement getScheduleTab() {
        return waitForElementPresent(scheduleTab, "Cannot find Schedule tab", 5, true);
    }

    public WebElement getKaTab() {
        return waitForElementPresent(kaTab, "Cannot find KA tab", 5, true);
    }

    public WebElement getAchievementTab() {
        return waitForElementPresent(achievementTab, "Cannot find Achievements tab", 5, true);
    }

   public WebElement getSupportTab() {
        return waitForElementPresent(supportTab, "Cannot find Support tab", 5, true);
    }
}

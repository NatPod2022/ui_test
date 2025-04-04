package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import test.interactions.BaseActions;

public class OpenScheduleTabPage extends BaseActions {

    public OpenScheduleTabPage(AppiumDriver driver) {
        super(driver);
    }

    public By titleSchedule = MobileBy.AccessibilityId("Schedule");
    public By premiumLesson = By.xpath("//android.view.View[@content-desc='Premium lesson']");
    public By standardLesson = By.xpath("//android.view.View[@content-desc='Standard lesson']");
    public By premiumLessonCount = By.xpath("(//android.view.View[@content-desc='1'])[1]");
    public By standardLessonCount = By.xpath("(//android.view.View[@content-desc='1'])[2]");
    public By upcomingTab = By.xpath("//android.view.View[contains(@content-desc, 'Upcoming')]");
    public By completedTab = By.xpath("//android.view.View[contains(@content-desc, 'Completed')]");
    public By timeZoneText = By.xpath("//android.view.View[contains(@content-desc, 'Time zone')]");
    public By noLessonsMessage = By.xpath("//android.widget.ImageView[@content-desc=\"Your child has no lessons scheduled. Tap '+ Book lesson' to add some.\"]");
    public By bookLessonsButton = By.xpath("//android.widget.Button[@content-desc='Book lessons']");

    public WebElement getTittleSchedule() {
        return waitForElementPresent(titleSchedule, "Cannot find Schedule tittle", 5, true);
    }

    public WebElement getPremiumLesson() {
        return waitForElementPresent(premiumLesson, "Cannot find Premium lesson", 5, true);
    }
    public WebElement getPremiumLessonCount() {
        return waitForElementPresent(premiumLessonCount, "Cannot find Premium lesson count", 5, true);
    }

    public WebElement getStandardLessonCount() {
        return waitForElementPresent(standardLessonCount, "Cannot find Standard lesson count", 5, true);
    }

    public WebElement getStandardLesson() {
        return waitForElementPresent(standardLesson, "Cannot find Standard lesson", 5, true);
    }

    public WebElement getUpcomingTab() {
        return waitForElementPresent(upcomingTab, "Cannot find Upcoming tab", 5, true);
    }

    public WebElement getCompletedTab() {
        return waitForElementPresent(completedTab, "Cannot find Completed tab", 5, true);
    }

    public WebElement getTimeZoneText() {
        return waitForElementPresent(timeZoneText, "Cannot find Time zone text", 5, true);
    }

    public WebElement getNoLessonsMessage() {
        return waitForElementPresent(noLessonsMessage, "Cannot find empty schedule message", 5, true);
    }

    public WebElement getBookLessonsButton() {
        return waitForElementPresent(bookLessonsButton, "Cannot find 'Book lessons' button", 5, true);
    }
}

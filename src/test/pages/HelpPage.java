package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class HelpPage extends BaseActions {

    public HelpPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    public By helpTitle = By.xpath("//android.widget.TextView[@text='Help']");
    public By collectionsCount = By.xpath("//android.widget.TextView[@text='8 collections']");

    public By organizeTrialText = By.xpath("//android.widget.TextView[@text='Organize or adjust your trial lesson']");
    public By bookingText = By.xpath("//android.widget.TextView[@text='Booking, moving or cancelation of a lesson']");
    public By bookingArticles = By.xpath("//android.widget.TextView[@text='4 articles']");

    public By manageScheduleText = By.xpath("//android.widget.TextView[@text='Manage Your Schedule']");
    public By manageScheduleDescription = By.xpath("//android.widget.TextView[@text='Managing lessons, including scheduling, moving and canceling options.']");
    public By manageScheduleArticles = By.xpath("(//android.widget.TextView[@text='1 article'])[1]");

    public By subscriptionText = By.xpath("//android.widget.TextView[@text='Subscription, Bonuses & Payments']");
    public By subscriptionArticles = By.xpath("//android.widget.TextView[@text='9 articles']");
    public By techSupportText = By.xpath("//android.widget.TextView[@text='Tech recommendations, solving connections issues and other lesson requirements ']");
    public By techSupportArticles = By.xpath("(//android.widget.TextView[@text='2 articles'])[1]");

    public By teachersText = By.xpath("//android.widget.TextView[@text='Teachers']");
    public By teachersDescription = By.xpath("//android.widget.TextView[@text='Managing your Novakid teacher preferences, including substitute teacher option.']");
    public By teachersArticles = By.xpath("(//android.widget.TextView[@text='1 article'])[2]");

    public By accountText = By.xpath("//android.widget.TextView[@text='Your Novakid account']");
    public By accountDescription = By.xpath("//android.widget.TextView[@text='Guidance to your account, managing its settings and personal information']");
    public By accountArticles = By.xpath("(//android.widget.TextView[@text='1 article'])[3]");


    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getHelpTitle() {
        return waitForElementPresent(helpTitle, "Cannot find 'Help' title", 5, true);
    }

    public WebElement getCollectionsCount() {
        return waitForElementPresent(collectionsCount, "Cannot find '8 collections' text", 5, true);
    }

    public WebElement getOrganizeTrialText() {
        return waitForElementPresent(organizeTrialText, "Cannot find 'Organize or adjust your trial lesson' text", 5, true);
    }

    public WebElement getBookingText() {
        return waitForElementPresent(bookingText, "Cannot find booking text", 5, true);
    }

    public WebElement getBookingArticles() {
        return waitForElementPresent(bookingArticles, "Cannot find '4 articles' text", 5, true);
    }

    public WebElement getManageScheduleText() {
        return waitForElementPresent(manageScheduleText, "Cannot find 'Manage Your Schedule' text", 5, true);
    }

    public WebElement getManageScheduleDescription() {
        return waitForElementPresent(manageScheduleDescription, "Cannot find schedule description", 5, true);
    }

    public WebElement getManageScheduleArticles() {
        return waitForElementPresent(manageScheduleArticles, "Cannot find '1 article' under schedule", 5, true);
    }

    public WebElement getSubscriptionText() {
        return waitForElementPresent(subscriptionText, "Cannot find subscription text", 5, true);
    }

    public WebElement getSubscriptionArticles() {
        return waitForElementPresent(subscriptionArticles, "Cannot find '9 articles'", 5, true);
    }

    public WebElement getTechSupportText() {
        return waitForElementPresent(techSupportText, "Cannot find tech support text", 5, true);
    }

    public WebElement getTechSupportArticles() {
        return waitForElementPresent(techSupportArticles, "Cannot find tech support articles", 5, true);
    }

    public WebElement getTeachersText() {
        return waitForElementPresent(teachersText, "Cannot find 'Teachers' text", 5, true);
    }

    public WebElement getTeachersDescription() {
        return waitForElementPresent(teachersDescription, "Cannot find teachers description", 5, true);
    }

    public WebElement getTeachersArticles() {
        return waitForElementPresent(teachersArticles, "Cannot find teachers articles count", 5, true);
    }

    public WebElement getAccountText() {
        return waitForElementPresent(accountText, "Cannot find 'Your Novakid account' text", 5, true);
    }

    public WebElement getAccountDescription() {
        return waitForElementPresent(accountDescription, "Cannot find account description", 5, true);
    }

    public WebElement getAccountArticles() {
        return waitForElementPresent(accountArticles, "Cannot find account articles count", 5, true);
    }
}

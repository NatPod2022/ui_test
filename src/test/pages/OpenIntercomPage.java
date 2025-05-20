package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class OpenIntercomPage extends BaseActions {

    public OpenIntercomPage(AppiumDriver driver) {
        super(driver);
    }

    public By profileImage = By.xpath("//android.widget.ImageView[@content-desc='Profile image for Novakid']");
    public By greetingText = By.xpath("//android.widget.TextView[@text='Hi Pre_trial_after_cancel 👋']");
    public By helpTitle = By.xpath("//android.widget.TextView[@text='How can we help?']");
    public By helpTab = By.xpath("//android.widget.TextView[@text='Help']");
    public By messagesTab = By.xpath("//android.widget.TextView[@text='Messages']");
    public By searchInput = By.xpath("//android.widget.TextView[@text='Search for help']");
    public By articleDiscount = By.xpath("//android.widget.TextView[@text='How To Get and Use a Discount']");
    public By articleBooking = By.xpath("//android.widget.TextView[@text='How to book lessons']");
    public By articleLessonTypes = By.xpath("//android.widget.TextView[@text='Standard and Premium Lessons']");
    public By articlePrices = By.xpath("//android.widget.TextView[@text='Where can i see prices?']");
    public By helpCenterFooter = By.xpath("//android.widget.TextView[@text='Novakid Help Center ']");
    public By sendMessageButton = By.xpath("//android.widget.TextView[@text='Send us a message']");
    public By scrollArea = By.xpath("//android.widget.ScrollView/android.view.View[4]/android.view.View/android.view.View");
    public By closeButton = By.xpath("//android.view.View[@content-desc='Close']");

    public WebElement getProfileImage() {
        return waitForElementPresent(profileImage, "Cannot find profile image", 5, true);
    }

    public WebElement getGreetingText() {
        return waitForElementPresent(greetingText, "Cannot find greeting text", 5, true);
    }

    public WebElement getHelpTitle() {
        return waitForElementPresent(helpTitle, "Cannot find help title", 5, true);
    }

    public WebElement getHelpTab() {
        return waitForElementPresent(helpTab, "Cannot find Help tab", 5, true);
    }

    public WebElement getMessagesTab() {
        return waitForElementPresent(messagesTab, "Cannot find Messages tab", 5, true);
    }

    public WebElement getSearchInput() {
        return waitForElementPresent(searchInput, "Cannot find search input", 5, true);
    }

    public WebElement getArticleDiscount() {
        return waitForElementPresent(articleDiscount, "Cannot find article 'Discount'", 5, true);
    }

    public WebElement getArticleBooking() {
        return waitForElementPresent(articleBooking, "Cannot find article 'Booking'", 5, true);
    }

    public WebElement getArticleLessonTypes() {
        return waitForElementPresent(articleLessonTypes, "Cannot find article 'Lesson types'", 5, true);
    }

    public WebElement getArticlePrices() {
        return waitForElementPresent(articlePrices, "Cannot find article 'Prices'", 5, true);
    }

    public WebElement getHelpCenterFooter() {
        return waitForElementPresent(helpCenterFooter, "Cannot find help center footer", 5, true);
    }

    public WebElement getSendMessageButton() {
        return waitForElementPresent(sendMessageButton, "Cannot find 'Send us a message' button", 5, true);
    }

    public WebElement getScrollArea() {
        return waitForElementPresent(scrollArea, "Cannot find scroll area", 5, true);
    }

    public WebElement getCloseButton() {
        return waitForElementPresent(closeButton, "Cannot find Close button", 5, true);
    }
}

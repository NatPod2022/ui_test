package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class AccountPage extends BaseActions {

    public AccountPage(AppiumDriver driver) {
        super(driver);
    }

    public By userHeader = By.xpath("//android.view.View[contains(@content-desc, 'PP')]");
    public By accountTitle = By.xpath("//android.view.View[@content-desc='Account']");
    public By personalInfo = By.xpath("//android.view.View[@content-desc='Personal information']");
    public By changePassword = By.xpath("//android.view.View[@content-desc='Change password']");
    public By balanceHistory = By.xpath("//android.view.View[@content-desc='Balance history']");
    public By privacyPolicy = By.xpath("//android.view.View[@content-desc='Privacy policy']");
    public By termsAndConditions = By.xpath("//android.view.View[@content-desc='Terms and Conditions']");
    public By backButton = By.xpath("//android.widget.Button");
    public By topDividerLine = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
    public By bottomDividerLine = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]");

    public WebElement getUserHeader() {
        return waitForElementPresent(userHeader, "Cannot find user header", 5, true);
    }

    public WebElement getAccountTitle() {
        return waitForElementPresent(accountTitle, "Cannot find Account title", 5, true);
    }

    public WebElement getPersonalInfo() {
        return waitForElementPresent(personalInfo, "Cannot find Personal information", 5, true);
    }

    public WebElement getChangePassword() {
        return waitForElementPresent(changePassword, "Cannot find Change password", 5, true);
    }

    public WebElement getBalanceHistory() {
        return waitForElementPresent(balanceHistory, "Cannot find Balance history", 5, true);
    }

    public WebElement getPrivacyPolicy() {
        return waitForElementPresent(privacyPolicy, "Cannot find Privacy policy", 5, true);
    }

    public WebElement getTermsAndConditions() {
        return waitForElementPresent(termsAndConditions, "Cannot find Terms and Conditions", 5, true);
    }

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find back button", 5, true);
    }

    public WebElement getTopDividerLine() {
        return waitForElementPresent(topDividerLine, "Cannot find top divider line", 5, true);
    }

    public WebElement getBottomDividerLine() {
        return waitForElementPresent(bottomDividerLine, "Cannot find bottom divider line", 5, true);
    }
}

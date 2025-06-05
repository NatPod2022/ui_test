package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class BalanceHistoryPage extends BaseActions {

    public BalanceHistoryPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By balanceHistoryTitle = By.xpath("//android.view.View[@content-desc='Balance history']");
    public By trialLessonEntry = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Trial lesson')]");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getBalanceHistoryTitle() {
        return waitForElementPresent(balanceHistoryTitle, "Cannot find Balance History title", 5, true);
    }

    public WebElement getTrialLessonEntry() {
        return waitForElementPresent(trialLessonEntry, "Cannot find Trial Lesson entry", 5, true);
    }
}

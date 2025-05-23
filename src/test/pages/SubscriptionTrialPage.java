package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class SubscriptionTrialPage extends BaseActions {

    public SubscriptionTrialPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By titlePackage = By.xpath("//android.view.View[@content-desc='Package']");
    public By titleStandardPackage = By.xpath("//android.view.View[@content-desc='Standard Package']");
    public By titlePremium = By.xpath("//android.view.View[@content-desc='Premium']");
    public By price1st = By.xpath("(//android.view.View[@content-desc='1'])[1]");
    public By textOr = By.xpath("//android.view.View[@content-desc='or']");
    public By titleStandard = By.xpath("//android.view.View[@content-desc='Standard']");
    public By price2nd = By.xpath("(//android.view.View[@content-desc='1'])[2]");
    public By topUpBalanceButton = By.xpath("//android.widget.Button[@content-desc='Top up balance']");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getTitlePackage() {
        return waitForElementPresent(titlePackage, "Cannot find Package title", 5, true);
    }

    public WebElement getTitleStandardPackage() {
        return waitForElementPresent(titleStandardPackage, "Cannot find Standard Package title", 5, true);
    }

    public WebElement getTitlePremium() {
        return waitForElementPresent(titlePremium, "Cannot find Premium title", 5, true);
    }

    public WebElement getPrice1st() {
        return waitForElementPresent(price1st, "Cannot find first price", 5, true);
    }

    public WebElement getTextOr() {
        return waitForElementPresent(textOr, "Cannot find 'or' text", 5, true);
    }

    public WebElement getTitleStandard() {
        return waitForElementPresent(titleStandard, "Cannot find Standard title", 5, true);
    }

    public WebElement getPrice2nd() {
        return waitForElementPresent(price2nd, "Cannot find second price", 5, true);
    }

    public WebElement getTopUpBalanceButton() {
        return waitForElementPresent(topUpBalanceButton, "Cannot find 'Top up balance' button", 5, true);
    }
}

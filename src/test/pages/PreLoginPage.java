package test.pages;

import io.appium.java_client.AppiumDriver;
import test.interactions.BaseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PreLoginPage extends BaseActions {

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By tryForFreeButton = By.xpath("//android.widget.Button[@content-desc='Try for Free']");
    public By widgetScheduleLessons = By.xpath("//android.widget.ImageView[contains(@content-desc,'Schedule lessons')]");
    public By loginButton = By.xpath("//android.widget.Button[@content-desc='Login']");

    public PreLoginPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getTryForFreeButton() {
        return waitForElementPresent(tryForFreeButton, "Cannot find Try for Free button", 5, true);
    }

    public WebElement getWidgetScheduleLessons() {
        return waitForElementPresent(widgetScheduleLessons, "Cannot find Schedule Lessons widget", 5, true);
    }

    public WebElement getLoginButton() {
        return waitForElementPresent(loginButton, "Cannot find Login button", 5, true);
    }
}

package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class PreLoginPage extends BaseActions {

    public By welcomeTitle     = By.xpath("//android.view.View[@content-desc='Welcome to Novakid']");
    public By subtitleText     = By.xpath("//android.view.View[@content-desc='Exciting gamified English learning for kids aged 4 to 12']");
    public By tryForFreeButton = By.xpath("//android.widget.Button[@content-desc='Try for Free']");
    public By loginButton      = By.xpath("//android.widget.Button[@content-desc=\"Sign in\"]");

    public PreLoginPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getWelcomeTitle() {
        return waitForElementPresent(welcomeTitle, "Cannot find 'Welcome to Novakid' title", 5, true);
    }

    public WebElement getSubtitleText() {
        return waitForElementPresent(subtitleText, "Cannot find subtitle text", 5, true);
    }

    public WebElement getTryForFreeButton() {
        return waitForElementPresent(tryForFreeButton, "Cannot find 'Try for Free' button", 5, true);
    }

    public WebElement getLoginButton() {
        return waitForElementPresent(loginButton, "Cannot find 'Sign in' button (dad and girl page)", 5, true);
    }
}

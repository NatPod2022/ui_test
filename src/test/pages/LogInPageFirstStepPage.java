package test.pages;

import io.appium.java_client.AppiumDriver;
import test.interactions.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPageFirstStepPage extends BaseActions {



    public By logInTitle = By.xpath("//android.view.View[@content-desc='Log in to your account']");
    public By logInGoogleButton = By.xpath("//android.widget.ImageView[@content-desc='Log in with Google']");
    public By logInEmailPhoneButton = By.xpath("//android.widget.Button[@content-desc='Log in with email/phone']");
    public By haveYouAccountTitle = By.xpath("//android.view.View[contains(@content-desc, \"Don't have an account\")]");
    public By registerButton = By.xpath("//android.widget.Button[@content-desc='Register']");

    public LogInPageFirstStepPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getLogInTitle() {
        return waitForElementPresent(logInTitle, "Cannot find 'Log in to your account' title", 5, true);
    }

    public WebElement getLogInGoogleButton() {
        return waitForElementPresent(logInGoogleButton, "Cannot find 'Log in with Google' button", 5, true);
    }

    public WebElement getLogInEmailPhoneButton() {
        return waitForElementPresent(logInEmailPhoneButton, "Cannot find 'Log in with email/phone' button", 5, true);
    }

    public WebElement getHaveYouAccountTitle() {
        return waitForElementPresent(haveYouAccountTitle, "Cannot find 'Don't have an account yet?' title", 5, true);
    }

    public WebElement getRegisterButton() {
        return waitForElementPresent(registerButton, "Cannot find 'Register' button", 5, true);
    }
}

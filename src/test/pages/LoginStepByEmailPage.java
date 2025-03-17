package test.pages;

import io.appium.java_client.AppiumDriver;

import test.interactions.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginStepByEmailPage extends BaseActions {

    public By logInTitleSecondStep = By.xpath("//android.view.View[@content-desc='Log in to your account']");
    public By emailTab = By.xpath("//android.view.View[contains(@content-desc, 'Email')]");
    public By phoneTab = By.xpath("//android.view.View[contains(@content-desc, 'Phone')]");
    public By logInInputField = By.xpath("//android.view.View[@content-desc='Log in to your account']/android.widget.EditText");
    public By continueButton = By.xpath("//android.widget.Button[@content-desc='Continue']");
    public By loginWithPasswordButton = By.xpath("//android.widget.Button[@content-desc='Login with password']");
    public By backButtonSecond = By.xpath("//android.widget.Button[contains(@content-desc, 'Back')]");

    public LoginStepByEmailPage(AppiumDriver driver) {
        super(driver);
    }


    public WebElement getLogInTitleSecondStep() {
        return waitForElementPresent(logInTitleSecondStep, "Cannot find 'Log in to your account' title", 10, true);
    }

    public WebElement getEmailTab() {
        return waitForElementPresent(emailTab, "Cannot find 'Email Tab'", 5, true);
    }

    public WebElement getPhoneTab() {
        return waitForElementPresent(phoneTab, "Cannot find 'Phone Tab'", 5, true);
    }

    public WebElement getLogInInputField() {
        return waitForElementPresent(logInInputField, "Cannot find input field for login by Email", 5, true);
    }

    public WebElement getContinueButton() {
        return waitForElementPresent(continueButton, "Cannot find 'Continue' button", 5, true);
    }

    public WebElement getLoginWithPasswordButton() {
        return waitForElementPresent(loginWithPasswordButton, "Cannot find 'Login with password' button", 5, true);
    }

    public WebElement getBackButtonSecond() {
        return waitForElementPresent(backButtonSecond, "Cannot find 'Back Back' button", 5, true);
    }
}

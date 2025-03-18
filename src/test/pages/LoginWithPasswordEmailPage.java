package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class LoginWithPasswordEmailPage extends BaseActions {

    public By passwordInputField = By.xpath("//android.view.View[contains(@content-desc, 'Log in to your account')]//android.widget.EditText");
    public By signInButton = By.xpath("//android.widget.Button[contains(@content-desc, 'Sign in')]");
    public By loginWithAccessCodeButton = By.xpath("//android.widget.Button[contains(@content-desc, 'Login with access code')]");
    public By forgotPasswordButton = By.xpath("//android.widget.Button[@content-desc='I forgot password']");

    public LoginWithPasswordEmailPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getPasswordInputField() {
        return waitForElementPresent(passwordInputField, "Cannot find password input field", 3, true);
    }

    public WebElement getSignInButton() {
        return waitForElementPresent(signInButton, "Cannot find 'Sign in' button", 3, true);
    }

    public WebElement getLoginWithAccessCodeButton() {
        return waitForElementPresent(loginWithAccessCodeButton, "Cannot find 'Login with access code' button", 3, true);
    }

    public WebElement getForgotPasswordButton() {
        return waitForElementPresent(forgotPasswordButton, "Cannot find 'I forgot password' button", 3, true);
    }
}

package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class LoginWithPasswordPhonePage extends BaseActions {

    public By passwordPhoneInputField = By.xpath("//android.view.View[contains(@content-desc, 'Log in to your account')]//android.widget.EditText");
    public By signInPhoneButton = By.xpath("//android.widget.Button[contains(@content-desc, 'Sign in')]");
    public By loginWithAccessPhoneCodeButton = By.xpath("//android.widget.Button[contains(@content-desc, 'Login with access code')]");
    public By forgotPasswordPhoneButton = By.xpath("//android.widget.Button[@content-desc='I forgot password']");

    public LoginWithPasswordPhonePage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getPasswordPhoneInputField() {
        return waitForElementPresent(passwordPhoneInputField, "Cannot find password input field", 3, true);
    }

    public WebElement getSignInPhoneButton() {
        return waitForElementPresent(signInPhoneButton, "Cannot find 'Sign in' button", 3, true);
    }

    public WebElement getLoginWithAccessPhoneCodeButton() {
        return waitForElementPresent(loginWithAccessPhoneCodeButton, "Cannot find 'Login with access code' button", 3, true);
    }

    public WebElement getForgotPasswordPhoneButton() {
        return waitForElementPresent(forgotPasswordPhoneButton, "Cannot find 'I forgot password' button", 3, true);
    }
}

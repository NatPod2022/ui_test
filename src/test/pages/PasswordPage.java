package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class PasswordPage extends BaseActions {

    public PasswordPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc=\"Back\"]");
    public By setPasswordTitle = By.xpath("//android.view.View[@content-desc=\"Set password\"]");
    public By passwordInfoText = By.xpath("//android.view.View[contains(@content-desc, 'When you reset the password')]");
    public By newPasswordField = By.xpath("(//android.widget.EditText)[1]");
    public By repeatPasswordField = By.xpath("(//android.widget.EditText)[2]");
    public By generatePasswordButton = By.xpath("//android.widget.Button[@content-desc=\"Generate a random password\"]");
    public By proceedButton = By.xpath("//android.widget.Button[@content-desc=\"Proceed\"]");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getSetPasswordTitle() {
        return waitForElementPresent(setPasswordTitle, "Cannot find Set Password title", 5, true);
    }

    public WebElement getPasswordInfoText() {
        return waitForElementPresent(passwordInfoText, "Cannot find password info text", 5, true);
    }

    public WebElement getNewPasswordField() {
        return waitForElementPresent(newPasswordField, "Cannot find New Password field", 5, true);
    }

    public WebElement getRepeatPasswordField() {
        return waitForElementPresent(repeatPasswordField, "Cannot find Repeat Password field", 5, true);
    }

    public WebElement getGeneratePasswordButton() {
        return waitForElementPresent(generatePasswordButton, "Cannot find Generate Password button", 5, true);
    }

    public WebElement getProceedButton() {
        return waitForElementPresent(proceedButton, "Cannot find Proceed button", 5, true);
    }
}

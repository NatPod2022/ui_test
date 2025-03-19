package test.pages;

import io.appium.java_client.AppiumDriver;

import test.interactions.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginStepByPhonePage extends BaseActions {

    public By phoneIndex = By.xpath("//android.widget.ImageView[contains(@content-desc, '+1')]");
    public By logInInputFieldPhone = By.xpath("//android.view.View[@content-desc='Log in to your account']/android.widget.EditText");
    public By loginWithPasswordPhoneButton = By.xpath("//android.widget.Button[@content-desc='Login with password']");


    public LoginStepByPhonePage(AppiumDriver driver) {
        super(driver);
    }


    public WebElement getphoneIndex() {
        return waitForElementPresent(phoneIndex, "Cannot find Phone Index", 5, true);
    }

    public WebElement getLoginWithPasswordPhoneButton() {
        return waitForElementPresent(loginWithPasswordPhoneButton, "Cannot find 'Login with password' button", 3, true);
    }

    public WebElement getlogInInputFieldPhone() {
        return waitForElementPresent(logInInputFieldPhone, "Cannot find input field for login by Phone number", 5, true);
    }


}

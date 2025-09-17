package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class RegistrationFirstStepPage extends BaseActions {

    public RegistrationFirstStepPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By createYourAccountText = By.xpath("//android.view.View[@content-desc='Create your account']");
    public By signUpWithGoogleButton = By.xpath("//android.widget.ImageView[@content-desc='Sign up with Google']");
    public By nameInputField = By.xpath("(//android.widget.EditText)[1]");
    public By emailInputField = By.xpath("(//android.widget.EditText)[2]");
    public By countryCodeImage = By.xpath("//android.widget.ImageView[contains(@content-desc, '+')]");
    public By phoneInputField = By.xpath("(//android.widget.EditText)[3]");
    public By createAccountButton = By.xpath("//android.widget.Button[@content-desc='Create account']");
    public By agreeToText = By.xpath("//android.view.View[@content-desc='I agree to the ']");
    public By privacyPolicyButton = By.xpath("//android.widget.Button[@content-desc='Privacy policy']");
    public By commaText = By.xpath("//android.view.View[@content-desc=', ']");
    public By termsAndConditionsButton = By.xpath("//android.widget.Button[@content-desc='Terms and Conditions']");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getCreateYourAccountText() {
        return waitForElementPresent(createYourAccountText, "Cannot find 'Create your account' text", 5, true);
    }

    public WebElement getSignUpWithGoogleButton() {
        return waitForElementPresent(signUpWithGoogleButton, "Cannot find 'Sign up with Google' button", 5, true);
    }

    public WebElement getNameInputField() {
        return waitForElementPresent(nameInputField, "Cannot find Name input field", 5, true);
    }

    public WebElement getEmailInputField() {
        return waitForElementPresent(emailInputField, "Cannot find Email input field", 5, true);
    }

    public WebElement getCountryCodeImage() {
        return waitForElementPresent(countryCodeImage, "Cannot find country code image", 5, true);
    }

    public WebElement getPhoneInputField() {
        return waitForElementPresent(phoneInputField, "Cannot find Phone input field", 5, true);
    }

    public WebElement getCreateAccountButton() {
        return waitForElementPresent(createAccountButton, "Cannot find 'Create account' button", 5, true);
    }

    public WebElement getAgreeToText() {
        return waitForElementPresent(agreeToText, "Cannot find 'I agree to the' text", 5, true);
    }

    public WebElement getPrivacyPolicyButton() {
        return waitForElementPresent(privacyPolicyButton, "Cannot find 'Privacy policy' button", 5, true);
    }

    public WebElement getCommaText() {
        return waitForElementPresent(commaText, "Cannot find ',' text", 5, true);
    }

    public WebElement getTermsAndConditionsButton() {
        return waitForElementPresent(termsAndConditionsButton, "Cannot find 'Terms and Conditions' button", 5, true);
    }
}

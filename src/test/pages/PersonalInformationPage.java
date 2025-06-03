package test.pages;

import io.appium.java_client.AppiumDriver;
import test.interactions.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonalInformationPage extends BaseActions {

    public PersonalInformationPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By personalInfoTitle = By.xpath("//android.view.View[@content-desc='Personal information']");
    public By phoneNumber = By.xpath("//android.view.View[@content-desc='Phone number: +79000000019']");
    public By email = By.xpath("//android.view.View[@content-desc='Email: np_test@mail.nv']");
    public By timeZone = By.xpath("//android.view.View[@content-desc='Time zone']");
    public By substituteTeachersImage = By.xpath("//android.widget.ImageView[@content-desc='Substitute teachers. We will find a substitute teacher in case your regular teacher cancels a lesson']");
    public By dontSubstituteTeachersImage = By.xpath("//android.widget.ImageView[@content-desc='Don’t substitute teachers']");
    public By deleteAccountButton = By.xpath("//android.widget.Button[@content-desc='Delete account']");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find 'Back' button", 5, true);
    }

    public WebElement getPersonalInfoTitle() {
        return waitForElementPresent(personalInfoTitle, "Cannot find 'Personal information' title", 5, true);
    }

    public WebElement getPhoneNumber() {
        return waitForElementPresent(phoneNumber, "Cannot find 'Phone number' field", 5, true);
    }

    public WebElement getEmail() {
        return waitForElementPresent(email, "Cannot find 'Email' field", 5, true);
    }

    public WebElement getTimeZone() {
        return waitForElementPresent(timeZone, "Cannot find 'Time zone' field", 5, true);
    }

    public WebElement getSubstituteTeachersImage() {
        return waitForElementPresent(substituteTeachersImage, "Cannot find 'Substitute teachers' image", 5, true);
    }

    public WebElement getDontSubstituteTeachersImage() {
        return waitForElementPresent(dontSubstituteTeachersImage, "Cannot find 'Don’t substitute teachers' image", 5, true);
    }

    public WebElement getDeleteAccountButton() {
        return waitForElementPresent(deleteAccountButton, "Cannot find 'Delete account' button", 5, true);
    }
}

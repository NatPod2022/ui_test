package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class NewStudentPage extends BaseActions {

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By newStudentTitle = By.xpath("//android.view.View[@content-desc='New student']");

    public By girlRadioButton = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.RadioButton[1]");
    public By girlLabel = By.xpath("//android.view.View[@content-desc='Girl']");

    public By boyRadioButton = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.RadioButton[2]");
    public By boyLabel = By.xpath("//android.view.View[@content-desc='Boy']");

    public By firstNameInput = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    public By lastNameInput = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");

    public By addNewChildButton = By.xpath("//android.widget.Button[@content-desc='Add a new child']");

    public NewStudentPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getNewStudentTitle() {
        return waitForElementPresent(newStudentTitle, "Cannot find 'New student' title", 5, true);
    }

    public WebElement getGirlRadioButton() {
        return waitForElementPresent(girlRadioButton, "Cannot find 'Girl' radio button", 5, true);
    }

    public WebElement getGirlLabel() {
        return waitForElementPresent(girlLabel, "Cannot find label 'Girl'", 5, true);
    }

    public WebElement getBoyRadioButton() {
        return waitForElementPresent(boyRadioButton, "Cannot find 'Boy' radio button", 5, true);
    }

    public WebElement getBoyLabel() {
        return waitForElementPresent(boyLabel, "Cannot find label 'Boy'", 5, true);
    }

    public WebElement getFirstNameInput() {
        return waitForElementPresent(firstNameInput, "Cannot find first name input", 5, true);
    }

    public WebElement getLastNameInput() {
        return waitForElementPresent(lastNameInput, "Cannot find last name input", 5, true);
    }

    public WebElement getAddNewChildButton() {
        return waitForElementPresent(addNewChildButton, "Cannot find 'Add a new child' button", 5, true);
    }
}

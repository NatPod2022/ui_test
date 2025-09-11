package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class FirstScreenPage extends BaseActions {

    // System permission dialog locators
    public By contentContainer = By.xpath("//android.widget.LinearLayout[@resource-id='com.android.permissioncontroller:id/content_container']");
    public By allow      = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
    public By denyButton       = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']");

    public FirstScreenPage(AppiumDriver driver) {
        super(driver);
    }


    public WebElement getContentContainer() {
        return waitForElementPresent(contentContainer, "Cannot find permission content container", 5, true);
    }

    public WebElement getAllow() {
        return waitForElementPresent(allow, "Cannot find 'Allow' button", 5, true);
    }

    public WebElement getDenyButton() {
        return waitForElementPresent(denyButton, "Cannot find 'Deny' button", 5, true);
    }
}

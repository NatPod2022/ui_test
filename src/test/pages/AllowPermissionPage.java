package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

import java.util.List;

public class AllowPermissionPage extends BaseActions {

    public By permissionMessage = By.xpath("//android.widget.TextView[@resource-id='com.android.permissioncontroller:id/permission_message']");
    public By allowButton = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
    public By denyButton = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']");

    public AllowPermissionPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getPermissionMessage() {
        return waitForElementPresent(permissionMessage, "Cannot find permission message", 5, true);
    }

    public WebElement getAllowButton() {
        return waitForElementPresent(allowButton, "Cannot find Allow button", 5, true);
    }

    public WebElement getDenyButton() {
        return waitForElementPresent(denyButton, "Cannot find Deny button", 5, true);
    }

    // ✅ Если есть кнопка, то кликаем
    public void clickAllowIfVisible() {
        List<WebElement> elements = driver.findElements(allowButton);
        if (!elements.isEmpty()) {
            elements.get(0).click();
        }
    }
}

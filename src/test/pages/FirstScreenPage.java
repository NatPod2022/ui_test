package test.pages;


import io.appium.java_client.AppiumDriver;
import test.interactions.BaseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstScreenPage extends BaseActions {

    public By skipButton = By.xpath("//android.widget.Button[@content-desc='Skip']");
    public By onlineLessonImage = By.xpath("//android.widget.ImageView[contains(@content-desc,'Online lessons')]");
    public By continueElement = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    public By buttonForward = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");

    public FirstScreenPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getSkipButton() {
        return waitForElementPresent(skipButton, "Cannot find Skip button", 5, true);
    }

    public WebElement getOnlineLessonImage() {
        return waitForElementPresent(onlineLessonImage, "Cannot find Image 'Online lesson' image", 5, true);
    }

    public WebElement getContinueElement() {
        return waitForElementPresent(continueElement, "Cannot find --- element", 5, true);
    }

    public WebElement getButtonForward() {
        return waitForElementPresent(buttonForward, "Cannot find -> button", 5, true);
    }
}

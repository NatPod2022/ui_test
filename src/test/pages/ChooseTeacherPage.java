package test.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.interactions.BaseActions;

public class ChooseTeacherPage extends BaseActions {

    public ChooseTeacherPage(AppiumDriver driver) {
        super(driver);
    }

    public By backButton = By.xpath("//android.widget.Button[@content-desc='Back']");
    public By chooseTeacherTitle = By.xpath("//android.view.View[@content-desc='Choose a teacher']");
    public By teacherPhoto1 = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]");
    public By teacherPhoto2 = By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]");
    public By availableTeachersLabel = By.xpath("//android.view.View[@content-desc='Available teachers']");
    public By readMoreButton = By.xpath("(//android.widget.Button[@content-desc='Read more'])[1]");
    public By bookLessonButton = By.xpath("(//android.widget.Button[@content-desc='Book lesson'])[1]");

    public WebElement getBackButton() {
        return waitForElementPresent(backButton, "Cannot find Back button", 5, true);
    }

    public WebElement getChooseTeacherTitle() {
        return waitForElementPresent(chooseTeacherTitle, "Cannot find Choose a teacher title", 5, true);
    }

    public WebElement getTeacherPhoto1() {
        return waitForElementPresent(teacherPhoto1, "Cannot find first teacher photo", 5, true);
    }

    public WebElement getTeacherPhoto2() {
        return waitForElementPresent(teacherPhoto2, "Cannot find second teacher photo", 5, true);
    }

    public WebElement getAvailableTeachersLabel() {
        return waitForElementPresent(availableTeachersLabel, "Cannot find 'Available teachers' label", 5, true);
    }

    public WebElement getReadMoreButton() {
        return waitForElementPresent(readMoreButton, "Cannot find 'Read more' button", 5, true);
    }

    public WebElement getBookLessonButton() {
        return waitForElementPresent(bookLessonButton, "Cannot find 'Book lesson' button", 5, true);
    }
}

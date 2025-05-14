package test.pages;

import io.appium.java_client.AppiumDriver;
import test.interactions.BaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenAchievementTabPage extends BaseActions {

    public By levelCard = By.xpath("//*[contains(@content-desc, 'Level')]");
    public By exercisesToDo = By.xpath("//android.view.View[@content-desc='Exercises to do: 0']");

    public OpenAchievementTabPage(AppiumDriver driver) {
        super(driver);
    }

    public WebElement getLevelCard() {
        return waitForElementPresent(levelCard, "Cannot find  Level card", 5, true);
    }

    public WebElement getExercisesToDo() {
        return waitForElementPresent(exercisesToDo, "Cannot find 'Exercises to do' element", 5, true);
    }
}

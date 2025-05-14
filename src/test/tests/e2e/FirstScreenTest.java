package test.tests.e2e;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

import test.pages.FirstScreenPage;
import test.test_setup.BasePages;

public class FirstScreenTest extends base.AppiumBaseTest {

    @Test
    // Test Case #1
    public void testFirstScreen() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // ✅ Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

        //Check FirstScreenPage elements
        pages.firstScreen.getSkipButton();
        pages.firstScreen.getOnlineLessonImage();
        pages.firstScreen.getContinueElement();
        pages.firstScreen.getButtonForward();


    }
}

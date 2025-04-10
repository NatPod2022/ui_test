package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.test_setup.BasePages;

public class FirstScreenTest extends base.AppiumBaseTest {

    @Test
    // Test Case #1
    public void testFirstScreen() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        //Check FirstScreenPage elements
        pages.firstScreen.getSkipButton();
        pages.firstScreen.getOnlineLessonImage();
        pages.firstScreen.getContinueElement();
        pages.firstScreen.getButtonForward();


    }
}

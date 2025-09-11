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

        //Check FirstScreenPage elements
        pages.firstScreen.getContentContainer();
        pages.firstScreen.getAllow();
        pages.firstScreen.getDenyButton();


    }
}

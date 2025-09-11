package test.tests.e2e;

import org.junit.Test;

import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;
import test.test_setup.BasePages;

public class PreLoginPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #2
    public void testPreLoginPage() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

        //*Steps:


        // Check PreLoginPage elements
        pages.testPreLogin.getWelcomeTitle();
        pages.testPreLogin.getSubtitleText();
        pages.testPreLogin.getTryForFreeButton();
        pages.testPreLogin.getLoginButton();
    }
}

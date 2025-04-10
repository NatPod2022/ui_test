package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;
import test.pages.LogInPageFirstStepPage;
import test.test_setup.BasePages;

public class LogInPageFirstStepTest extends base.AppiumBaseTest {

    @Test
    // Test Case #3
    public void testLogInPageFirstStep() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        //*Steps:
        // Click on Skip
        pages.firstScreen.getSkipButton().click();

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Check LogInPageFirstStepPage elements
        pages.testLogInPageFirstStep.getLogInTitle();
        pages.testLogInPageFirstStep.getLogInGoogleButton();
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton();
        pages.testLogInPageFirstStep.getHaveYouAccountTitle();
        pages.testLogInPageFirstStep.getRegisterButton();
    }
}

package test.tests.e2e;

import org.junit.Test;

import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;

public class PreLoginPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #2
    public void testPreLoginPage() {

        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);

        //*Steps:
        // Click on Skip
        firstScreen.getSkipButton().click();

        // Check PreLoginPage elements
        testPreLogin.getBackButton();
        testPreLogin.getTryForFreeButton();
        testPreLogin.getWidgetScheduleLessons();
        testPreLogin.getLoginButton();
    }
}

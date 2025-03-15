package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;
import test.pages.LogInPageFirstStepPage;

public class LogInPageFirstStepTest extends base.AppiumBaseTest {

    @Test
    // Test Case #3
    public void testLogInPageFirstStep() {

        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);

        //*Steps:
        // Click on Skip
        firstScreen.getSkipButton().click();

        // Click on LogIn
        testPreLogin.getLoginButton().click();

        // Check LogInPageFirstStepPage elements
        testLogInPageFirstStep.getLogInTitle();
        testLogInPageFirstStep.getLogInGoogleButton();
        testLogInPageFirstStep.getLogInEmailPhoneButton();
        testLogInPageFirstStep.getHaveYouAccountTitle();
        testLogInPageFirstStep.getRegisterButton();
    }
}

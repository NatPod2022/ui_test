package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.PreLoginPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;

public class LoginStepByEmailTest extends base.AppiumBaseTest {

    @Test
    // Test Case #4
    public void testLogInStepByEmail() throws InterruptedException {

        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        LoginStepByEmailPage testLogInStepByEmail = new LoginStepByEmailPage(driver);

        //* Steps:
        // Click on Skip
        firstScreen.getSkipButton().click();

        // Click on LogIn
        testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        testLogInPageFirstStep.getLogInEmailPhoneButton().click();


        // Check LoginStepByEmailPage elements:
        testLogInStepByEmail.getLogInTitleSecondStep();
        testLogInStepByEmail.getEmailTab();
        testLogInStepByEmail.getPhoneTab();
        testLogInStepByEmail.getLogInInputField();
        testLogInStepByEmail.getContinueButton();
        testLogInStepByEmail.getLoginWithPasswordButton();
        testLogInStepByEmail.getBackButtonSecond();


    }
}

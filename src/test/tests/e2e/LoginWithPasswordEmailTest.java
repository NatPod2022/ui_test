package test.tests.e2e;

import org.junit.Test;

import test.pages.FirstScreenPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;
import test.pages.LoginStepByPhonePage;
import test.pages.LoginWithPasswordEmailPage;
import base.AppiumBaseTest;
import test.pages.PreLoginPage;

public class LoginWithPasswordEmailTest extends AppiumBaseTest {

    @Test
    // Test Case #6
    public void testLoginWithPasswordEmail() {
        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        LoginStepByEmailPage testLogInStepByEmail = new LoginStepByEmailPage(driver);
        LoginWithPasswordEmailPage testLoginWithPasswordEmail = new LoginWithPasswordEmailPage(driver);

        //* Steps:
        // Click on Skip
        firstScreen.getSkipButton().click();

        // Click on LogIn
        testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        testLogInStepByEmail.getLoginWithPasswordButton().click();


        // Check:
        testLoginWithPasswordEmail.getPasswordInputField();
        testLoginWithPasswordEmail.getSignInButton();
        testLoginWithPasswordEmail.getLoginWithAccessCodeButton();
        testLoginWithPasswordEmail.getForgotPasswordButton();



    }
}

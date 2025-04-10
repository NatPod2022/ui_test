package test.tests.e2e;

import org.junit.Test;

import test.pages.FirstScreenPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;
import test.pages.LoginStepByPhonePage;
import test.pages.LoginWithPasswordEmailPage;
import base.AppiumBaseTest;
import test.pages.PreLoginPage;
import test.test_setup.BasePages;

public class LoginWithPasswordEmailTest extends AppiumBaseTest {

    @Test
    // Test Case #6
    public void testLoginWithPasswordEmail() {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        //* Steps:
        // Click on Skip
        pages.firstScreen.getSkipButton().click();

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByEmail.getLoginWithPasswordButton().click();


        // Check:
        pages.testLoginWithPasswordEmail.getPasswordInputField();
        pages.testLoginWithPasswordEmail.getSignInButton();
        pages.testLoginWithPasswordEmail.getLoginWithAccessCodeButton();
        pages.testLoginWithPasswordEmail.getForgotPasswordButton();



    }
}

package test.tests.e2e;

import org.junit.Test;

import test.pages.FirstScreenPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;
import test.pages.LoginStepByPhonePage;
import test.pages.LoginWithPasswordEmailPage;
import base.AppiumBaseTest;
import test.pages.LoginWithPasswordPhonePage;
import test.pages.PreLoginPage;

public class LoginWithPasswordPhoneTest extends AppiumBaseTest {

    @Test
    // Test Case #7
    public void testLoginWithPasswordPhone() {
        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        LoginStepByEmailPage testLogInStepByEmail = new LoginStepByEmailPage(driver);
        LoginStepByPhonePage testLogInStepByPhone = new LoginStepByPhonePage(driver);

        LoginWithPasswordEmailPage testLoginWithPasswordEmail = new LoginWithPasswordEmailPage(driver);
        LoginWithPasswordPhonePage testLoginWithPasswordPhone = new LoginWithPasswordPhonePage(driver);

        //* Steps:
        // Click on Skip
        firstScreen.getSkipButton().click();

        // Click on LogIn
        testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on phoneTab
        testLogInStepByEmail.getPhoneTab().click();

        // Click on LoginWithPasswordButton
       testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();


        // Check:
        testLoginWithPasswordPhone.getPasswordPhoneInputField();
        testLoginWithPasswordPhone.getSignInPhoneButton();
        testLoginWithPasswordPhone.getLoginWithAccessPhoneCodeButton();
        testLoginWithPasswordPhone.getForgotPasswordPhoneButton();



    }
}

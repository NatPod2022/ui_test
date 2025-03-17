package test.tests.e2e;

import org.junit.Test;
import test.pages.FirstScreenPage;
import test.pages.LoginStepByPhonePage;
import test.pages.PreLoginPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;

public class LoginStepByPhoneTest extends base.AppiumBaseTest {

    @Test
    // Test Case #5
    public void testLogInStepByPhone() throws InterruptedException {

        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        LoginStepByEmailPage testLogInStepByEmail = new LoginStepByEmailPage(driver);
        LoginStepByPhonePage testLogInStepByPhone = new LoginStepByPhonePage(driver);

        //* Steps:
        // Click on SkipButton
        firstScreen.getSkipButton().click();

        // Click on LoginButton
        testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on phoneTab
        testLogInStepByEmail.getPhoneTab().click();


        // Check LoginStepByEmailPage elements:
        testLogInStepByPhone.getphoneIndex();
        testLogInStepByPhone.getlogInInputFieldPhone();


    }
}

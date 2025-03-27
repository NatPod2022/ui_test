package test.tests.e2e;

import base.AppiumBaseTest;
import org.junit.Test;
import test.pages.*;

public class PreTrialDashboardAfterCancelTrialTest extends AppiumBaseTest {

    @Test
    // Test Case #8
    public void testPreTrialDashboardAfterCancelTrialFlow() {
        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        LoginStepByEmailPage testLogInStepByEmail = new LoginStepByEmailPage(driver);
        LoginStepByPhonePage testLogInStepByPhone = new LoginStepByPhonePage(driver);
        LoginWithPasswordPhonePage testLoginWithPasswordPhone = new LoginWithPasswordPhonePage(driver);
        PreTrialDashboardAfterCancelTrialPage dashboardPage = new PreTrialDashboardAfterCancelTrialPage(driver);
        LoginWithPasswordEmailPage testLoginWithPasswordEmail =  new LoginWithPasswordEmailPage(driver);

        // Steps:
        // Click on Skip
        firstScreen.getSkipButton().click();

        // Click on LogIn
        testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert Email and Password
        testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");
        testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Check:
        dashboardPage.getLogoParent();
        dashboardPage.getLabelNovakid();
        dashboardPage.getTitle();
        dashboardPage.getBookButton();
        dashboardPage.getDashboardTab();
        dashboardPage.getTextWeAreSorry();
        dashboardPage.getStudentBlock();
        dashboardPage.getSupportTab();
        dashboardPage.getAchievementTab();
        dashboardPage.getKaTab();
        dashboardPage.getScheduleTab();
        dashboardPage.getTitleHomework();

    }
}

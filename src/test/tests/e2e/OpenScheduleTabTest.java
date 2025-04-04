package test.tests.e2e;

import org.junit.Test;

import base.AppiumBaseTest;
import test.pages.FirstScreenPage;
import test.pages.LogInPageFirstStepPage;
import test.pages.LoginStepByEmailPage;
import test.pages.LoginStepByPhonePage;
import test.pages.LoginWithPasswordEmailPage;
import test.pages.LoginWithPasswordPhonePage;
import test.pages.OpenScheduleTabPage;
import test.pages.PreLoginPage;
import test.pages.PreTrialDashboardAfterCancelTrialPage;

public class OpenScheduleTabTest extends AppiumBaseTest {

    @Test
    // Test Case #9
    public void testOpenScheduleTabElements() {
        FirstScreenPage firstScreen = new FirstScreenPage(driver);
        PreLoginPage testPreLogin = new PreLoginPage(driver);
        LogInPageFirstStepPage testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        LoginStepByEmailPage testLogInStepByEmail = new LoginStepByEmailPage(driver);
        LoginStepByPhonePage testLogInStepByPhone = new LoginStepByPhonePage(driver);
        LoginWithPasswordPhonePage testLoginWithPasswordPhone = new LoginWithPasswordPhonePage(driver);
        LoginWithPasswordEmailPage testLoginWithPasswordEmail = new LoginWithPasswordEmailPage(driver);
        PreTrialDashboardAfterCancelTrialPage dashboardPage = new PreTrialDashboardAfterCancelTrialPage(driver);
        OpenScheduleTabPage schedulePage = new OpenScheduleTabPage(driver);

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

        // Click on Schedule tab
        dashboardPage.getScheduleTab().click();

        // Checks:
        schedulePage.getTittleSchedule();
        schedulePage.getPremiumLesson();
        schedulePage.getStandardLesson();
        schedulePage.getUpcomingTab();
        schedulePage.getCompletedTab();
        schedulePage.getTimeZoneText();
        schedulePage.getNoLessonsMessage();
        schedulePage.getBookLessonsButton();
        schedulePage.getPremiumLessonCount();
        schedulePage.getStandardLessonCount();


    }
}

package test.tests.e2e;

import org.junit.Test;
import base.AppiumBaseTest;
import test.test_setup.BasePages;

public class OpenScheduleTabTest extends AppiumBaseTest {

    @Test
    // Test Case #9
        public void testOpenScheduleTabElements() {
            // Инициализация всех Page Object'ов через BasePages
            BasePages pages = new BasePages();
            pages.initPages(driver);

        // Steps:
        // Click on Skip
        pages.firstScreen.getSkipButton().click();

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert Email and Password
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Click on Schedule tab
        pages.dashboardPage.getScheduleTab().click();

        // Checks:
        pages.schedulePage.getTittleSchedule();
        pages.schedulePage.getPremiumLesson();
        pages.schedulePage.getStandardLesson();
        pages.schedulePage.getUpcomingTab();
        pages.schedulePage.getCompletedTab();
        pages.schedulePage.getTimeZoneText();
        pages.schedulePage.getNoLessonsMessage();
        pages.schedulePage.getBookLessonsButton();
        pages.schedulePage.getPremiumLessonCount();
        pages.schedulePage.getStandardLessonCount();


    }
}

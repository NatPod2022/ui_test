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

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

        // Steps:

        // Click on LogIn
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert Email and Password
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Click on Schedule tab
        pages.testDashboardPage.getScheduleTab().click();

        // Checks:
        pages.testSchedulePage.getTittleSchedule();
        pages.testSchedulePage.getPremiumLesson();
        pages.testSchedulePage.getStandardLesson();
        pages.testSchedulePage.getUpcomingTab();
        pages.testSchedulePage.getCompletedTab();
        pages.testSchedulePage.getTimeZoneText();
        pages.testSchedulePage.getNoLessonsMessage();
        pages.testSchedulePage.getBookLessonsButton();
        pages.testSchedulePage.getPremiumLessonCount();
        pages.testSchedulePage.getStandardLessonCount();


    }
}

package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class ChooseTeacherPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #28 — check visibility of elements on Choose Teacher screen
    public void testChooseTeacherPageElements() throws InterruptedException {
        // Initialize all Page Objects via BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Click "Allow" if permission prompt is shown
        pages.allowPermission.clickAllowIfVisible();

        // Steps:


        // Click "Login"
        pages.testPreLogin.getLoginButton().click();

        // Click "Log In with Email/Phone"
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click "Login with Password"
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Enter email and password
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click "Sign In"
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Click on Schedule tab
        pages.testDashboardPage.getScheduleTab().click();

        // Click on Book button
        pages.testSchedulePage.getBookLessonsButton().click();;

        // Check all elements on Choose Teacher screen
        pages.testChooseTeacherPage.getBackButton();
        pages.testChooseTeacherPage.getChooseTeacherTitle();
        pages.testChooseTeacherPage.getAvailableTeachersLabel();
        pages.testChooseTeacherPage.getReadMoreButton();
        pages.testChooseTeacherPage.getBookLessonButton();
    }
}

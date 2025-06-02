package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class SpeakingPracticePageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #19 — check visibility of elements on Speaking Practice screen
    public void testSpeakingPracticePageElements() throws InterruptedException {
        // Initialize all Page Objects via BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Click on "Allow" button if visible
        pages.allowPermission.clickAllowIfVisible();

        // Steps:
        // Click on Skip
        pages.firstScreen.getSkipButton().click();

        // Click on Login
        pages.testPreLogin.getLoginButton().click();

        // Click on LogInEmailPhoneButton
        pages.testLogInPageFirstStep.getLogInEmailPhoneButton().click();

        // Click on LoginWithPasswordButton
        pages.testLogInStepByPhone.getLoginWithPasswordPhoneButton().click();

        // Insert email and password
        pages.testLogInStepByEmail.getLogInInputField().click();
        pages.testLogInStepByEmail.getLogInInputField().sendKeys("np_test@mail.nv");

        pages.testLoginWithPasswordEmail.getPasswordInputField().click();
        pages.testLoginWithPasswordEmail.getPasswordInputField().sendKeys("12345678");

        // Click on Sign in
        pages.testLoginWithPasswordPhone.getSignInPhoneButton().click();

        // Открываем правое меню
        pages.testDashboardPage.getLogoParent().click();

        // Click на Speaking Practice
        pages.testRightMenuListPage.getSpeakingPracticeIcon().click();

        //* Check
        pages.testSpeakingPracticePage.getTitleText();
        pages.testSpeakingPracticePage.getSubtitleText();
        pages.testSpeakingPracticePage.getAgeGroup4to6();
        pages.testSpeakingPracticePage.getAgeGroup7to9();
        pages.testSpeakingPracticePage.getAgeGroup10to13();
        pages.testSpeakingPracticePage.getJoinNowButton();
        pages.testSpeakingPracticePage.getVideoPreviewImage();
        pages.testSpeakingPracticePage.getGlobeImage();
    }
}

package test.tests.e2e;

import org.junit.Test;
import test.test_setup.BasePages;

public class OldBonusPageTest extends base.AppiumBaseTest {

    @Test
    // Test Case #17
    public void testOldBonusPageElements() throws InterruptedException {
        // Инициализация всех Page Object'ов через BasePages
        BasePages pages = new BasePages();
        pages.initPages(driver);

        // Клик по кнопке "Allow", если она есть
        pages.allowPermission.clickAllowIfVisible();

        // Steps:


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

        // Click на Bonuses
        pages.testRightMenuListPage.getBonusesIcon().click();

        //* Проверка отображения элементов
        pages.testOldBonusPage.getBackButton();
        pages.testOldBonusPage.getTitleInvite();
        pages.testOldBonusPage.getStep1();
        pages.testOldBonusPage.getShareText();
        pages.testOldBonusPage.getInviteLinkText();
        pages.testOldBonusPage.getReferralInput();
        pages.testOldBonusPage.getShareButton1();
        pages.testOldBonusPage.getShareButton2();
        pages.testOldBonusPage.getStep2();
        pages.testOldBonusPage.getFriendBonusText();
        pages.testOldBonusPage.getStep3();
        pages.testOldBonusPage.getYourBonusText();
        pages.testOldBonusPage.getInviteTitle();
        pages.testOldBonusPage.getSaveBonusPart1();
        pages.testOldBonusPage.getSaveBonusPart2();
        pages.testOldBonusPage.getSaveBonusPart3();
        pages.testOldBonusPage.getConvertBonusText();
        pages.testOldBonusPage.getNoTransactionsText();
    }
}

package test.test_setup;

import io.appium.java_client.AppiumDriver;
import test.pages.*;

public class BasePages {

    public AllowPermissionPage allowPermission;
    public FirstScreenPage firstScreen;
    public PreLoginPage testPreLogin;
    public LogInPageFirstStepPage testLogInPageFirstStep;
    public LoginStepByEmailPage testLogInStepByEmail;
    public LoginStepByPhonePage testLogInStepByPhone;
    public LoginWithPasswordPhonePage testLoginWithPasswordPhone;
    public LoginWithPasswordEmailPage testLoginWithPasswordEmail;
    public PreTrialDashboardAfterCancelTrialPage testDashboardPage;
    public OpenScheduleTabPage testSchedulePage;
    public OpenAchievementTabPage testOpenAchievementTabPage;
    public OpenProgramPage testOpenProgramPage;
    public OpenIntercomPage testOpenIntercomPage;

    public void initPages(AppiumDriver driver) {

        allowPermission = new AllowPermissionPage(driver);
        firstScreen = new FirstScreenPage(driver);
        testPreLogin = new PreLoginPage(driver);
        testLogInPageFirstStep = new LogInPageFirstStepPage(driver);
        testLogInStepByEmail = new LoginStepByEmailPage(driver);
        testLogInStepByPhone = new LoginStepByPhonePage(driver);
        testLoginWithPasswordPhone = new LoginWithPasswordPhonePage(driver);
        testLoginWithPasswordEmail = new LoginWithPasswordEmailPage(driver);
        testDashboardPage = new PreTrialDashboardAfterCancelTrialPage(driver);
        testSchedulePage = new OpenScheduleTabPage(driver);
        testOpenAchievementTabPage = new OpenAchievementTabPage(driver);
        testOpenProgramPage = new OpenProgramPage(driver);
        testOpenIntercomPage = new OpenIntercomPage(driver);
    }
}

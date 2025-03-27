package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class AppiumBaseTest {
    protected AppiumDriver driver;

    @Before
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "and82");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.novakid.student");
        capabilities.setCapability("appActivity", "com.novakid.student.MainActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", "C:/Users/Natalia/OneDrive/Рабочий стол/JavaAppiumAutomation/JavaAppiumAutomation/apks/app-prod.apk");
        capabilities.setCapability("newCommandTimeout", 300);
        capabilities.setCapability("adbExecTimeout", 60000);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

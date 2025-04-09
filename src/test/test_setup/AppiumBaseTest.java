package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import test.configuration.CapabilitiesProvider;

public class AppiumBaseTest {
    protected AppiumDriver driver;

    @Before
    public void setup() throws Exception {
        DesiredCapabilities capabilities = CapabilitiesProvider.getCapabilities();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

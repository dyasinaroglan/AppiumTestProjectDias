package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppUtils {

    public static AndroidDriver driver;

    @Before
    public void openMobileApp() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("deviceName", "Yasin-Emulator");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "14");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("appPackage", "com.akakce.akakce");
            capabilities.setCapability("appActivity", "com.akakce.akakce.ui.splash.SplashActivity");

            try {
                URL url = new URL("http://0.0.0.0:4723");
                driver = new AndroidDriver(url,capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
    public static AndroidDriver getDriver() {
        return driver;
    }
    public static void setDriver(AndroidDriver newDriver){
        driver = newDriver;
    }
}

package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.appium.java_client.AppiumBy;



import java.time.Duration;

public class Methods {
    protected WebDriverWait wait;

    protected AndroidDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(Methods.class);
    public Methods(AppiumDriver driver){
        this.driver = AppUtils.getDriver();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        logger.info("Elemente tıklandı. " + locator.toString());
    }
    public void sendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
        logger.info("Text değeri yazıldı. " + text);
    }
    public void waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        logger.info("Element görünür olana kadar beklenildi. " + locator);

    }
    public void keysEnter(){
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public void scrollTo(String visibleText){
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0));"
                )
        );
    }
    public void assertElementDisabled(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        boolean isVisible = driver.findElement(locator).isDisplayed();
        Assertions.assertTrue(isVisible, "Element is NOT visible on the screen!");
    }
}

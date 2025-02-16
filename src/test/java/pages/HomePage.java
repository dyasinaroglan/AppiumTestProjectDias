package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import utils.Methods;

public class HomePage extends Methods {

    public HomePage(AppiumDriver driver){
        super(driver);
    }

    private By uyeOlmadanDevamEtButton = By.xpath("//android.widget.TextView[@resource-id=\"com.akakce.akakce:id/continueWithoutRegister\"]");
    private By searchboxInputProductSearch = By.id("com.akakce.akakce:id/searchTextView");
    private By neyiUcuzaAlmakIstiyorsunText = By.xpath("(//android.widget.EditText[@resource-id=\"com.akakce.akakce:id/searchTextView\"])[2]");


    public void uyeOlmadanDevamEt(){
        clickTo(uyeOlmadanDevamEtButton);
    }
    public void productSearchboxInputClick(){
        waitForElementVisible(searchboxInputProductSearch);
        clickTo(searchboxInputProductSearch);
    }
    public void searchboxText(String text){
        waitForElementVisible(neyiUcuzaAlmakIstiyorsunText);
        sendKeys(neyiUcuzaAlmakIstiyorsunText, text);
        keysEnter();
    }
}

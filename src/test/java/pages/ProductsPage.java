package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Methods;

public class ProductsPage extends Methods {

    public ProductsPage(AppiumDriver driver) {
        super(driver);
    }
    private By product10 = By.cssSelector("android.widget.FrameLayout");
    private By uruneGitButton = By.id("com.akakce.akakce:id/detailBtnLayout");
    private By saticiyaGitButton = By.xpath("//android.widget.TextView[@text=\"Satıcıya Git\"]");

    public void product10Click(String text) {
        scrollTo(text);
        clickTo(product10);
    }
    public void uruneGitButtonClick(){
        clickTo(uruneGitButton);
    }
    public void assertElementVisible(){
        assertElementDisabled(saticiyaGitButton);
    }
}

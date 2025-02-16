package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Methods;

public class FilterPage extends Methods {

    public FilterPage(AppiumDriver driver) {
        super(driver);
    }
    private By filtreleButton = By.id("com.akakce.akakce:id/filterArea");
    private By bilgisayarDonanimSelect = By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.akakce.akakce:id/cloudBox\"])[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]");
    private By urunleriGorButton = By.id("com.akakce.akakce:id/applyFilterBtn");
    private By siralaPopularlik = By.id("com.akakce.akakce:id/sortArea");
    private By enYuksekFiyatRadioButton = By.cssSelector("android.widget.RelativeLayout");
    public void filtreleButonClick(){
        clickTo(filtreleButton);
        waitForElementVisible(bilgisayarDonanimSelect);
        clickTo(bilgisayarDonanimSelect);
    }
    public void urunleriGor(){
        clickTo(urunleriGorButton);
    }
    public void siralaPopulerlikButton(){
        clickTo(siralaPopularlik);
    }
    public void enYuksekFiyatRadioBottonClick(){
        clickTo(enYuksekFiyatRadioButton);
    }
}

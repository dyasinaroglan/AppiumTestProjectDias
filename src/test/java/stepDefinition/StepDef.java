package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilterPage;
import pages.HomePage;
import pages.ProductsPage;
import utils.AppUtils;

public class StepDef {

    HomePage homePage = new HomePage(AppUtils.getDriver());
    FilterPage filterPage = new FilterPage(AppUtils.getDriver());
    ProductsPage productsPage = new ProductsPage(AppUtils.getDriver());

    @Given("Click on the continue without becoming a member button.")
    public void clickOnTheContinueWithoutBecomingAMemberButton() {
        homePage.uyeOlmadanDevamEt();
    }

    @When("Laptop is written in the Search Box input field. {string}")
    public void laptopIsWrittenInTheSearchBoxInputField(String text) {
        homePage.productSearchboxInputClick();
        homePage.searchboxText(text);
    }

    @And("Click on the Filter button and select Computer, Hardware")
    public void clickOnTheFilterButtonAndSelectComputerHardware() {
        filterPage.filtreleButonClick();
    }

    @And("Click on the See Products button")
    public void clickOnTheSeeProductsButton() {
        filterPage.urunleriGor();
    }

    @And("The highest price option is selected from the sorting options.")
    public void theHighestPriceOptionIsSelectedFromTheSortingOptions() {
        filterPage.siralaPopulerlikButton();
        filterPage.enYuksekFiyatRadioBottonClick();
    }

    @And("Click on the tenth product from the listed products. {string}")
    public void clickOnTheThProductFromTheListedProducts(String text) {
        productsPage.product10Click(text);
    }

    @And("Click on the Go to Product button.")
    public void clickOnTheGoToProductButton() {
        productsPage.uruneGitButtonClick();
    }

    @Then("Verify that the Go to Seller button is displayed on the product details screen.")
    public void verifyThatTheGoToSellerButtonIsDisplayedOnTheProductDetailsScreen() {
        productsPage.assertElementVisible();
    }
}

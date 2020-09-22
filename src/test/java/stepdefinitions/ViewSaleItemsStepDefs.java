package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class ViewSaleItemsStepDefs {

    ViewWomenSale objectViewWomenSale = new ViewWomenSale();

    @Given("user is on the magento website")
    public void user_is_on_the_magento_website() {
        objectViewWomenSale.setupBeforeTest();
    }

    @When("user wants to view women sale items")
    public void user_wants_to_view_women_sale_items() throws InterruptedException {
        objectViewWomenSale.viewWomenSale();
    }

    @Then("women sale items must be displayed")
    public void women_sale_items_must_be_displayed() throws InterruptedException {
        objectViewWomenSale.displayWomenSaleItems();

    }

}

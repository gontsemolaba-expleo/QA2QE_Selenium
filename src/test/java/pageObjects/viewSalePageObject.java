package pageObjects;

import org.openqa.selenium.WebElement;

public class viewSalePageObject {

    private WebElement SaleLink;
    private WebElement ButtonDeals;


    public void ClickSale() {
        SaleLink.click();

    }
    public void ClickDeals(){
        ButtonDeals.click();
    }
}
package stepdefinitions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ViewWomenSale {

    private WebDriver driver;

    private static By SaleLink = By.xpath("/html/body/div[1]/div/div/div[2]/nav/ul/li[6]/a/span");
    private static By ButtonDeals = By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[1]/div/a/span/span[2]");

    @Before
    public void setupBeforeTest() {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\7031\\Desktop\\IntelliJ\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://magento.abox.co.za/");
    }

    @After
    public void tearDownAfterTest(){

        //driver.close();
}
@Test
    public void viewWomenSale ()throws InterruptedException {
    WebElement body = driver.findElement(By.tagName("body"));
    String bodyText = body.getText();

    // Assert.assertTrue("Does not contain the text 'Whats'New'",bodyText.contains("Whats'New"));
    Assert.assertTrue("Does not contain the text 'Women'", bodyText.contains("Women"));
    Assert.assertTrue("Does not contain the text 'Men'", bodyText.contains("men"));
    Assert.assertTrue("Does not contain the text 'Gear'", bodyText.contains("Gear"));
    Assert.assertTrue("Does not contain the text 'Training'", bodyText.contains("Training"));
    Assert.assertTrue("Does not contain the text 'Sale'", bodyText.contains("Sale"));

    driver.findElement(SaleLink).click();
}
public void displayWomenSaleItems ()throws InterruptedException{

driver.findElement(ButtonDeals).click();
}
}

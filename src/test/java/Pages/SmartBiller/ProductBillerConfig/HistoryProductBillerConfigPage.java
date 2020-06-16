package Pages.SmartBiller.ProductBillerConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HistoryProductBillerConfigPage extends PageObject {

    @FindBy(id="qe_smartbiller")
    WebElement SMARTBILLER_MENU;

    @FindBy(id = "qe_product-biller-config")
    WebElement PRODUCT_BILLER_CONFIG_SUB_MENU;

    @FindBy(id = "qe_product-biller-config_breadcrumb")
    WebElement PRODUCT_BILLER_CONFIG_BREADCRUMB;

    @FindBy(id = "qe_product-biller-config_history___BV_tab_button__")
    WebElement HISTORY_TAB;

    @FindBy(id = "qe_product-biller-config_product-id_filter")
    WebElement PRODUCT_ID_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_product-biller-config_biller_filter\"]/div/input")
    WebElement BILLER_FILTER;

    @FindBy(id = "qe_product-biller-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_product-biller-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_product-biller-config_product-id-')])[last()]")
    WebElement LAST_PRODUCT_ID_ON_HISTORY_TAB;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_product-biller-config_biller-')])[last()]")
    WebElement LAST_BILLER_NAME_ON_HISTORY_TAB;

    @FindBy(xpath = "//*[@id=\"qe_product-biller-config_history\"]/div/div/div[2]")
    WebElement TABLE_HISTORY;

    public void OnSmartBillerMenu()throws InterruptedException{
        SMARTBILLER_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(PRODUCT_BILLER_CONFIG_SUB_MENU.isDisplayed());
    }

    public void OnProductBillerConfigSubMenu()throws InterruptedException{
        PRODUCT_BILLER_CONFIG_SUB_MENU.click();
        Thread.sleep(4000);
        Assert.assertTrue(PRODUCT_BILLER_CONFIG_BREADCRUMB.isDisplayed());
        Assert.assertTrue(HISTORY_TAB.isDisplayed());
    }

    public void OnHistoryTab()throws InterruptedException{
        HISTORY_TAB.click();
        Thread.sleep(4000);
        Assert.assertTrue(PRODUCT_BILLER_CONFIG_SUB_MENU.isDisplayed());
        Assert.assertTrue(PRODUCT_ID_FILTER.isDisplayed());
        Assert.assertTrue(BILLER_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(LAST_PRODUCT_ID_ON_HISTORY_TAB.isDisplayed());
    }

    public void FillTheSearchBoxWithBillerIDOrBillerName(String biller){
        BILLER_FILTER.click();
        BILLER_FILTER.sendKeys(biller+ Keys.ENTER);
    }

    public void ClickSearchButton(){
        SEARCH_BUTTON.click();
    }

    public void GetProductBillerInAccordanceWithTheSearchBox(String biller){
        Assert.assertTrue(LAST_BILLER_NAME_ON_HISTORY_TAB.isDisplayed());
        Assert.assertEquals(biller,LAST_BILLER_NAME_ON_HISTORY_TAB.getText());
    }

    public void FillProductID(String product_id){
        PRODUCT_ID_FILTER.sendKeys(product_id);
    }

    public void GetProductBillerInAccordanceWithTheProductIDAndBillerName(String product_id,String biller){
        Assert.assertTrue(LAST_BILLER_NAME_ON_HISTORY_TAB.isDisplayed());
        Assert.assertEquals(product_id,LAST_PRODUCT_ID_ON_HISTORY_TAB.getText());
        Assert.assertEquals(biller,LAST_BILLER_NAME_ON_HISTORY_TAB.getText());
    }

    public void DoesntGetAnyProductBiller(String product_id, String biller){
        Assert.assertEquals(false,TABLE_HISTORY.getText().contains(product_id));
        Assert.assertEquals(false,TABLE_HISTORY.getText().contains(biller));
    }
}
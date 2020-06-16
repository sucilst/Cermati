package Pages.SmartBiller.ProductPartnerConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HistoryProductPartnerConfigPage extends PageObject {
    @FindBy(id="qe_smartbiller")
    WebElement SMARTBILLER_MENU;

    @FindBy(id = "qe_product-partner-config")
    WebElement PRODUCT_PARTNER_CONFIG_SUB_MENU;

    @FindBy(id = "qe_product-partner-config_breadcrumb")
    WebElement PRODUCT_PARTNER_CONFIG_BREADCRUMB;

    @FindBy(id = "qe_product-partner-config_history___BV_tab_button__")
    WebElement HISTORY_TAB;

    @FindBy(id = "qe_product-partner-config_product-id_filter")
    WebElement PRODUCT_ID_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_product-partner-config_partner_filter\"]/div/input")
    WebElement PARTNER_FILTER;

    @FindBy(id = "qe_product-partner-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_product-partner-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_product-partner-config_product-id-')])[last()]")
    WebElement LAST_PRODUCT_ID_ON_HISTORY_TAB;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_product-partner-config_partner-name-')])[last()]")
    WebElement LAST_PARTNER_NAME_ON_HISTORY_TAB;

    @FindBy(xpath = "//a[@aria-label='Goto next page']")
    WebElement NEXT_PAGE;

    @FindBy(xpath = "//a[@aria-label='Goto last page']")
    WebElement LAST_PAGE;

    @FindBy(xpath = "//a[@aria-label='Goto previous page']")
    WebElement PREVIOUS_PAGE;

    @FindBy(xpath = "//a[@aria-label='Goto first page']")
    WebElement FIRST_PAGE;

    @FindBy(xpath = "//*[@id=\"qe_product-partner-config_history\"]/div/div/div[2]")
    WebElement TABLE_HISTORY;

    @FindBy(id = "qe_product-partner-updated_at-1")
    WebElement UPDATED_AT;

    public void OnSmartBillerMenu()throws InterruptedException{
        SMARTBILLER_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(PRODUCT_PARTNER_CONFIG_SUB_MENU.isDisplayed());
    }

    public void OnProductPartnerConfigSubMenu()throws InterruptedException {
        PRODUCT_PARTNER_CONFIG_SUB_MENU.click();
        Thread.sleep(4000);
        Assert.assertTrue(PRODUCT_PARTNER_CONFIG_BREADCRUMB.isDisplayed());
        Assert.assertTrue(HISTORY_TAB.isDisplayed());
    }

    public void OnHistoryTab()throws InterruptedException{
        HISTORY_TAB.click();
        Thread.sleep(4000);
        Assert.assertTrue(PRODUCT_PARTNER_CONFIG_SUB_MENU.isDisplayed());
        Assert.assertTrue(PRODUCT_ID_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(LAST_PRODUCT_ID_ON_HISTORY_TAB.isDisplayed());
    }

    public void FillTheSearchBoxWithProductID(String product_id){
        PRODUCT_ID_FILTER.sendKeys(product_id);
    }

    public void ClickNextPage(){
        NEXT_PAGE.click();
    }

    public void ClickLastPage(){
        LAST_PAGE.click();
    }

    public void ClickPreviousPage(){
        PREVIOUS_PAGE.click();
    }

    public void ClickFirstPage(){
        FIRST_PAGE.click();
    }

    public void GetsNormalListWithMixProductID(String product_id){
        System.out.println(product_id);
        Assert.assertNotEquals(product_id,LAST_PRODUCT_ID_ON_HISTORY_TAB.getText());
    }

    public void FillPartnerIDOrPartnerNameSearchBox(String partner){
        PARTNER_FILTER.click();
        PARTNER_FILTER.sendKeys(partner+ Keys.ENTER);
    }

    public void ClickSearchButton(){
        SEARCH_BUTTON.click();
    }

    public void GetProductInAccordanceWithThePartnerIDOrPartnerNameSearchBox(String partner){
        Assert.assertEquals(partner,LAST_PARTNER_NAME_ON_HISTORY_TAB.getText());
    }

    public void GetProductInAccordanceWithTheProductID(String product_id){
        Assert.assertEquals(product_id,LAST_PRODUCT_ID_ON_HISTORY_TAB.getText());
    }

    public void DoesntGetAnyProductPartner(String product_id,String partner){
        Assert.assertEquals(false,TABLE_HISTORY.getText().contains(product_id));
        Assert.assertEquals(false,TABLE_HISTORY.getText().contains(partner));
    }

    public void SeeTheIDOfParamUpdatedAt(){
        Assert.assertTrue(UPDATED_AT.isDisplayed());
    }

    public void GetCorrectID(){
        Assert.assertEquals("qe_product-partner-updated_at-1",UPDATED_AT.getAttribute("id"));
    }
}
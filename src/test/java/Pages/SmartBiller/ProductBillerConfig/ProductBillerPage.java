package Pages.SmartBiller.ProductBillerConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ProductBillerPage extends PageObject {
    @FindBy(id = "qe_smartbiller")
    WebElement SMARTBILLER_MENU;

    @FindBy(id = "qe_product-biller-config")
    WebElement PRODUCT_BILLER_CONFIG_SUB_MENU;

    @FindBy(id = "qe_product-biller-config_breadcrumb")
    WebElement PRODUCT_BILLER_CONFIG_BREADCRUMB;

    @FindBy(id = "qe_product-biller-config_product-biller___BV_tab_button__")
    WebElement PRODUCT_BILLER_TAB;

    @FindBy(id = "qe_product-biller-config_archived-product___BV_tab_button__")
    WebElement ARCHIVED_PRODUCT_BILLER_TAB;

    @FindBy(id = "qe_product-biller-config_history___BV_tab_button__")
    WebElement HISTORY_PRODUCT_BILLER_TAB;

    @FindBy(xpath = "//*[@id=\"qe_product-biller-config_product-biller_biller_filter\"]/div/input")
    WebElement BILLER_FILTER;

    @FindBy(id = "qe_product-biller-config_product-biller_product-id_filter")
    WebElement PRODUCT_ID_FILTER;

    @FindBy(id = "qe_product-biller-config_product-biller_product-name_filter")
    WebElement PRODUCT_NAME_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_product-biller-config_product-biller_status_filter\"]/div/input")
    WebElement STATUS_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_product-biller-config_product-biller_category_filter\"]/div/input")
    WebElement CATEGORY_FILTER;

    @FindBy(id = "qe_product-biller-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_product-biller-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(id = "qe_product-biller-config_add-product-biller")
    WebElement ADD_PRODUCT_BILLER_BUTTON;

    @FindBy(id = "qe_product-biller-config_bulk-add-product-biller")
    WebElement BULK_ADD_PRODUCT_BILLER_BUTTON;

    @FindBy(id = "qe_product-biller-config_product-biller_table")
    WebElement TABLE_PRODUCT_BILLER;

    @FindBy(id = "qe_product-biller-config_product-biller_action")
    WebElement ACTION_BUTTON;

    @FindBy(className = "qe_product-biller-config_product-biller_checkbox_table_header")
    WebElement CHECKBOX_TABLE_HEADER;

    @FindBy(className = "qe_product-biller-config_product-biller_product-id_table_header")
    WebElement PRODUCT_ID_TABLE_HEADER;

    @FindBy(className = "qe_product-biller-config_product-biller_product-name_table_header")
    WebElement PRODUCT_NAME_TABLE_HEADER;

    @FindBy(className = "qe_product-biller-config_product-biller_category_table_header")
    WebElement CATEGORY_TABLE_HEADER;

    @FindBy(className = "qe_product-biller-config_product-biller_biller_table_header")
    WebElement BILLER_TABLE_HEADER;

    @FindBy(className = "qe_product-biller-config_product-biller_status_table_header")
    WebElement STATUS_TABLE_HEADER;

    @FindBy(className = "qe_product-biller-config_product-biller_action_table_header")
    WebElement ACTION_TABLE_HEADER;

    public void OnSmartBillerMenu()throws InterruptedException{
        SMARTBILLER_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(PRODUCT_BILLER_CONFIG_SUB_MENU.isDisplayed());
    }

    public void OnProductBillerConfigMenu()throws InterruptedException{
        PRODUCT_BILLER_CONFIG_SUB_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(PRODUCT_BILLER_CONFIG_BREADCRUMB.isDisplayed());
        Assert.assertTrue(PRODUCT_BILLER_TAB.isDisplayed());
        Assert.assertTrue(ARCHIVED_PRODUCT_BILLER_TAB.isDisplayed());
        Assert.assertTrue(HISTORY_PRODUCT_BILLER_TAB.isDisplayed());
    }

    public void ClickProductBillerTab(){
        PRODUCT_BILLER_TAB.click();
    }

    public void GetDisplayInAccordanceWithPOsRequested(){
        Assert.assertTrue(BILLER_FILTER.isDisplayed());
        Assert.assertTrue(PRODUCT_ID_FILTER.isDisplayed());
        Assert.assertTrue(PRODUCT_NAME_FILTER.isDisplayed());
        Assert.assertTrue(STATUS_FILTER.isDisplayed());
        Assert.assertTrue(CATEGORY_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(ADD_PRODUCT_BILLER_BUTTON.isDisplayed());
        Assert.assertTrue(BULK_ADD_PRODUCT_BILLER_BUTTON.isDisplayed());
        Assert.assertTrue(ACTION_BUTTON.isDisplayed());
        Assert.assertTrue(TABLE_PRODUCT_BILLER.isDisplayed());
        Assert.assertTrue(CHECKBOX_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PRODUCT_ID_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PRODUCT_NAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(BILLER_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(STATUS_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(ACTION_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(CATEGORY_TABLE_HEADER.isDisplayed());
    }

    public void SearchCorrectProductBillerByCategory(String category){
        CATEGORY_FILTER.click();
        CATEGORY_FILTER.sendKeys(category+ Keys.ENTER);
    }

    public void ClickSearchButton(){
        SEARCH_BUTTON.click();
    }

    public void GetCorrectProductBillerBasedOnSearchFilter(String text){
        Assert.assertTrue(TABLE_PRODUCT_BILLER.getText().contains(text));
    }

    public void SearchProductBillerByOtherFilter(String other_filter, String text){
        if (other_filter.equalsIgnoreCase("biller")){
            BILLER_FILTER.click();
            BILLER_FILTER.sendKeys(text+Keys.ENTER);
        }
        else if (other_filter.equalsIgnoreCase("product_id")){
            PRODUCT_ID_FILTER.sendKeys(text+Keys.ENTER);
        }
        else if (other_filter.equalsIgnoreCase("product_name")){
            PRODUCT_NAME_FILTER.sendKeys(text+Keys.ENTER);
        }
        else if (other_filter.equalsIgnoreCase("status")){
            STATUS_FILTER.click();
            STATUS_FILTER.sendKeys(text+Keys.ENTER);
        }
    }
}
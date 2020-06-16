package Pages.Product.ProductApproval;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HistoryProductApprovalPage extends PageObject {
    @FindBy(id = "qe_product")
    WebElement PRODUCT_MENU;

    @FindBy(id = "qe_product-approval")
    WebElement PRODUCT_APPROVAL_SUB_MENU;

    @FindBy(xpath = "//a[starts-with(@id,'qe_product-approval_history')]")
    WebElement HISTORY_TAB;

    @FindBy(xpath = "//*[@id=\"qe_product-approval_product_filter\"]/div/input")
    WebElement PRODUCT_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_product-approval_cretaed-by_filter\"]/div/input")
    WebElement CREATED_BY_FILTER;

    @FindBy(id = "qe_product-approval_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_product-approval_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(className = "qe_product-approval_product-code_table_header")
    WebElement PRODUCT_CODE_HEADER;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_product-approval_detail-')])[last()]")
    WebElement DETAIL_BUTTON_ON_LAST_PRODUCT;

    @FindBy(id = "qe_product-approval_detail_pop-up")
    WebElement CHANGE_DETAIL_POP_UP;

    @FindBy(id = "qe_product-approval_detail_pop-up_title")
    WebElement CHANGE_DETAIL_POP_UP_TITLE;

    @FindBy(id = "qe_product-approval_detail_product-code")
    WebElement PRODUCT_CODE_ON_CHANGE_DETAIL_POP_UP;

    @FindBy(id = "qe_product-approval_detail_close")
    WebElement CLOSE_BUTTON_ON_CHANGE_DETAIL_POP_UP;

    public void OnProductMenu(){
        PRODUCT_MENU.click();
    }

    public void OnProductApprovalSubMenu()throws InterruptedException{
        PRODUCT_APPROVAL_SUB_MENU.click();
        Thread.sleep(6000);
        Assert.assertTrue(HISTORY_TAB.isDisplayed());
    }

    public void OnHistoryTab()throws InterruptedException{
        HISTORY_TAB.click();
        Thread.sleep(5000);
        Assert.assertTrue(PRODUCT_FILTER.isDisplayed());
        Assert.assertTrue(CREATED_BY_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(DETAIL_BUTTON_ON_LAST_PRODUCT.isDisplayed());
    }

    public void GetsProductIDHeaderChangeToProductCode(){
        Assert.assertTrue(PRODUCT_CODE_HEADER.isDisplayed());
        Assert.assertEquals("Product Code",PRODUCT_CODE_HEADER.getText());
    }

    public void ClickDetailButton()throws InterruptedException{
        DETAIL_BUTTON_ON_LAST_PRODUCT.click();
        Thread.sleep(4000);
        Assert.assertTrue(CHANGE_DETAIL_POP_UP.isDisplayed());
        Assert.assertTrue(CHANGE_DETAIL_POP_UP_TITLE.isDisplayed());
        Assert.assertEquals("Change Detail",CHANGE_DETAIL_POP_UP_TITLE.getText());
        Assert.assertTrue(CLOSE_BUTTON_ON_CHANGE_DETAIL_POP_UP.isDisplayed());
    }

    public void GetsProductIDHeaderChangeToProductCodeOnChangeDetailPopUp(){
        Assert.assertTrue(PRODUCT_CODE_ON_CHANGE_DETAIL_POP_UP.isDisplayed());
        Assert.assertEquals("Product Code",PRODUCT_CODE_ON_CHANGE_DETAIL_POP_UP.getText());
    }
}
package Pages.Product.ProductType;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProductTypePage extends PageObject {
    @FindBy(id = "qe_product")
    WebElement PRODUCT_MENU;

    @FindBy(id = "qe_product-type")
    WebElement PRODUCT_TYPE_SUB_MENU;

    @FindBy(id = "qe_product-type_breadcrumb")
    WebElement PRODUCT_TYPE_BREADCRUMB;

    @FindBy(className = "qe_product-type_product-type-id_table_header")
    WebElement PRODUCT_TYPE_ID_HEADER;

    @FindBy(className = "qe_product-type_product-type-name_table_header")
    WebElement PRODUCT_TYPE_NAME_HEADER;

    public void OnProductMenu()throws InterruptedException{
        PRODUCT_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(PRODUCT_TYPE_SUB_MENU.isDisplayed());
    }

    public void OnProductTypeSubMenu()throws InterruptedException{
        PRODUCT_TYPE_SUB_MENU.click();
        Thread.sleep(4000);
        Assert.assertTrue(PRODUCT_TYPE_BREADCRUMB.isDisplayed());
        Assert.assertTrue(PRODUCT_TYPE_ID_HEADER.isDisplayed());
        Assert.assertTrue(PRODUCT_TYPE_NAME_HEADER.isDisplayed());
    }

    public void GetCorrectHeader(String header){
        Assert.assertEquals(header,PRODUCT_TYPE_ID_HEADER.getText());
    }
}
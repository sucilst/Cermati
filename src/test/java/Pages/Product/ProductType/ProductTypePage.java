package Pages.Product.ProductType;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductTypePage extends PageObject {
    String names;

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

    @FindBy(xpath = "//span[contains(text(),'»')]")
    WebElement LAST_PAGE_DATA;

    @FindBy(xpath = "//button[contains(text(),'Update')]")
    WebElement UPDATE_BUTTON;

    @FindBy(xpath = "//button[contains(text(),'Ok')]")
    WebElement OK_BUTTON;

    @FindBy(xpath = "//*[@id=\"__BVID__306\"]")
    WebElement NAME_UPDATE;

    public WebElement getDataTable(int index){
        WebElement mytable = getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]"));
        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
        List <WebElement> Columns_row = rows_table.get(rows_table.size()-1).findElements(By.tagName("td"));
        return Columns_row.get(index);
    }

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

    public void clickEditButton(){
        LAST_PAGE_DATA.click();
        getDataTable(3).findElements(By.tagName("button")).get(0).click();
    }

    public void changeName(String name){
        names = name;
        NAME_UPDATE.clear();
        NAME_UPDATE.sendKeys(name);
        UPDATE_BUTTON.click();
        OK_BUTTON.click();
    }

    public void GetCorrectHeader() throws InterruptedException {
        Assert.assertEquals(names,getDataTable(2).getText());
        getDataTable(3).findElements(By.tagName("button")).get(0).click();
        NAME_UPDATE.clear();
        UPDATE_BUTTON.click();
        OK_BUTTON.click();
        Thread.sleep(4000);
        Assert.assertEquals("",getDataTable(2).getText());
    }
}
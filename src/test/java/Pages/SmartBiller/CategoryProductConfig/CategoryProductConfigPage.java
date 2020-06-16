package Pages.SmartBiller.CategoryProductConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CategoryProductConfigPage extends PageObject {

    String category_product,product;

    @FindBy(id = "qe_smartbiller")
    WebElement SMARTBILLER_MENU;

    @FindBy(id = "qe_category-product")
    WebElement CATEGORY_PRODUCT_CONFIG_SUB_MENU;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_category-product-config_edit-')])[last()]")
    WebElement LAST_EDIT_BUTTON_ON_THE_TABLE;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_category-product-config_category-')])[last()]")
    WebElement CATEGORY_COLUMN;

    @FindBy(id = "qe_category-of-products_breadcrumb")
    WebElement CATEGORY_PRODUCT_CONFIG_BREADCRUMB;

    @FindBy(xpath = "//h5[@id='qe_category-product-config_edit_pop-up_title' and @class='modal-title']")
    WebElement EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP_TITLE;

    @FindBy(id = "qe_category-product-config_edit_pop-up_category-list")
    WebElement CATEGORY_LIST_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP;

    @FindBy(id = "qe_category-product-config_edit_pop-up_ok")
    WebElement OK_BUTTON_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP;

    @FindBy(id = "qe_category-product-config_edit_pop-up_cancel")
    WebElement CANCEL_BUTTON_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP;

    @FindBy(xpath = "//option[@value='1']")
    WebElement OPTION_PULSA_DIRECT;

    @FindBy(xpath = "//option[@value='-1']")
    WebElement OPTION_INVALID_CATEGORY_ID;

    @FindBy(id = "qe_category-product-config_success_pop-up")
    WebElement SUCCESS_POP_UP;

    @FindBy(id = "qe_category-product-config_success_pop-up_ok")
    WebElement OK_BUTTON_ON_SUCCESS_POP_UP;

    @FindBy(id = "swal2-content")
    WebElement WARNING_POP_UP;

    @FindBy(xpath = "(//input[@type='search'])[last()-3]")
    WebElement PRODUCT_FILTER;

    @FindBy(xpath = "//*[@id=\"settings-smartbiller-category_product_config\"]/div[1]/div[2]/div/button[1]")
    WebElement SEARCH_BUTTON_ON_CATEGORY_PRODUCT_CONFIG;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    WebElement OK_BUTTON_WARNING_POP_UP;

    @FindBy(id = "qe_category-product-config_product-20")
    WebElement PRODUCT_COLUMN;

    public void OnSmartBillerMenu()throws InterruptedException{
        SMARTBILLER_MENU.click();
        Thread.sleep(6000);
        Assert.assertTrue(CATEGORY_PRODUCT_CONFIG_SUB_MENU.isDisplayed());
    }

    public void OnCategoryProductConfigSubMenu()throws InterruptedException{
        CATEGORY_PRODUCT_CONFIG_SUB_MENU.click();
        Thread.sleep(6000);
        Assert.assertTrue(CATEGORY_PRODUCT_CONFIG_BREADCRUMB.isDisplayed());
        Assert.assertTrue(LAST_EDIT_BUTTON_ON_THE_TABLE.isDisplayed());
        Assert.assertTrue(CATEGORY_COLUMN.isDisplayed());
    }

    public void OnEditACategoryProductConfigPopUp()throws InterruptedException{
        product = PRODUCT_COLUMN.getText();
        System.out.println(product);
        category_product = CATEGORY_COLUMN.getText();
        System.out.println(category_product);
        LAST_EDIT_BUTTON_ON_THE_TABLE.click();
        Thread.sleep(4000);
        Assert.assertTrue(EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP_TITLE.isDisplayed());
        Assert.assertEquals("Edit a Category of Product Config",EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP_TITLE.getText());
        Assert.assertTrue(CATEGORY_LIST_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP.isDisplayed());
        Assert.assertTrue(OK_BUTTON_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP.isDisplayed());
        Assert.assertTrue(CANCEL_BUTTON_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP.isDisplayed());
    }

    public void ClickOKButtonOnThisPopUp(){
        OK_BUTTON_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP.click();
    }

    public void GetSuccessEditPopUp(){
        Assert.assertTrue(SUCCESS_POP_UP.isDisplayed());
        Assert.assertEquals("Succesfully to edit category of product config.",SUCCESS_POP_UP.getText());
        Assert.assertTrue(OK_BUTTON_ON_SUCCESS_POP_UP.isDisplayed());
        OK_BUTTON_ON_SUCCESS_POP_UP.click();
    }

    public void GetsSuccessEditPopUpAndTheCategoryColumnNotChanged()throws InterruptedException{
        PRODUCT_FILTER.click();
        PRODUCT_FILTER.sendKeys(product+Keys.ENTER);
        Thread.sleep(4000);
        SEARCH_BUTTON_ON_CATEGORY_PRODUCT_CONFIG.click();
        Assert.assertTrue(CATEGORY_COLUMN.isDisplayed());
        Assert.assertEquals(category_product,CATEGORY_COLUMN.getText());
    }

    public void TheCategoryColumnMatchesWithThePreviouslySelectedCategory()throws InterruptedException{
        PRODUCT_FILTER.click();
        PRODUCT_FILTER.sendKeys(product+Keys.ENTER);
        Thread.sleep(4000);
        SEARCH_BUTTON_ON_CATEGORY_PRODUCT_CONFIG.click();
        Assert.assertTrue(CATEGORY_COLUMN.isDisplayed());
        Assert.assertEquals("Pulsa direct",CATEGORY_COLUMN.getText());
    }

    public void ChooseAnotherCategory()throws InterruptedException{
        CATEGORY_LIST_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP.click();
        Thread.sleep(2000);
        OPTION_PULSA_DIRECT.click();
    }

    public void ChooseCategoryWithInvalidValueOfCategoryId()throws InterruptedException{
        CATEGORY_LIST_ON_EDIT_CATEGORY_PRODUCT_CONFIG_POP_UP.click();
        Thread.sleep(2000);
        OPTION_INVALID_CATEGORY_ID.click();
    }

    public void GetsWarningPopUpWithGiveInformationThatCategoryIDInvalidValue(){
        Assert.assertTrue(WARNING_POP_UP.isDisplayed());
        Assert.assertEquals("category_id: invalid value",WARNING_POP_UP.getText());
    }
}
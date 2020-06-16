package Pages.SmartBiller.ChangeLog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ChangeLogPage extends PageObject {
    @FindBy(id="qe_smartbiller")
    WebElement SMARTBILLER_MENU;

    @FindBy(id = "qe_change-log")
    WebElement CHANGE_LOG_SUB_MENU;

    @FindBy(id = "qe_change-log_breadcrumb")
    WebElement CHANGE_LOG_BREADCRUMB;

    @FindBy (xpath = "//*[@id=\"qe_change-log_partner_filter\"]/div/input")
    WebElement PARTNER_FILTER;

    @FindBy (id = "qe_change-log_product_filter")
    WebElement PRODUCT_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_change-log_partner_filter\"]/div/span")
    WebElement SELECTED_TAG_PARTNER;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_change-log_partner-name-')])[last()]")
    WebElement PARTNER_NAME_ON_THE_LAST;

    @FindBy(xpath = "(//div[starts-with(@id,'qe_change-log_product-id-')])[last()]")
    WebElement PRODUCT_ID_ON_THE_LAST;

    @FindBy(id = "qe_change-log_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_change-log_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    public void OnSmartBillerMenu()throws InterruptedException{
        SMARTBILLER_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(CHANGE_LOG_SUB_MENU.isDisplayed());
    }

    public void OnChangeLogSubMenu(){
        CHANGE_LOG_SUB_MENU.click();
        Assert.assertTrue(CHANGE_LOG_BREADCRUMB.isDisplayed());
        Assert.assertTrue(PARTNER_FILTER.isDisplayed());
        Assert.assertTrue(PRODUCT_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
    }

    public void ClickAndChoosePartnerOnPartnerDropdown(){
        PARTNER_FILTER.click();
        PARTNER_FILTER.sendKeys("tester"+Keys.ENTER);
    }

    public void ClickSearchButton(){
        SEARCH_BUTTON.click();
    }

    public void GetsProductIdAndProductNameList(){
        Assert.assertEquals("[1] tester",SELECTED_TAG_PARTNER.getText());
    }

    public void GetsPartnerBasedOnPartnerFilter(){
        Assert.assertEquals("tester",PARTNER_NAME_ON_THE_LAST.getText());
    }

    public void WriteIncorrectPartnerName(){
        PARTNER_FILTER.click();
        PARTNER_FILTER.sendKeys("sxksaxjkx");
    }

    public void WriteCorrectProductID(){
        PRODUCT_FILTER.sendKeys("15");
    }

    public void GetsAPartnersProductThatMatchesTheFilterWrittenAndSelected(){
        Assert.assertEquals("tester",PARTNER_NAME_ON_THE_LAST.getText());
        Assert.assertEquals("15",PRODUCT_ID_ON_THE_LAST.getText());
    }

    public void WriteIncorrectProductID(){
        PRODUCT_FILTER.sendKeys("98099");
    }
}
package Pages.SmartBiller.TOPConfig;

import Utils.random;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TOPPartnerLogPage extends PageObject {
    random rand = new random();
    String topPartner = rand.getNumber();
    String topPartnerBefore;

    @FindBy(id = "qe_top-partner-config_pop-up_cancel")
    WebElement CANCEL_BUTTON;

    @FindBy(id = "qe_top-config_top-partner-log___BV_tab_button__")
    WebElement TOP_PARTNER_LOG_TAB;

    @FindBy(xpath = "//*[@id=\"qe_top-config_top-partner-log_partner_filter\"]/div/input")
    WebElement PARTNER_DROPDOWN_FILTER;

    @FindBy(id = "qe_top-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_top-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(id = "qe_top-config_top-partner-log_table")
    WebElement TABLE_OF_TOP_PARTNER_LOG;

    @FindBy(className = "qe_top-partner-log_partner-id_table_header")
    WebElement PARTNER_ID_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-log_partner-name_table_header")
    WebElement PARTNER_NAME_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-log_username_table_header")
    WebElement USERNAME_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-log_role_table_header")
    WebElement ROLE_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-log_top-partner-before_table_header")
    WebElement PARTNER_BEFORE_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-log_top-partner-after_table_header")
    WebElement PARTNER_AFTER_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-log_updated-at_table_header")
    WebElement UPDATED_AT_TABLE_HEADER;

    @FindBy(xpath = "//a[@aria-label='Goto page 1']")
    WebElement PAGE_ONE;

    @FindBy(xpath = "//a[@aria-label='Goto page 2']")
    WebElement PAGE_TWO;

    @FindBy(id = "qe_top-partner-config_pop-up_top-partner_field")
    WebElement TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP;

    @FindBy(id = "qe_top-partner-log_top-partner-before-1")
    WebElement PARTNER_BEFORE;

    @FindBy(id = "qe_top-partner-log_top-partner-after-1")
    WebElement PARTNER_AFTER;

    public void ClickCancelButton(){
        CANCEL_BUTTON.click();
    }

    public void ClickTabTopPartnerLog(){
        TOP_PARTNER_LOG_TAB.click();
    }

    public void GetDisplayedInAccordanceWithPOsRequested(){
        Assert.assertTrue(PARTNER_DROPDOWN_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(TABLE_OF_TOP_PARTNER_LOG.isDisplayed());
        Assert.assertTrue(PARTNER_ID_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PARTNER_NAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(USERNAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(ROLE_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PARTNER_BEFORE_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PARTNER_AFTER_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(UPDATED_AT_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(TABLE_OF_TOP_PARTNER_LOG.isDisplayed());
        Assert.assertEquals("true",PAGE_ONE.getAttribute("aria-checked"));
    }

    public void ChangeTOPPartner(String number){
        if (number.equalsIgnoreCase("positive")){
            topPartnerBefore = TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.getAttribute("value");
            TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),topPartner);
        }
        else if (number.equalsIgnoreCase("negative")){
            topPartnerBefore = TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.getAttribute("value");
            TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"-"+topPartner);
        }
    }

    public void SeeChangeOfThisPartnerIsAtTheTopOfTheList(String number){
        if (number.equalsIgnoreCase("positive")){
            Assert.assertEquals(topPartnerBefore,PARTNER_BEFORE.getText());
            Assert.assertEquals(topPartner,PARTNER_AFTER.getText());
        }
        else if (number.equalsIgnoreCase("negative")){
            Assert.assertEquals(topPartnerBefore,PARTNER_BEFORE.getText());
            Assert.assertEquals("-"+topPartner,PARTNER_AFTER.getText());
        }
    }

    public void SearchCorrectPartner(String partner){
        PARTNER_DROPDOWN_FILTER.click();
        PARTNER_DROPDOWN_FILTER.sendKeys(partner+Keys.ENTER);
    }

    public void ClickSearchButton(){
        SEARCH_BUTTON.click();
    }

    public void GetLogList(String partner){
        Assert.assertTrue(TABLE_OF_TOP_PARTNER_LOG.getText().contains(partner));
    }

    public void ClickPage2(){
        PAGE_TWO.click();
    }

    public void GetDefaultPageIsPage1AndGetCorrectPartnerOnTheList(String partner){
        Assert.assertEquals("true",PAGE_ONE.getAttribute("aria-checked"));
        Assert.assertTrue(TABLE_OF_TOP_PARTNER_LOG.getText().contains(partner));
    }

    public void SearchIncorrectPartner(){
        PARTNER_DROPDOWN_FILTER.click();
        PARTNER_DROPDOWN_FILTER.sendKeys(rand.getNoSymbol());
    }

    public void ClickClearFilterButton(){
        CLEAR_FILTER_BUTTON.click();
    }

    public void GetPartnerFilterEmpty(){
        Assert.assertEquals(false,PARTNER_DROPDOWN_FILTER.getAttribute("class").equals("selected-tag"));
    }
}
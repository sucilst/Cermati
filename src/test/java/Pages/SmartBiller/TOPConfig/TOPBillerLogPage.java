package Pages.SmartBiller.TOPConfig;

import Utils.random;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TOPBillerLogPage extends PageObject {
    random rand = new random();
    String topBiller = rand.getNumber();
    String topBillerBefore;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement CANCEL_BUTTON;

    @FindBy(id = "qe_top-config_top-biller-log___BV_tab_button__")
    WebElement TOP_BILLER_LOG_TAB;

    @FindBy(xpath = "//*[@id=\"qe_top-config_top-biller-log_biller_filter\"]/div/input")
    WebElement BILLER_DROPDOWN_FILTER;

    @FindBy(id = "qe_top-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_top-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(id = "qe_top-config_top-biller-log_table")
    WebElement TABLE_OF_TOP_BILLER_LOG;

    @FindBy(className = "qe_top-biller-log_biller-id_table_header")
    WebElement BILLER_ID_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-log_biller-name_table_header")
    WebElement BILLER_NAME_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-log_username_table_header")
    WebElement USERNAME_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-log_role_table_header")
    WebElement ROLE_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-log_top-biller-before_table_header")
    WebElement BILLER_BEFORE_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-log_top-biller-after_table_header")
    WebElement BILLER_AFTER_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-log_updated-at_table_header")
    WebElement UPDATED_AT_TABLE_HEADER;

    @FindBy(xpath = "//a[@aria-label='Goto page 1']")
    WebElement PAGE_ONE;

    @FindBy(xpath = "//a[@aria-label='Goto page 2']")
    WebElement PAGE_TWO;

    @FindBy(id = "qe_top-biller-config_pop-up_top-biller_field")
    WebElement TOP_BILLER_FIELD_ON_POP_UP;

    @FindBy(id = "qe_top-biller-log_top-biller-before-1")
    WebElement TOP_BILLER_BEFORE;

    @FindBy(id = "qe_top-biller-log_top-biller-after-1")
    WebElement TOP_BILLER_AFTER;

    public void ClickCancelButton(){
        CANCEL_BUTTON.click();
    }

    public void ClickTabTopPartnerLog(){
        TOP_BILLER_LOG_TAB.click();
    }

    public void GetDisplayedInAccordanceWithPOsRequested(){
        Assert.assertTrue(BILLER_DROPDOWN_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(TABLE_OF_TOP_BILLER_LOG.isDisplayed());
        Assert.assertTrue(BILLER_ID_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(BILLER_NAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(USERNAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(ROLE_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(BILLER_BEFORE_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(BILLER_AFTER_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(UPDATED_AT_TABLE_HEADER.isDisplayed());
        Assert.assertEquals("true",PAGE_ONE.getAttribute("aria-checked"));
    }

    public void ChangeTOPBiller(String number){
        if (number.equalsIgnoreCase("positive")){
            topBillerBefore = TOP_BILLER_FIELD_ON_POP_UP.getAttribute("value");
            TOP_BILLER_FIELD_ON_POP_UP.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),topBiller);
        }
        else if (number.equalsIgnoreCase("negative")){
            topBillerBefore = TOP_BILLER_FIELD_ON_POP_UP.getAttribute("value");
            TOP_BILLER_FIELD_ON_POP_UP.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"-"+topBiller);
        }
    }

    public void SeeChangeOfThisBillerIsAtTheTopOfTheList(String number){
        if (number.equalsIgnoreCase("positive")){
            Assert.assertEquals(topBillerBefore,TOP_BILLER_BEFORE.getText());
            Assert.assertEquals(topBiller,TOP_BILLER_AFTER.getText());
        }
        else if (number.equalsIgnoreCase("negative")){
            Assert.assertEquals(topBillerBefore,TOP_BILLER_BEFORE.getText());
            Assert.assertEquals("-"+topBiller,TOP_BILLER_AFTER.getText());
        }
    }

    public void SearchCorrectBiller(String biller){
        BILLER_DROPDOWN_FILTER.click();
        BILLER_DROPDOWN_FILTER.sendKeys(biller+Keys.ENTER);
    }

    public void ClickSearchButton(){
        SEARCH_BUTTON.click();
    }

    public void GetLogList(String biller){
        Assert.assertTrue(TABLE_OF_TOP_BILLER_LOG.getText().contains(biller));
    }

    public void ClickPage2(){
        PAGE_TWO.click();
    }

    public void GetDefaultPageIsPage1AndGetCorrectBillerOnTheList(String biller){
        Assert.assertEquals("true",PAGE_ONE.getAttribute("aria-checked"));
        Assert.assertTrue(TABLE_OF_TOP_BILLER_LOG.getText().contains(biller));
    }

    public void SearchIncorrectBiller(){
        BILLER_DROPDOWN_FILTER.click();
        BILLER_DROPDOWN_FILTER.sendKeys(rand.getNoSymbol());
    }

    public void ClickClearFilterButton(){
        CLEAR_FILTER_BUTTON.click();
    }

    public void GetBillerFilterEmpty(){
        Assert.assertEquals(false,BILLER_DROPDOWN_FILTER.getAttribute("class").equals("selected-tag"));
    }
}
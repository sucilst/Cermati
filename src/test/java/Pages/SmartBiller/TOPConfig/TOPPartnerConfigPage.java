package Pages.SmartBiller.TOPConfig;

import Utils.random;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TOPPartnerConfigPage extends PageObject {
    random rand = new random();
    String randomNumber = rand.getNumber();
    @FindBy(id = "qe_smartbiller")
    WebElement SMARTBILLER_MENU;

    @FindBy(id = "qe_top-config")
    WebElement TOP_CONFIG_SUB_MENU;

    @FindBy(id = "qe_top-config_breadcrumb")
    WebElement TOP_CONFIG_BREADCRUMB;

    @FindBy(id = "qe_top-config_top-partner-config___BV_tab_button__")
    WebElement TOP_PARTNER_CONFIG_TAB;

    @FindBy(id = "qe_top-config_top-partner-log___BV_tab_button__")
    WebElement TOP_PARTNER_LOG_TAB;

    @FindBy(id = "qe_top-config_top-partner-config_partner_filter")
    WebElement PARTNER_FILTER;

    @FindBy(id = "qe_top-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_top-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(id = "qe_top-config_top-partner-config_add")
    WebElement ADD_TOP_PARTNER_CONFIG_BUTTON;

    @FindBy(id = "qe_top-config_top-partner-config_table")
    WebElement TABLE_TOP_PARTNER_CONFIG;

    @FindBy(className = "qe_top-partner-config_partner-id_table_header")
    WebElement PARTNER_ID_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-config_partner-name_table_header")
    WebElement PARTNER_NAME_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-config_top-partner_table_header")
    WebElement TOP_PARTNER_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-config_updated_table_header")
    WebElement UPDATED_TABLE_HEADER;

    @FindBy(className = "qe_top-partner-config_action_table_header")
    WebElement ACTION_TABLE_HEADER;

    @FindBy(xpath = "//*[@id=\"qe_top-partner-config_edit-1\"]/button")
    WebElement EDIT_BUTTON;

    @FindBy(id = "qe_top-partner-config_top-partner-1")
    WebElement TOP_PARTNER_ON_THE_LIST;

    @FindBy(id = "qe_top-partner-config_pop-up")
    WebElement TOP_PARTNER_CONFIG_POP_UP;

    @FindBy(id = "qe_top-partner-config_pop-up_title")
    WebElement TITLE_OF_TOP_PARTNER_CONFIG_POP_UP;

    @FindBy(xpath = "//*[@id=\"qe_top-partner-config_pop-up_partner_field\"]/div/input")
    WebElement PARTNER_DROPDOWN_ON_TOP_PARTNER_CONFIG_POP_UP;

    @FindBy(id = "qe_top-partner-config_pop-up_top-partner_field")
    WebElement TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP;

    @FindBy(id = "qe_top-partner-config_pop-up_ok")
    WebElement OK_BUTTON;

    @FindBy(id = "qe_top-partner-config_pop-up_cancel")
    WebElement CANCEL_BUTTON;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement SUCCESS_POP_UP;

    public void OnTopConfigSubMenu()throws InterruptedException{
        SMARTBILLER_MENU.click();
        Thread.sleep(3000);
        TOP_CONFIG_SUB_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(TOP_CONFIG_BREADCRUMB.isDisplayed());
        Assert.assertEquals("TOP Config",TOP_CONFIG_BREADCRUMB.getText());
        Assert.assertTrue(TOP_PARTNER_CONFIG_TAB.isDisplayed());
        Assert.assertTrue(TOP_PARTNER_LOG_TAB.isDisplayed());
    }

    public void ClickTabTopPartnerConfig(){
        TOP_PARTNER_CONFIG_TAB.click();
    }

    public void GetDisplayBasedOnWireframe(){
        Assert.assertTrue(PARTNER_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(TABLE_TOP_PARTNER_CONFIG.isDisplayed());
        Assert.assertTrue(ADD_TOP_PARTNER_CONFIG_BUTTON.isDisplayed());
        Assert.assertTrue(PARTNER_ID_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PARTNER_NAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(UPDATED_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(TOP_PARTNER_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(ACTION_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(EDIT_BUTTON.isDisplayed());
    }

    public void ClickAddTopPartnerConfigPopUp(){
        ADD_TOP_PARTNER_CONFIG_BUTTON.click();
    }

    public void GetPartnerDropdownAndTopPartnerTextField(){
        Assert.assertTrue(TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertTrue(TITLE_OF_TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertEquals("Add TOP Partner Config",TITLE_OF_TOP_PARTNER_CONFIG_POP_UP.getText());
        Assert.assertTrue(PARTNER_DROPDOWN_ON_TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertTrue(TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertEquals("text",TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.getAttribute("type"));
        Assert.assertTrue(OK_BUTTON.isDisplayed());
        Assert.assertTrue(CANCEL_BUTTON.isDisplayed());
    }

    public void SelectPartner(String partner){
        PARTNER_DROPDOWN_ON_TOP_PARTNER_CONFIG_POP_UP.click();
        PARTNER_DROPDOWN_ON_TOP_PARTNER_CONFIG_POP_UP.sendKeys(partner+ Keys.ENTER);
    }

    public void FillTOPPartner(String TOP){
        TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.sendKeys(TOP);
    }

    public void ClickOK(){
        OK_BUTTON.click();
    }

    public void GetNewTopPartnerConfigOnTheTopOfTheTableList(String partner, String top){
        Assert.assertTrue(TABLE_TOP_PARTNER_CONFIG.getText().contains(partner));
        Assert.assertTrue(TABLE_TOP_PARTNER_CONFIG.getText().contains(top));
    }

    public void ClickEditButtonOnOneOfTheRowInTheList(){
        EDIT_BUTTON.click();
    }

    public void GetCorrectPartnerAndTopPartnerTextField(){
        Assert.assertTrue(TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertTrue(TITLE_OF_TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertEquals("Edit TOP Partner Config",TITLE_OF_TOP_PARTNER_CONFIG_POP_UP.getText());
        Assert.assertTrue(TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.isDisplayed());
        Assert.assertEquals("text",TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.getAttribute("type"));
        Assert.assertTrue(OK_BUTTON.isDisplayed());
        Assert.assertTrue(CANCEL_BUTTON.isDisplayed());
    }

    public void ChangeTOPPartner(){
        TOP_PARTNER_FIELD_ON_TOP_PARTNER_CONFIG_POP_UP.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),randomNumber);
    }

    public void ClickOKOnSuccessPopUp(){
        SUCCESS_POP_UP.click();
    }

    public void GetChangeOnTopThisChosenPartner(){
        Assert.assertEquals(randomNumber,TOP_PARTNER_ON_THE_LIST.getText());
    }
}
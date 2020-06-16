package Pages.SmartBiller.TOPConfig;

import Utils.random;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TOPBillerConfigPage extends PageObject {
    random rand = new random();
    String TopBiller = rand.getNumber();

    @FindBy(id = "qe_top-config_top-biller-config___BV_tab_button__")
    WebElement TOP_BILLER_CONFIG_TAB;

    @FindBy(id = "qe_top-config_top-biller-config_biller_filter")
    WebElement BILLER_FILTER;

    @FindBy(id = "qe_top-config_search")
    WebElement SEARCH_BUTTON;

    @FindBy(id = "qe_top-config_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(id = "qe_top-config_top-biller-config_table")
    WebElement TABLE_OF_TOP_BILLER_CONFIG;

    @FindBy(id = "qe_top-config_top-biller-config_add")
    WebElement ADD_TOP_BILLER_CONFIG;

    @FindBy(className = "qe_top-biller-config_biller-id_table_header")
    WebElement BILLER_ID_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-config_biller-name_table_header")
    WebElement BILLER_NAME_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-config_top-biller_table_header")
    WebElement TOP_BILLER_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-config_updated_table_header")
    WebElement UPDATED_TABLE_HEADER;

    @FindBy(className = "qe_top-biller-config_action_table_header")
    WebElement ACTION_TABLE_HEADER;

    @FindBy(xpath = "//a[@aria-label='Goto page 1']")
    WebElement PAGE_ONE;

    @FindBy(id = "qe_top-biller-config_pop-up")
    WebElement POP_UP;

    @FindBy(xpath = "//*[@id=\"qe_top-biller-config_pop-up___BV_modal_header_\"]/h5")
    WebElement TITLE_OF_POP_UP;

    @FindBy(xpath = "//*[@id=\"qe_top-biller-config_pop-up___BV_modal_body_\"]/div/div[1]/div[2]/div/div/input")
    WebElement BILLER_DROPDOWN_ON_POP_UP;

    @FindBy(id = "qe_top-biller-config_pop-up_top-biller_field")
    WebElement TOP_BILLER_FIELD_ON_POP_UP;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement OK_BUTTON;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement CANCEL_BUTTON;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    WebElement OK_BUTTON_ON_SUCCESS_POP_UP;

    @FindBy(id = "qe_top-biller-config_top-biller-1")
    WebElement TOP_BILLER_ROW;

    @FindBy(id = "qe_top-biller-config_biller-name-1")
    WebElement BILLER_LABEL_ROW;

    @FindBy(id = "qe_top-biller-config_edit-1")
    WebElement EDIT_BUTTON;


    public void ClickTabTopBillerConfig(){
        TOP_BILLER_CONFIG_TAB.click();
    }

    public void GetDisplayOfTopBillerConfigBasedOnWireframe(){
        Assert.assertTrue(BILLER_FILTER.isDisplayed());
        Assert.assertTrue(SEARCH_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(TABLE_OF_TOP_BILLER_CONFIG.isDisplayed());
        Assert.assertTrue(ADD_TOP_BILLER_CONFIG.isDisplayed());
        Assert.assertTrue(BILLER_ID_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(BILLER_NAME_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(TOP_BILLER_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(UPDATED_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(ACTION_TABLE_HEADER.isDisplayed());
        Assert.assertTrue(PAGE_ONE.isDisplayed());
        Assert.assertEquals("true",PAGE_ONE.getAttribute("aria-checked"));
    }

    public void ClickAddTopBillerConfigButton(){
        ADD_TOP_BILLER_CONFIG.click();
    }

    public void GetBillerDropdownAndTopBillerTextField(){
        Assert.assertTrue(POP_UP.isDisplayed());
        Assert.assertTrue(TITLE_OF_POP_UP.isDisplayed());
        Assert.assertEquals("Add TOP Biller Config",TITLE_OF_POP_UP.getText());
        Assert.assertTrue(BILLER_DROPDOWN_ON_POP_UP.isDisplayed());
        Assert.assertTrue(TOP_BILLER_FIELD_ON_POP_UP.isDisplayed());
        Assert.assertTrue(OK_BUTTON.isDisplayed());
        Assert.assertTrue(CANCEL_BUTTON.isDisplayed());
    }

    public void SelectBiller(String biller){
        BILLER_DROPDOWN_ON_POP_UP.click();
        BILLER_DROPDOWN_ON_POP_UP.sendKeys(biller+ Keys.ENTER);
    }

    public void FillTOPBiller(){
        TOP_BILLER_FIELD_ON_POP_UP.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),TopBiller);
    }

    public void ClickOKButton(){
        OK_BUTTON.click();
    }

    public void ClickOKButtonOnSuccessPopUp(){
        OK_BUTTON_ON_SUCCESS_POP_UP.click();
    }

    public void GetNewTopBillerConfig(String biller){
        Assert.assertEquals(TopBiller,TOP_BILLER_ROW.getText());
        Assert.assertEquals(biller,BILLER_LABEL_ROW.getText());
    }

    public void ClickEditButtonAtTheTopOfTheList(){
        EDIT_BUTTON.click();
    }

    public void GetCorrectBillerAndTopBillerTextField(){
        Assert.assertTrue(POP_UP.isDisplayed());
        Assert.assertTrue(TITLE_OF_POP_UP.isDisplayed());
        Assert.assertEquals("Edit TOP Biller Config",TITLE_OF_POP_UP.getText());
        Assert.assertTrue(TOP_BILLER_FIELD_ON_POP_UP.isDisplayed());
        Assert.assertTrue(OK_BUTTON.isDisplayed());
        Assert.assertTrue(CANCEL_BUTTON.isDisplayed());
    }

    public void GetChangeOnTopThisChosenBiller(){
        Assert.assertEquals(TopBiller,TOP_BILLER_ROW.getText());
    }
}
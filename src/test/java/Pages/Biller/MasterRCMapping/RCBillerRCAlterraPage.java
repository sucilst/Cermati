package Pages.Biller.MasterRCMapping;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RCBillerRCAlterraPage extends PageObject {
    @FindBy(id = "qe_biller")
    WebElement BILLER_MENU;

    @FindBy(id = "qe_master-rc-mapping")
    WebElement MASTER_RC_MAPPING_SUB_MENU;

    @FindBy(id = "qe_master-rc-mapping_breadcrumb")
    WebElement MASTER_RC_MAPPING_SUB_MENU_BREADCRUMB;

    @FindBy(id = "qe_master-rc-mapping_rc-biller-rc-alterra")
    WebElement RC_BILLER_RC_ALTERRA_TAB;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_master-rc-mapping_rc-biller-rc-alterra_log-')])[last()]")
    WebElement LOG_BUTTON;

    @FindBy(id = "qe_master-rc-mapping_rc-biller-rc-alterra_log_pop-up")
    WebElement LOG_POP_UP;

    @FindBy(id = "qe_master-rc-mapping_rc-biller-rc-alterra_log_title_pop-up")
    WebElement TITLE_LOG_POP_UP;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_biller_header_table")
    WebElement BILLER_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_rc-biller_header_table")
    WebElement RC_BILLER_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_message-biller_header_table")
    WebElement MESSAGE_BILLER_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_rc-alterra_header_table")
    WebElement RC_ALTERRA_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_message-alterra_header_table")
    WebElement MESSAGE_ALTERRA_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_approved-at_header_table")
    WebElement APPROVED_AT_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_created-by_header_table")
    WebElement CREATED_BY_LOG_HEADER_TABLE;

    @FindBy(className = "qe_master-rc-mapping_rc-biller-rc-alterra_log_approved-by_header_table")
    WebElement APPROVED_BY_LOG_HEADER_TABLE;

    @FindBy(id = "qe_master-rc-mapping_rc-biller-rc-alterra_log_pop-up___BV_modal_body_")
    WebElement TABLE_LOG_POP_UP;

    public void OnBillerMenu()throws InterruptedException{
        BILLER_MENU.click();
        Thread.sleep(4000);
        Assert.assertTrue(MASTER_RC_MAPPING_SUB_MENU.isDisplayed());
    }

    public void OnRCBillerRCAlterraTab()throws InterruptedException{
        MASTER_RC_MAPPING_SUB_MENU.click();
        Thread.sleep(4000);
        Assert.assertTrue(MASTER_RC_MAPPING_SUB_MENU_BREADCRUMB.isDisplayed());
        Assert.assertEquals("Master RC Mapping",MASTER_RC_MAPPING_SUB_MENU_BREADCRUMB.getText());
        Assert.assertTrue(RC_BILLER_RC_ALTERRA_TAB.isDisplayed());
        Assert.assertTrue(LOG_BUTTON.isDisplayed());
    }

    public void ClickLogButton(){
        LOG_BUTTON.click();
    }

    public void GetDisplayMustBeTheSameAsTheProductOwnersRequested(){
        Assert.assertTrue(LOG_POP_UP.isDisplayed());
        Assert.assertTrue(TITLE_LOG_POP_UP.isDisplayed());
        Assert.assertEquals("Log",TITLE_LOG_POP_UP.getText());
        Assert.assertTrue(BILLER_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("Biller",BILLER_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(RC_BILLER_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("RC Biller",RC_BILLER_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(MESSAGE_BILLER_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("Message Biller",MESSAGE_BILLER_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(RC_ALTERRA_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("RC Alterra",RC_ALTERRA_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(MESSAGE_ALTERRA_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("Message Alterra",MESSAGE_ALTERRA_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(APPROVED_AT_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("Approved At",APPROVED_AT_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(CREATED_BY_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("Created By",CREATED_BY_LOG_HEADER_TABLE.getText());
        Assert.assertTrue(APPROVED_BY_LOG_HEADER_TABLE.isDisplayed());
        Assert.assertEquals("Approved By",APPROVED_BY_LOG_HEADER_TABLE.getText());
    }

    public void Get5LastChangeRCMapping(){
        WebElement TogetRows = TABLE_LOG_POP_UP;
        List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
        System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
        Assert.assertTrue(TotalRowsList.size()<=6);
    }
}
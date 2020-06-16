package Pages.Transaction;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TransactionPage extends PageObject {
    @FindBy(id = "qe_transaction")
    WebElement TRANSACTION_MENU;

    @FindBy(id = "qe_pending-summary")
    WebElement PENDING_SUMMARY_SUB_MENU;

    @FindBy(id = "qe_quarantine")
    WebElement QUARANTINE_SUB_MENU;

    @FindBy(id = "qe_bulk-update")
    WebElement BULK_UPDATE_SUB_MENU;

    @FindBy(id = "qe_reversal")
    WebElement REVERSAL_SUB_MENU;

    public void ClickTransactionMenu(){
        TRANSACTION_MENU.click();
    }

    public void GetsCorrectSubMenu(){
        Assert.assertTrue(PENDING_SUMMARY_SUB_MENU.isDisplayed());
        Assert.assertEquals("Pending Summary",PENDING_SUMMARY_SUB_MENU.getText());
        Assert.assertTrue(QUARANTINE_SUB_MENU.isDisplayed());
        Assert.assertEquals("Quarantine",QUARANTINE_SUB_MENU.getText());
        Assert.assertTrue(BULK_UPDATE_SUB_MENU.isDisplayed());
        Assert.assertEquals("Bulk Update",BULK_UPDATE_SUB_MENU.getText());
        Assert.assertTrue(REVERSAL_SUB_MENU.isDisplayed());
        Assert.assertEquals("Reversal",REVERSAL_SUB_MENU.getText());
    }
}
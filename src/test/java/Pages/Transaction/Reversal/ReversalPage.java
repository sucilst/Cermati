package Pages.Transaction.Reversal;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ReversalPage extends PageObject {
    @FindBy(id = "qe_reversal")
    WebElement REVERSAL_SUB_MENU;

    @FindBy(id = "qe_reversal_breadcrumb")
    WebElement REVERSAL_SUB_MENU_BREADCRUMB;

    public void ClickReversalSubMenu(){
        REVERSAL_SUB_MENU.click();
    }

    public void GetsHeaderTitleIsReversal(){
        Assert.assertTrue(REVERSAL_SUB_MENU_BREADCRUMB.isDisplayed());
        Assert.assertEquals("Reversal",REVERSAL_SUB_MENU_BREADCRUMB.getText());
    }
}
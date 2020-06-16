package Pages.PartnerPackage.PackageApproval;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HistoryPage extends PageObject {

    @FindBy(id = "qe_partner-package")
    WebElement PARTNER_PACKAGE_MENU;

    @FindBy(id = "partner_package-partner___BV_tab_button__")
    WebElement PARTNER_TAB;

    @FindBy(id = "qe_package___BV_tab_button__")
    WebElement PACKAGE_TAB;

    @FindBy(id = "partner_package-archived_partner___BV_tab_button__")
    WebElement ARCHIVED_PARTNER_TAB;

    @FindBy(id = "qe_package-approval")
    WebElement PACKAGE_APPROVAL_SUB_MENU;

    @FindBy(xpath = "//a[text()='History']")
    WebElement HISTORY_TAB;

    @FindBy(xpath = "//td[@aria-colindex='11']//button[text()='Detail']")
    WebElement DETAIL_BUTTON;

    @FindBy(xpath = "//header[@class='modal-header']//h5[text()='History Change Detail']")
    WebElement HEADER_HISTORY_CHANGE_DETAIL;

    public void clickPartnerPackageMenu(){
        PARTNER_PACKAGE_MENU.click();
        Assert.assertTrue(PARTNER_TAB.isDisplayed());
        Assert.assertTrue(PACKAGE_TAB.isDisplayed());
        Assert.assertTrue(ARCHIVED_PARTNER_TAB.isDisplayed());
    }

    public void clickPackageApprovalSubMenu(){
        PACKAGE_APPROVAL_SUB_MENU.click();
    }

    public void clickHistoryTab(){
        HISTORY_TAB.click();
    }

    public void ClickDetailButton(){
        DETAIL_BUTTON.click();
    }

    public void GetsHeaderNameOfPopUpIsHistoryChangeDetail(){
        Assert.assertEquals("History Change Detail",HEADER_HISTORY_CHANGE_DETAIL.getText());
    }
}

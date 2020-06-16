package Pages.PartnerPackage.PackageApproval;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ChangeRequestPage extends PageObject {
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

    @FindBy(xpath = "//td[@aria-colindex='6']//button[text()='Review']")
    WebElement REVIEW_BUTTON;

    @FindBy(xpath = "//td[@aria-colindex='10']")
    WebElement STATUS_COLUMN;

    @FindBy(xpath = "//td[@aria-colindex='11']")
    WebElement VALIDATION_COLUMN;

    public void clickPartnerPackageMenu(){
        PARTNER_PACKAGE_MENU.click();
        Assert.assertTrue(PARTNER_TAB.isDisplayed());
        Assert.assertTrue(PACKAGE_TAB.isDisplayed());
        Assert.assertTrue(ARCHIVED_PARTNER_TAB.isDisplayed());
    }

    public void clickPackageApprovalSubMenu(){
        PACKAGE_APPROVAL_SUB_MENU.click();
    }

    public void ClickReviewButton(){
        REVIEW_BUTTON.click();
    }

    public void GetContentsOfStatusHeaderAreEnabledOrDisabled(){
        Assert.assertTrue(STATUS_COLUMN.getText().contains("Enabled" ));
    }

    public void GetContentsOfValidationHeaderAreValidOrInvalid(){
        Assert.assertTrue(VALIDATION_COLUMN.getText().contains("Valid" ));
    }
}

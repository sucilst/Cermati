package Pages.PartnerPackage.PackageApproval;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SummaryPackageApprovalPage extends PageObject {
    @FindBy(id = "qe_package-approval")
    WebElement PackageApprovalMenu;

    @FindBy(css = ".tableFixHead > h5:nth-child(1)")
    WebElement ChangeReqSummaryTitle;

    public void click_Bulk_Update_Product_Package() {
        PackageApprovalMenu.click();
    }

    public void click_OK() {
        ChangeReqSummaryTitle.isDisplayed();
    }
}

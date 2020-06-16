package Steps.PartnerPackage.PackageApproval;

import Pages.PartnerPackage.PackageApproval.ChangeRequestPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ChangeRequestStep extends ScenarioSteps {
    ChangeRequestPage changeRequestPage;

    public void OnPackageApprovalSubMenu(){
        changeRequestPage.clickPartnerPackageMenu();
        changeRequestPage.clickPackageApprovalSubMenu();
    }

    public void ClickReviewButton(){
        changeRequestPage.ClickReviewButton();
    }

    public void GetContentsOfStatusHeaderAreEnabledOrDisabled(){
        changeRequestPage.GetContentsOfStatusHeaderAreEnabledOrDisabled();
    }

    public void GetContentsOfValidationHeaderAreValidOrInvalid(){
        changeRequestPage.GetContentsOfValidationHeaderAreValidOrInvalid();
    }
}

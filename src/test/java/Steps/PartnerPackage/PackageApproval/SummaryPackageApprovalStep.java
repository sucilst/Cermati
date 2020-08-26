package Steps.PartnerPackage.PackageApproval;

import Pages.PartnerPackage.PackageApproval.SummaryPackageApprovalPage;
import net.thucydides.core.steps.ScenarioSteps;

public class SummaryPackageApprovalStep extends ScenarioSteps {
    SummaryPackageApprovalPage summaryPackageApprovalPage;

    public void click_Bulk_Update_Product_Package() {
        summaryPackageApprovalPage.click_Bulk_Update_Product_Package();
    }

    public void click_OK() {
        summaryPackageApprovalPage.click_OK();
    }
}

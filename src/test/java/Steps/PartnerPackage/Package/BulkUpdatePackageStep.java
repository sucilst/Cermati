package Steps.PartnerPackage.Package;

import Pages.PartnerPackage.Package.BulkUpdatePackagePage;
import Utils.Helper;
import Utils.SourceFile;
import net.thucydides.core.steps.ScenarioSteps;

public class BulkUpdatePackageStep extends ScenarioSteps {
    BulkUpdatePackagePage bulkUpdatePackagePage;

    public void clickPartnerPackage(){
        bulkUpdatePackagePage.partnerPackagePage();
    }

    public void clickPackage(){
        bulkUpdatePackagePage.packagePage();
    }

    public void clickBulkUpdate(){
        bulkUpdatePackagePage.bulkPackage();
    }

    public void uploadFile(String action){
        switch (action){
            case "Success":
                bulkUpdatePackagePage.uploadFile(Helper.currentDateTime(), SourceFile.BULK_UPDATE_PACKAGE_SUCCESS);
                break;
        }
    }

    public void buttonAction(String action){
        bulkUpdatePackagePage.buttonClick(action);
    }

    public void buttonPermission(String action){
        bulkUpdatePackagePage.permission(action);
    }
}

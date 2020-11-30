package Steps.Biller.MasterRCMapping;

import Pages.Biller.MasterRCMapping.BillerListPage;

public class BillerListStep {
    BillerListPage billerListPage;

    public void clickBiller(){
        billerListPage.billerPage();
    }

    public void fieldForm(String action){
        billerListPage.dataForm(action);
    }

    public void checkData(String action){
        billerListPage.checkData(action);
    }
}

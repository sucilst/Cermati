package Steps.SmartBiller.ProductBillerConfig;

import Pages.SmartBiller.ProductBillerConfig.ProductBillerPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductBillerStep extends ScenarioSteps {
    ProductBillerPage productBillerPage;

    public void OnProductBillerConfigMenu()throws InterruptedException{
        Thread.sleep(6000);
        productBillerPage.OnSmartBillerMenu();
        productBillerPage.OnProductBillerConfigMenu();
    }

    public void ClickProductBillerTab(){
        productBillerPage.ClickProductBillerTab();
    }

    public void GetDisplayInAccordanceWithPOsRequested(){
        productBillerPage.GetDisplayInAccordanceWithPOsRequested();
    }

    public void SearchCorrectProductBillerByCategory(String category){
        productBillerPage.SearchCorrectProductBillerByCategory(category);
        productBillerPage.ClickSearchButton();
    }

    public void GetCorrectProductBillerBasedOnSearchFilter(String text){
        productBillerPage.GetCorrectProductBillerBasedOnSearchFilter(text);
    }

    public void SearchProductBillerByOtherFilter(String other_filter, String text){
        productBillerPage.SearchProductBillerByOtherFilter(other_filter,text);
    }
}
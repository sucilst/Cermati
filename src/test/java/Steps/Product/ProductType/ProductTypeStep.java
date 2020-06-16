package Steps.Product.ProductType;

import Pages.Product.ProductType.ProductTypePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductTypeStep extends ScenarioSteps {
    ProductTypePage productTypePage;

    public void OnProductMenu()throws InterruptedException{
        productTypePage.OnProductMenu();
    }

    public void OnProductTypeSubMenu()throws InterruptedException{
        productTypePage.OnProductTypeSubMenu();
    }

    public void GetCorrectHeader(String header){
        productTypePage.GetCorrectHeader(header);
    }
}
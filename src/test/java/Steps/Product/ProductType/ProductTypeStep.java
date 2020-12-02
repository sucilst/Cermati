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

    public void clickEdit()throws InterruptedException{
        productTypePage.clickEditButton();
    }

    public void changeName(String name)throws InterruptedException{
        productTypePage.changeName(name);
    }

    public void GetCorrectHeader(){
        productTypePage.GetCorrectHeader();
    }
}
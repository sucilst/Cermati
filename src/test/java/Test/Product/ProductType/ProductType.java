package Test.Product.ProductType;

import Steps.Product.ProductType.ProductTypeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductType {
    @Steps
    ProductTypeStep productTypeStep;

    @Given("on product menu")
    public void GivenOnProductMenu()throws InterruptedException{
        Thread.sleep(5000);
        productTypeStep.OnProductMenu();
    }

    @When("user click product type sub menu")
    public void whenUserClickProductTypeSubMenu()throws InterruptedException{
        productTypeStep.OnProductTypeSubMenu();
    }

    @Then("user get correct header, that is ([^\"]*)")
    public void thenUserGetCorrectHeader(String header)throws InterruptedException{
        Thread.sleep(4000);
        productTypeStep.GetCorrectHeader(header);
    }
}
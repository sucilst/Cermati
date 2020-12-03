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

    @When("Click Edit on data that want to update and change name to ([^\"]*)")
    public void whenUserClickEdit(String name)throws InterruptedException{
        productTypeStep.clickEdit();
        productTypeStep.changeName(name);
    }

    @Then("Data already updated")
    public void thenUserGetCorrectHeader()throws InterruptedException{
        Thread.sleep(4000);
        productTypeStep.GetCorrectHeader();
    }
}
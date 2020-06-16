package Test.SmartBiller.CategoryProductConfig;

import Steps.SmartBiller.CategoryProductConfig.CategoryProductConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoryProductConfig {
    @Steps
    CategoryProductConfigStep categoryProductConfigStep;

    @Given("on Edit a Category of Product Config pop up")
    public void givenOnEditACategoryProductConfigPopUp()throws InterruptedException{
        Thread.sleep(4000);
        categoryProductConfigStep.OnEditACategoryProductConfigPopUp();
    }

    @When("user click ok button on this pop up")
    public void whenUserClickOKButtonOnThisPopUp()throws InterruptedException{
        Thread.sleep(3000);
        categoryProductConfigStep.ClickOKButtonOnThisPopUp();
    }

    @Then("user gets success edit pop up and the category column not changed")
    public void thenGetsSuccessEditPopUpAndTheCategoryColumnNotChanged()throws InterruptedException{
        Thread.sleep(4000);
        categoryProductConfigStep.GetsSuccessEditPopUpAndTheCategoryColumnNotChanged();
    }

    @Then("user gets success edit pop up and the category column matches with the previously selected category")
    public void thenGetSuccessEditPopUpAndTheCategoryColumnMatchesWithThePreviouslySelectedCategory()throws InterruptedException{
        Thread.sleep(4000);
        categoryProductConfigStep.GetSuccessEditPopUpAndTheCategoryColumnMatchesWithThePreviouslySelectedCategory();
    }

    @When("user choose another category and click ok")
    public void whenUserChooseAnotherCategoryAndClickOK()throws InterruptedException{
        Thread.sleep(3000);
        categoryProductConfigStep.ChooseAnotherCategoryAndClickOK();
    }

    @When("user choose category with invalid value of category id and click ok button on this pop up")
    public void whenUserChooseCategoryWithInvalidValueOfCategoryIdAndClickOKButtonOnThisPopUp()throws InterruptedException{
        categoryProductConfigStep.ChooseCategoryWithInvalidValueOfCategoryIdAndClickOKButtonOnThisPopUp();
    }

    @Then("user gets warning pop up with give information that category_id: invalid value")
    public void thenUserGetsWarningPopUpWithGiveInformationThatCategoryIDInvalidValue()throws InterruptedException{
        Thread.sleep(4000);
        categoryProductConfigStep.GetsWarningPopUpWithGiveInformationThatCategoryIDInvalidValue();
    }
}
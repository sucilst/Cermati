package Steps.SmartBiller.CategoryProductConfig;

import Pages.SmartBiller.CategoryProductConfig.CategoryProductConfigPage;
import Pages.SmartBiller.ChangeLog.ChangeLogPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CategoryProductConfigStep extends ScenarioSteps {
    CategoryProductConfigPage categoryProductConfigPage;

    public void OnEditACategoryProductConfigPopUp()throws InterruptedException{
        Thread.sleep(10000);
        categoryProductConfigPage.OnSmartBillerMenu();
        Thread.sleep(3000);
        categoryProductConfigPage.OnCategoryProductConfigSubMenu();
        categoryProductConfigPage.OnEditACategoryProductConfigPopUp();
    }

    public void ClickOKButtonOnThisPopUp(){
        categoryProductConfigPage.ClickOKButtonOnThisPopUp();
    }

    public void GetsSuccessEditPopUpAndTheCategoryColumnNotChanged()throws InterruptedException{
        categoryProductConfigPage.GetSuccessEditPopUp();
        Thread.sleep(3000);
        categoryProductConfigPage.GetsSuccessEditPopUpAndTheCategoryColumnNotChanged();
    }
    public void GetSuccessEditPopUpAndTheCategoryColumnMatchesWithThePreviouslySelectedCategory()throws InterruptedException{
        categoryProductConfigPage.GetSuccessEditPopUp();
        Thread.sleep(3000);
        categoryProductConfigPage.TheCategoryColumnMatchesWithThePreviouslySelectedCategory();
    }

    public void ChooseAnotherCategoryAndClickOK()throws InterruptedException{
        categoryProductConfigPage.ChooseAnotherCategory();
        Thread.sleep(2000);
        categoryProductConfigPage.ClickOKButtonOnThisPopUp();
    }

    public void ChooseCategoryWithInvalidValueOfCategoryIdAndClickOKButtonOnThisPopUp()throws InterruptedException{
        categoryProductConfigPage.ChooseCategoryWithInvalidValueOfCategoryId();
        Thread.sleep(2000);
        categoryProductConfigPage.ClickOKButtonOnThisPopUp();
    }

    public void GetsWarningPopUpWithGiveInformationThatCategoryIDInvalidValue(){
        categoryProductConfigPage.GetsWarningPopUpWithGiveInformationThatCategoryIDInvalidValue();
    }
}
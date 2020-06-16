package Steps.CacaBot;

import Pages.CacaBot.GroupConfigApiPage;
import net.thucydides.core.steps.ScenarioSteps;

public class GroupConfigApiStep extends ScenarioSteps {
    GroupConfigApiPage groupConfigApiPage;

    public void OnCacaBotMenu()throws InterruptedException{
        groupConfigApiPage.OnCacaBotMenu();
    }

    public void ClickGroupConfigAPISubMenu(){
        groupConfigApiPage.ClickGroupConfigAPISubMenu();
    }

    public void GetDisplayGroupConfigApiInAccordanceWithWireframe(){
        groupConfigApiPage.GetDisplayGroupConfigApiInAccordanceWithWireframe();
    }

    public void SearhCorrectGroupUsingOneFilterOnly(String filter, String text){
        groupConfigApiPage.SearhCorrectGroupUsingOneFilterOnly(filter,text);
        groupConfigApiPage.ClickFilterButton();
    }

    public void GetCorrectGroupInfoOnTable(String text){
        groupConfigApiPage.GetCorrectGroupInfoOnTable(text);
    }

    public void SearchIncorrectThisFilter(){
        groupConfigApiPage.SearchIncorrectThisFilter();
    }

    public void SearhCorrectGroupUsingAllFilter()throws InterruptedException{
        groupConfigApiPage.SearchGroupUsingAllFilter();
        groupConfigApiPage.ClickFilterButton();
    }

    public void GetCorrectGroupInfo(){
        groupConfigApiPage.GetCorrectGroupInfo();
    }

    public void SearchGroupUsingAllFilterThenClickClearFilterButton()throws InterruptedException{
        groupConfigApiPage.SearchGroupUsingAllFilter();
        groupConfigApiPage.ClickClearFilterButton();
    }

    public void GetCleanFieldOfAllFilter(){
        groupConfigApiPage.GetCleanFieldOfAllFilter();
    }

    public void ClickRoleDetailButton(){
        groupConfigApiPage.ClickRoleDetailButton();
    }

    public void ClickGroupDetailButton(){
        groupConfigApiPage.ClickGroupDetailButton();
    }

    public void GetCorrectRoleDetailPopUp(){
        groupConfigApiPage.GetCorrectRoleDetailPopUp();
    }

    public void GetCorrectGroupDetailPopUp(){
        groupConfigApiPage.GetCorrectGroupDetailPopUp();
    }

    public void ClickEditButton(){
        groupConfigApiPage.ClickEditButton();
    }

    public void GetCorrectEditGroupConfigApiPopUp(){
        groupConfigApiPage.GetCorrectEditGroupConfigApiPopUp();
    }

    public void ChooseRoleOpsFirstThenChooseRolePartner(){
        groupConfigApiPage.ChooseRoleOpsFirstThenChooseRolePartner();
    }

    public void RoleIdDropdownAppear(){
        groupConfigApiPage.RoleIdDropdownAppear();
    }

    public void ClickDeleteButtonOnGroupConfigApiSubMenu(){
        groupConfigApiPage.ClickDeleteButtonOnGroupConfigApiSubMenu();
    }

    public void GetCorrectDisplayOfConfirmationPopUp(){
        groupConfigApiPage.GetCorrectDisplayOfConfirmationPopUp();
    }
}
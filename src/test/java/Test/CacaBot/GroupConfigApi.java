package Test.CacaBot;

import Steps.CacaBot.GroupConfigApiStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GroupConfigApi {
    @Steps
    GroupConfigApiStep groupConfigApiStep;

    @Given("on CacaBot Menu")
    public void givenOnCacaBotMenu()throws InterruptedException{
        Thread.sleep(5000);
        groupConfigApiStep.OnCacaBotMenu();
    }

    @When("user click \"Group Config API\" sub menu")
    public void whenClickGroupConfigAPISubMenu(){
        groupConfigApiStep.ClickGroupConfigAPISubMenu();
    }

    @Then("user get display of \"Group Config API\" in accordance with wireframe")
    public void thenGetDisplayGroupConfigApiInAccordanceWithWireframe()throws InterruptedException{
        Thread.sleep(3000);
        groupConfigApiStep.GetDisplayGroupConfigApiInAccordanceWithWireframe();
    }

    @Given("on Group Config API Sub Menu")
    public void givenOnGroupConfigApi()throws InterruptedException{
        Thread.sleep(10000);
        groupConfigApiStep.OnCacaBotMenu();
        groupConfigApiStep.ClickGroupConfigAPISubMenu();
        Thread.sleep(3000);
        groupConfigApiStep.GetDisplayGroupConfigApiInAccordanceWithWireframe();
    }

    @When("user search correct group using ([^\"]*) filter, the text is ([^\"]*)")
    public void whenSearhCorrectGroupUsingOneFilterOnly(String filter, String text){
        groupConfigApiStep.SearhCorrectGroupUsingOneFilterOnly(filter,text);
    }

    @Then("user get correct group info that ([^\"]*) on table")
    public void thenGetCorrectGroupInfoOnTable(String text)throws InterruptedException{
        Thread.sleep(3000);
        groupConfigApiStep.GetCorrectGroupInfoOnTable(text);
    }

    @When("user search correct group using all filter")
    public void whenSearhCorrectGroupUsingAllFilter()throws InterruptedException{
        groupConfigApiStep.SearhCorrectGroupUsingAllFilter();
    }

    @Then("user get correct group info on table")
    public void thenGetCorrectGroupInfo()throws InterruptedException{
        Thread.sleep(3000);
        groupConfigApiStep.GetCorrectGroupInfo();
    }

    @When("user search incorrect role filter")
    public void whenSearchIncorrectThisFilter(){
        groupConfigApiStep.SearchIncorrectThisFilter();
    }

    @Then("user get \"Sorry, no matching options.\" message on the dropdown list this filter")
    public void thenGetSorryNoMatchingOptionsMessageOnTheDropdownListThisFilter(){}

    @When("user search group using all filter; click clear filter button")
    public void whenSearchGroupUsingAllFilterThenClickClearFilterButton()throws InterruptedException{
        groupConfigApiStep.SearchGroupUsingAllFilterThenClickClearFilterButton();
    }

    @Then("user get clean field of all filter")
    public void thenGetCleanFieldOfAllFilter()throws InterruptedException{
        Thread.sleep(3000);
        groupConfigApiStep.GetCleanFieldOfAllFilter();
    }

    @When("user click role detail button")
    public void whenClickRoleDetailButton(){
        groupConfigApiStep.ClickRoleDetailButton();
    }

    @When("user click group detail button")
    public void whenClickGroupDetailButton(){
        groupConfigApiStep.ClickGroupDetailButton();
    }

    @Then("user get correct role detail pop up")
    public void thenGetCorrectRoleDetailPopUp()throws InterruptedException{
        Thread.sleep(5000);
        groupConfigApiStep.GetCorrectRoleDetailPopUp();
    }

    @Then("user get correct group detail pop up")
    public void thenGetCorrectGroupDetailPopUp()throws InterruptedException{
        Thread.sleep(5000);
        groupConfigApiStep.GetCorrectGroupDetailPopUp();
    }

    @When("user click edit button")
    public void whenClickEditButton(){
        groupConfigApiStep.ClickEditButton();
    }

    @Then("user get correct edit group config api pop up")
    public void thenGetCorrectEditGroupConfigApiPopUp()throws InterruptedException{
        Thread.sleep(8000);
        groupConfigApiStep.GetCorrectEditGroupConfigApiPopUp();
    }

    @Given("on Edit Group Config API")
    public void givenOnEditGroupConfigApi()throws InterruptedException{
        Thread.sleep(5000);
        groupConfigApiStep.OnCacaBotMenu();
        groupConfigApiStep.ClickGroupConfigAPISubMenu();
        Thread.sleep(3000);
        groupConfigApiStep.GetDisplayGroupConfigApiInAccordanceWithWireframe();
        groupConfigApiStep.ClickEditButton();
        Thread.sleep(3000);
        groupConfigApiStep.GetCorrectEditGroupConfigApiPopUp();
    }

    @When("user choose role ops first then choose role partner")
    public void whenChooseRoleOpsFirstThenChooseRolePartner(){
        groupConfigApiStep.ChooseRoleOpsFirstThenChooseRolePartner();
    }

    @Then("user see role id dropdown appear")
    public void thenSeeRoleIdDropdownAppear()throws InterruptedException{
        Thread.sleep(2000);
        groupConfigApiStep.RoleIdDropdownAppear();
    }

    @When("user edit group change role id or status or role id and status")
    public void whenEditGroup(){}

    @Then("user get success edit group")
    public void thenSuccessEditGroup(){}

    @When("user click delete button on group config api sub menu")
    public void whenClickDeleteButtonOnGroupConfigApiSubMenu(){
        groupConfigApiStep.ClickDeleteButtonOnGroupConfigApiSubMenu();
    }

    @Then("user get correct display of confirmation pop up of group config api sub menu")
    public void thenGetCorrectDisplayOfConfirmationPopUpOfGroupConfigApiSubMenu()throws InterruptedException{
        Thread.sleep(3000);
        groupConfigApiStep.GetCorrectDisplayOfConfirmationPopUp();
    }

    @When("user delete group on the list")
    public void whenDeleteGroupOnTheList(){}

    @Then("user see this group that was deleted is gone from the list")
    public void thenSeeThisGroupGone(){}
}
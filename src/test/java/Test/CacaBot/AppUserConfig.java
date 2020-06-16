package Test.CacaBot;

import Steps.CacaBot.AppUserConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AppUserConfig {
    @Steps
    AppUserConfigStep appUserConfigStep;

    @Given("on cacabot menu")
    public void givenOnCacabotMenu(){}

    @When("user click \"app user config\" sub menu")
    public void whenClickAppUserConfigSubMenu(){}

    @Then("user get display in accordance with wireframe")
    public void thenGetDisplayInAccordanceWithWireframe(){

    }

    @Given("on App User Config Sub Menu")
    public void givenOnAppUserConfigSubMenu(){}

    @When("user search correct user using ([^\"]*) filter only, that is ([^\"]*)")
    public void whenSearchCorrectUserUsingFilter(String filter, String text){}

    @Then("user get correct user info: ([^\"]*) on table")
    public void thenGetCorrectUserInfoBasedOnFilterOnTable(String text){}

    @When("user search correct user using all filter")
    public void whenSearchUserUsingAllFilter(){}

    @Then("user get correct user info on table")
    public void thenGetCorrectUserInfoBasedOnAllFilter(){}

    @Then("user get \"Sorry, no matching options.\" message on the dropdown list role filter")
    public void thenGetSorryNoMatchingOptionsMessageOnDropdownRoleFilterInAppUserInfSubMenu(){}

    @When("user search using all filter; click clear filter button")
    public void whenSearchUserByAllFilterAndClearFilter(){}

    @Then("user get clean field of all this filter")
    public void thenGetCleanFieldOfAllThisFilter(){}

    @When("user add new user with role ops")
    public void whenAddNewUserWithRoleOps(){}

    @Then("new user with role ops appear on table")
    public void thenNewUserWithRoleOpsAppearOnTable(){}

    @When("user add new user using same username ([^\"]*)")
    public void whenAddNewUserUsingSameUsername(String text){}

    @Then("user get warning pop up that ([^\"]*) already exist")
    public void thenGetWarningPopUpThatUsernameAlreadyExist(String text){}

    @Given("on Add App User Config")
    public void givenOnAddAppUserConfig(){}

    @When("user input random alphabet on role dropdown")
    public void whenInputRandomAlphabetOnRoleDropdown(){}

    @Then("user get \"Sorry, no matching options.\" on role dropdown list")
    public void thenGetWarningMessageOnRoleDropdownList(){}

    @Given("on Edit App User Config")
    public void givenOnEditAppUserConfig(){}

    @When("user choose role type ops first then choose role type partner")
    public void whenChooseRoleTypeOpsFirstThenChooseRoleTypePartner(){}

    @Then("user see role type id dropdown appear")
    public void thenSeeRoleTypeIdDropdownAppear(){}

    @When("user click detail user button")
    public void whenClickDetailUserButton(){}

    @Then("user get correct detail user pop up")
    public void thenGetCorrectDetailUserPopUp(){}

    @Given("on Detail pop up")
    public void givenOnDetailUserPopUp(){}

    @When("user click edit button on detail pop up")
    public void whenClickEditButtonOnDetailPopUp(){}

    @Then("user get correct edit app user config display")
    public void thenGetCorrectEditAppUserConfigDisplay(){}

    @When("user click edit user button")
    public void whenClickEditUserButton(){}

    @When("user click add user button")
    public void whenClickAddUserButton(){}

    @Then("user get correct add app user config display")
    public void thenGetCorrectAddAppUserConfigDisplay(){}

    @When("user edit username using same username with the other user on the list ([^\"]*)")
    public void whenEditUsernameUsingSameUsernameWithTheOtherUserOnTheList(String text){}

    @When("user click delete user button")
    public void whenClickDeleteUserButton(){}

    @Then("user get correct display of confirmation delete pop up")
    public void thenGetCorrectConfirmationDeletePopUpDisplay(){}

    @When("user delete last user on the list")
    public void whenDeleteLastUserOnTheList(){}

    @Then("user see this user that was deleted is gone")
    public void thenSeeThisUserGoneFromTheTable(){}

}
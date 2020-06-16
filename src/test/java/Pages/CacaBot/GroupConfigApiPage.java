package Pages.CacaBot;

import Utils.random;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GroupConfigApiPage extends PageObject {
    random rand = new random();
    @FindBy(xpath = "//a[@href='/cacabot']")
    WebElement CACABOT_MENU;

    @FindBy(xpath = "//a[@href='/cacabot/group-api']")
    WebElement GROUP_CONFIG_API_SUB_MENU;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/ol/li[3]/span")
    WebElement GROUP_CONFIG_API_BREADCRUMB;

    @FindBy(id = "qe_group-config-api_name_filter")
    WebElement NAME_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_role_filter\"]/div/input")
    WebElement ROLE_FILTER;

    @FindBy(id = "qe_group-config-api_status_filter")
    WebElement STATUS_FILTER;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_status_filter\"]/option[1]")
    WebElement ACTIVE_STATUS_OPTION;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_status_filter\"]/option[2]")
    WebElement INACTIVE_STATUS_OPTION;

    @FindBy(id = "qe_group-config-api_filter")
    WebElement FILTER_BUTTON;

    @FindBy(id = "qe_group-config-api_clear-filter")
    WebElement CLEAR_FILTER_BUTTON;

    @FindBy(id = "qe_group-config-api_table")
    WebElement TABLE_GROUP_CONFIG_API;

    @FindBy(className = "qe_group-config-api_no_table_header")
    WebElement HEADER_NO;

    @FindBy(className = "qe_group-config-api_name_table_header")
    WebElement HEADER_NAME;

    @FindBy(className = "qe_group-config-api_role_table_header")
    WebElement HEADER_ROLE;

    @FindBy(className = "qe_group-config-api_role-id_table_header")
    WebElement HEADER_ROLE_ID;

    @FindBy(className = "qe_group-config-api_group-id_table_header")
    WebElement HEADER_GROUP_ID;

    @FindBy(className = "qe_group-config-api_status_table_header")
    WebElement HEADER_STATUS;

    @FindBy(className = "qe_group-config-api_action_table_header")
    WebElement HEADER_ACTION;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_group-config-api_role-id-detail-')])[last()]")
    WebElement ROLE_DETAIL_BUTTON;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_group-config-api_group-id-detail-')])[last()]")
    WebElement GROUP_DETAIL_BUTTON;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_group-config-api_edit-')])[last()]")
    WebElement EDIT_BUTTON;

    @FindBy(xpath = "(//button[starts-with(@id,'qe_group-config-api_delete-')])[last()]")
    WebElement DELETE_BUTTON;

    @FindBy(xpath = "//h5[@class='modal-title']")
    WebElement POP_UP_TITLE;

    @FindBy(id = "qe_group-config-api_pop-up_id")
    WebElement POP_UP_ID_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_title")
    WebElement POP_UP_TITLE_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_type")
    WebElement POP_UP_TYPE_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_all_members_are_administrators")
    WebElement POP_UP_ALL_MEMBERS_ARE_ADMINISTRATOR_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_created_at")
    WebElement POP_UP_CREATED_AT_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_username")
    WebElement POP_UP_USERNAME_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_password")
    WebElement POP_UP_PASSWORD_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_name")
    WebElement POP_UP_NAME_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_callback_url")
    WebElement POP_UP_CALLBACK_URL_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_package_id")
    WebElement POP_UP_PACKAGE_ID_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_email")
    WebElement POP_UP_EMAIL_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_payment_type")
    WebElement POP_UP_PAYMENT_TYPE_ROW;

    @FindBy(id = "qe_group-config-api_pop-up_is_active")
    WebElement POP_UP_IS_ACTIVE_ROW;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up___BV_modal_footer_\"]/button[1]")
    WebElement EDIT_POP_UP_OK;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up___BV_modal_footer_\"]/button[2]")
    WebElement EDIT_POP_UP_CANCEL;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement POP_UP_OK;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement POP_UP_CANCEL;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[2]")
    WebElement CONFIRMATION_DELETE_POP_UP_CANCEL;

    @FindBy(id = "qe_group-config-api_pop-up_group-name_field")
    WebElement POP_UP_GROUP_NAME_FIELD;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up_role_dropdown\"]/div/input")
    WebElement POP_UP_ROLE_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up_role-id_dropdown\"]/div/input")
    WebElement POP_UP_ROLE_ID_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up_group-id_field\"]")
    WebElement POP_UP_GROUP_ID_FIELD;

    @FindBy(id = "qe_group-config-api_pop-up_status_dropdown")
    WebElement POP_UP_STATUS_DROPDOWN;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up_status_dropdown\"]/option[1]")
    WebElement ACTIVE_STATUS_ON_POP_UP;

    @FindBy(xpath = "//*[@id=\"qe_group-config-api_pop-up_status_dropdown\"]/option[2]")
    WebElement INACTIVE_STATUS_ON_POP_UP;

    @FindBy(xpath = "//button[text()='Delete']")
    WebElement POP_UP_DELETE;

    public void OnCacaBotMenu()throws InterruptedException{
        CACABOT_MENU.click();
        Thread.sleep(3000);
        Assert.assertTrue(GROUP_CONFIG_API_SUB_MENU.isDisplayed());
    }

    public void ClickGroupConfigAPISubMenu(){
        GROUP_CONFIG_API_SUB_MENU.click();
    }

    public void GetDisplayGroupConfigApiInAccordanceWithWireframe(){
        Assert.assertTrue(GROUP_CONFIG_API_BREADCRUMB.isDisplayed());
        Assert.assertEquals("Group Configuration API",GROUP_CONFIG_API_BREADCRUMB.getText());
        Assert.assertTrue(NAME_FILTER.isDisplayed());
        Assert.assertTrue(ROLE_FILTER.isDisplayed());
        Assert.assertTrue(STATUS_FILTER.isDisplayed());
        Assert.assertTrue(FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(CLEAR_FILTER_BUTTON.isDisplayed());
        Assert.assertTrue(TABLE_GROUP_CONFIG_API.isDisplayed());
        Assert.assertTrue(HEADER_NO.isDisplayed());
        Assert.assertTrue(HEADER_NAME.isDisplayed());
        Assert.assertTrue(HEADER_ROLE.isDisplayed());
        Assert.assertTrue(HEADER_ROLE_ID.isDisplayed());
        Assert.assertTrue(HEADER_GROUP_ID.isDisplayed());
        Assert.assertTrue(HEADER_STATUS.isDisplayed());
        Assert.assertTrue(HEADER_ACTION.isDisplayed());
        Assert.assertTrue(ROLE_DETAIL_BUTTON.isDisplayed());
        Assert.assertTrue(GROUP_DETAIL_BUTTON.isDisplayed());
        Assert.assertTrue(EDIT_BUTTON.isDisplayed());
        Assert.assertTrue(DELETE_BUTTON.isDisplayed());
    }

    public void SearhCorrectGroupUsingOneFilterOnly(String filter,String text){
        if (filter.equalsIgnoreCase("name")){
            NAME_FILTER.sendKeys(text+ Keys.ENTER);
        }

        else if (filter.equalsIgnoreCase("role")){
            ROLE_FILTER.click();
            ROLE_FILTER.sendKeys(text+Keys.ENTER);
        }

        else if (filter.equalsIgnoreCase("status")){
            STATUS_FILTER.click();
            ACTIVE_STATUS_OPTION.click();
        }
    }

    public void ClickFilterButton(){
        FILTER_BUTTON.click();
    }

    public void GetCorrectGroupInfoOnTable(String text){
        Assert.assertTrue(TABLE_GROUP_CONFIG_API.getText().contains(text));
    }

    public void SearchIncorrectThisFilter(){
        ROLE_FILTER.click();
        ROLE_FILTER.sendKeys(rand.getSaltString());
    }

    public void SearchGroupUsingAllFilter()throws InterruptedException{
        NAME_FILTER.sendKeys("ui");
        ROLE_FILTER.click();
        Thread.sleep(2000);
        ROLE_FILTER.sendKeys("ops"+Keys.ENTER);
        STATUS_FILTER.click();
        ACTIVE_STATUS_OPTION.click();
    }

    public void GetCorrectGroupInfo(){
        Assert.assertTrue(TABLE_GROUP_CONFIG_API.getText().contains("Group UI Test"));
        Assert.assertTrue(TABLE_GROUP_CONFIG_API.getText().contains("ops"));
        Assert.assertTrue(TABLE_GROUP_CONFIG_API.getText().contains("active"));
    }

    public void ClickClearFilterButton(){
        CLEAR_FILTER_BUTTON.click();
    }

    public void GetCleanFieldOfAllFilter(){
        Assert.assertEquals("",NAME_FILTER.getAttribute("value"));
        Assert.assertEquals("",ROLE_FILTER.getAttribute("value"));
        Assert.assertEquals("",STATUS_FILTER.getAttribute("value"));
    }

    public void ClickRoleDetailButton(){
        ROLE_DETAIL_BUTTON.click();
    }

    public void ClickGroupDetailButton(){
        GROUP_DETAIL_BUTTON.click();
    }

    public void GetCorrectRoleDetailPopUp(){
        Assert.assertTrue(POP_UP_ID_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_CREATED_AT_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_CALLBACK_URL_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_EMAIL_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_USERNAME_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_PASSWORD_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_NAME_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_PACKAGE_ID_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_PAYMENT_TYPE_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_IS_ACTIVE_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_OK.isDisplayed());
        Assert.assertTrue(POP_UP_CANCEL.isDisplayed());
    }

    public void GetCorrectGroupDetailPopUp(){
        Assert.assertTrue(POP_UP_ID_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_TITLE_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_TYPE_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_ALL_MEMBERS_ARE_ADMINISTRATOR_ROW.isDisplayed());
        Assert.assertTrue(POP_UP_OK.isDisplayed());
        Assert.assertTrue(POP_UP_CANCEL.isDisplayed());
    }

    public void ClickEditButton(){
        EDIT_BUTTON.click();
    }

    public void GetCorrectEditGroupConfigApiPopUp(){
        Assert.assertTrue(POP_UP_GROUP_NAME_FIELD.isDisplayed());
        Assert.assertTrue(POP_UP_GROUP_ID_FIELD.isDisplayed());
        Assert.assertTrue(POP_UP_ROLE_DROPDOWN.isDisplayed());
        Assert.assertTrue(POP_UP_STATUS_DROPDOWN.isDisplayed());
        Assert.assertTrue(EDIT_POP_UP_OK.isDisplayed());
        Assert.assertTrue(EDIT_POP_UP_CANCEL.isDisplayed());
    }

    public void ChooseRoleOpsFirstThenChooseRolePartner(){
        POP_UP_ROLE_DROPDOWN.click();
        POP_UP_ROLE_DROPDOWN.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"ops",Keys.ENTER);
        POP_UP_ROLE_DROPDOWN.click();
        POP_UP_ROLE_DROPDOWN.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"partner",Keys.ENTER);
    }

    public void RoleIdDropdownAppear(){
        Assert.assertTrue(POP_UP_ROLE_ID_DROPDOWN.isDisplayed());
    }

    public void ClickDeleteButtonOnGroupConfigApiSubMenu(){
        DELETE_BUTTON.click();
    }

    public void GetCorrectDisplayOfConfirmationPopUp(){
        Assert.assertTrue(POP_UP_DELETE.isDisplayed());
        Assert.assertTrue(CONFIRMATION_DELETE_POP_UP_CANCEL.isDisplayed());
    }
}
package Pages.Login;

import Utils.database;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement USERNAME_FIELD;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement PASSWORD_FIELD;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement LOGIN_BUTTON;

    @FindBy(xpath= "//a[text()='Sentinel']")
    WebElement APP_HEADER;

    @FindBy(xpath = "//a[@href='/user']")
    WebElement USER_MANAGEMENT_MENU;

    @FindBy(xpath = "//input[starts-with(@id,'__BVID__')]")
    WebElement SEARCH_BOX_USER_MANAGEMENT_MENU;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement SEARCH_BUTTON;

    @FindBy(xpath = "//tr[@aria-rowindex='1']//td[@aria-colindex='4']")
    WebElement ROLE_ADMIN;

    public void InputUsernameAndPassword(String username){
        USERNAME_FIELD.click();
        USERNAME_FIELD.sendKeys(username);
        PASSWORD_FIELD.sendKeys(database.password);
        LOGIN_BUTTON.click();
    }

    public void CanSeeSentinelDashboard(){
        Assert.assertTrue(APP_HEADER.isDisplayed());
    }

    public void LoggedInAs(String username){
        USER_MANAGEMENT_MENU.click();
        SEARCH_BOX_USER_MANAGEMENT_MENU.sendKeys(username);
        SEARCH_BUTTON.click();
        Assert.assertEquals("admin",ROLE_ADMIN.getText());
    }
}
package Steps.Login;

import Pages.Login.LoginPage;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginStep extends ScenarioSteps {
    LoginPage loginPage;

    public void UserOpenSentinelLoginPage(){
        loginPage.open();
    }

    public void InputUsernameAndPassword(String username){
        loginPage.InputUsernameAndPassword(username);
    }

    public void CanSeeSentinelDashboardAndLoggedInAs(String username)throws InterruptedException{
        Thread.sleep(6000);
        loginPage.CanSeeSentinelDashboard();
        Thread.sleep(6000);
        loginPage.LoggedInAs(username);
    }
}

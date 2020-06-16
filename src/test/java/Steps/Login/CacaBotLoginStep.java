package Steps.Login;

import Pages.Login.CacaBotLoginPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CacaBotLoginStep extends ScenarioSteps {
    CacaBotLoginPage cacaBotLoginPage;

    public void OpenSentinelDevLoginPage(){
        cacaBotLoginPage.OpenSentinelDevLoginPage();
    }

    public void InputUsernameAndPassword(String username){
        cacaBotLoginPage.InputUsernameAndPassword(username);
    }

    public void CanSeeSentinelDevDashboardAndLoggedInAs(String username)throws InterruptedException{
        Thread.sleep(6000);
        cacaBotLoginPage.CanSeeSentinelDashboard();
        Thread.sleep(6000);
        cacaBotLoginPage.LoggedInAs(username);
    }
}

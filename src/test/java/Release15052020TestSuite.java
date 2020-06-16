import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/cucumber/report.json","pretty"},
        features = {
            "src/test/resources/features/PartnerPackage/IndomaretConfig/RcMapping.feature",
            "src/test/resources/features/Biller/MasterRCMapping/RCBillerRCAlterra.feature",
            "src/test/resources/features/Transaction/PendingSummary/RC10.feature:30",
            "src/test/resources/features/Transaction/PendingSummary/RC11.feature:30"
        }
)
public class Release15052020TestSuite {}
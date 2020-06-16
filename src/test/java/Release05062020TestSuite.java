import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/cucumber/report.json","pretty"},
        features = {
                "src/test/resources/features/SmartBiller/TOPConfig/TOPPartnerLog.feature",
                "src/test/resources/features/SmartBiller/ProductPartnerConfig/HistoryProductPartnerConfig.feature:59",
                "src/test/resources/features/SmartBiller/TOPConfig/TOPBillerLog.feature",
                "src/test/resources/features/SmartBiller/ProductBillerConfig/ProductBiller.feature",
                "src/test/resources/features/PartnerPackage/IndomaretConfig/ImproveHeader.feature",
                "src/test/resources/features/CacaBot/GroupConfigApi.feature",
                "src/test/resources/features/CacaBot/AppUserConfig.feature"
        }
)
public class Release05062020TestSuite {}
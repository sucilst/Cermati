import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/cucumber/report.json","pretty"},
        features = {
//                "src/test/resources/features/Biller/PricingConfig/PricingConfig.feature"
        }
//        tags = {"@TestCaseKey=BPA-T2242"}
)
public class CucumberTestSuite {}
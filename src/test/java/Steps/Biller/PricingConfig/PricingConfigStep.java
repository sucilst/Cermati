package Steps.Biller.PricingConfig;

import Pages.Biller.PricingConfig.PricingConfigPage;
import net.thucydides.core.steps.ScenarioSteps;

public class PricingConfigStep extends ScenarioSteps {
    PricingConfigPage pricingConfigPage;

    public void click_Biller()  {
        pricingConfigPage.clickBiller();
    }

    public void click_Price_Mapping() {
        pricingConfigPage.click_PriceMapping();
    }

    public void see_list_of_biller_pricing() {
        pricingConfigPage.seelist_of_biller_pricing();
    }
}

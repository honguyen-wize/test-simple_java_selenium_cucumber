package stepdefs;

import Pages.TrueHomePage;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import stepdefs.base.BaseStepDefs;
import ui_viewmodel.DaraBaseShelfUi;
import utils.WSCommon;
import ws_model.DaraBaseShelfWs;


public class TrueHomePageStepDefs extends BaseStepDefs {

    private DaraBaseShelfUi daraBaseShelfUiFromWS;
    private DaraBaseShelfUi daraBaseShelfUiFromUI;

    @Given("^I open the true home page")
    public void launchLoginPage() throws Exception{
        super.driver.get(super.resourceBundle.getString("homePageTrueURL"));
        super.trueHomePage = new TrueHomePage(super.getDriver());
    }
    @Given("^I get the DaraBaseShelf WS$")
    public void getDaraBaseShelfWs() throws Exception{
        DaraBaseShelfWs daraBaseShelfWs = WSCommon.getDaraShelfAPI();
        daraBaseShelfUiFromWS = new DaraBaseShelfUi(daraBaseShelfWs);
    }

    @Given("^I get the DaraBaseShelf from UI home page dara shelf$")
    public void getDaraBaseShelfUI() throws Exception{
        super.trueHomePage.scrollToDara();
        daraBaseShelfUiFromUI = super.trueHomePage.getDaraFromUI();
    }

    @Given("^I see the DaraBaseShelf WS is equal to DaraBaseShelf UI$")
    public void verifyDaraBaseShelfWS_UI() throws Exception{
        Assert.assertTrue(daraBaseShelfUiFromUI.equals(daraBaseShelfUiFromWS), "Dara data in UI should be the same as API");
    }

}

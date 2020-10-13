package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import stepdefs.base.BaseStepDefs;


public class ApiPageStepDefs extends BaseStepDefs {

    @When("^I generate api name '(.+)'$")
    public void generateAPI(String apiName){
        super.apiKeyPage.generateAPI(apiName);
    }

    @Then("^I see the message '(.+)' on the api key page$")
    public void checkLoginMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage, super.apiKeyPage.getNoticeMessage());
    }

}

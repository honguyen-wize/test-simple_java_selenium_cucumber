package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import stepdefs.base.BaseStepDefs;

import java.util.List;


public class HomePageStepDefs extends BaseStepDefs {

    @Then("^I see the message '(.+)' on home page$")
    public void checkLoginMessage(String expectedMessage){
        Assert.assertEquals(expectedMessage, super.homePage.getLoginNotice());
    }

    @Then("^I go to API keys page$")
    public void goToAPIKeyPage(){
        super.apiKeyPage = super.homePage.goToAPIKeyPage();
    }

    @Then("^I see the home page menu$")
    public void checkHomePageMenu(DataTable expectedMenu){
        List<String> expectedMenuItems = expectedMenu.asList(String.class);
        List<String> actualMenuItems = super.homePage.getListOfMenu();

        Assert.assertEquals(expectedMenuItems,actualMenuItems);
    }

}

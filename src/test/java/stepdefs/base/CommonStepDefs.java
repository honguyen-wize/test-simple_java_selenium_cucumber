package stepdefs.base;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class CommonStepDefs extends BaseStepDefs {

    @After
    @Given("^I can close the browser$")
    public void cleanUp() {
        super.getDriver().quit();
    }

    @Given("^I launch the page$")
    public void launchLoginPage() throws Exception{
        super.setDriver();
    }
}

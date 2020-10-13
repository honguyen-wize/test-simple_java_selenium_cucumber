package stepdefs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import Pages.LoginPage;
import stepdefs.base.BaseStepDefs;

public class LoginStepDefs extends BaseStepDefs {

    @Given("^I open the login page$")
    public void launchLoginPage() throws Exception{
        super.driver.get(super.resourceBundle.getString("baseURL"));

        super.loginPage = new LoginPage(super.getDriver());
    }

    @When("^I enter user name '(.+)' and password '(.+)'$")
    public void verifyLoginSuccessfullyCucumber(String username, String pass){
        super.homePage = super.loginPage.loginWithUsernamePassword(username,pass);
    }
}

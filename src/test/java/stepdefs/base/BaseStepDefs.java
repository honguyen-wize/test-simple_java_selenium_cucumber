package stepdefs.base;

import Pages.ApiKeyPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.TrueHomePage;
import org.openqa.selenium.WebDriver;

import java.util.ResourceBundle;

public class BaseStepDefs {

    protected static WebDriver driver;

    protected static LoginPage loginPage;
    protected static HomePage homePage;
    protected static ApiKeyPage apiKeyPage;

    protected static TrueHomePage trueHomePage;

    protected ResourceBundle resourceBundle = ResourceBundle.getBundle("env_"+System.getProperty("env"));

    public void setDriver(){
        this.driver = Utils.setDriver(System.getProperty("browserName"));
    }

    public WebDriver getDriver(){
        return this.driver;
    }

}

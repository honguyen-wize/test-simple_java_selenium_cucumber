package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (id = "user_email")
    private WebElement inputUsername;

    @FindBy(id = "user_password")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[contains(@class,'btn-default')]")
    private WebElement btnLogin;

    public LoginPage (WebDriver passdriver){
        super(passdriver);
    }

    public HomePage loginWithUsernamePassword(String username, String pass){
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(pass);
        this.btnLogin.click();

        return new HomePage(super.driver);
    }
}

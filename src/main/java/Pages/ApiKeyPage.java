package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApiKeyPage extends BasePage{
    @FindBy(xpath = "//div[@class='panel-body']")
    private WebElement divNoticeMessage;

    @FindBy(name = "api_key_form[name]")
    private WebElement txtAPIName;

    @FindBy(name = "commit")
    private WebElement btnGenerateAPI;


    public ApiKeyPage (WebDriver passdriver){
        super(passdriver);
    }

    public void generateAPI(String apiName) {
        txtAPIName.sendKeys(apiName);
        btnGenerateAPI.click();
    }

    public String getNoticeMessage(){
        return divNoticeMessage.getText();
    }

}

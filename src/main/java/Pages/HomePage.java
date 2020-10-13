package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='panel-body']")
    private WebElement divNotice;

    @FindBy(xpath = "//ul[@id='myTab']/li/a[contains(@href,'api')]")
    private WebElement linkApiMemu;

    @FindBy(id = "myTab")
    private WebElement ulMenu;

    public HomePage (WebDriver passdriver){
        super(passdriver);
    }

    public String getLoginNotice(){
        return divNotice.getText();
    }

    public ApiKeyPage goToAPIKeyPage(){
        linkApiMemu.click();
        return new ApiKeyPage(super.driver);
    }

    public List<String>  getListOfMenu(){
        List<String> actualListOfMenu = new ArrayList<String>();
        List<WebElement> liMenu = ulMenu.findElements(By.xpath("./li/a"));
        for (WebElement el:liMenu){
            actualListOfMenu.add(el.getText());
        }
        return actualListOfMenu;
    }

}

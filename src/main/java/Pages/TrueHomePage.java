package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui_viewmodel.DaraBaseShelfUi;
import ui_viewmodel.DaraDataUi;
import ui_viewmodel.DaraShelfItemUi;
import utils.Common;

import java.util.ArrayList;
import java.util.List;

public class TrueHomePage extends BasePage {

    private final String xPathDaraSection = "//a[@href='http://dara.trueid.net/']/ancestor::section";

    @FindBy(xpath = xPathDaraSection)
    private WebElement daraSection;

    public TrueHomePage(WebDriver passdriver){
        super(passdriver);
    }

    public void scrollToDara(){
        Common.scrollToElement(super.driver, By.xpath(xPathDaraSection));
    }

    public DaraBaseShelfUi getDaraFromUI(){
        DaraBaseShelfUi daraBaseShelfUis = new DaraBaseShelfUi();
        DaraDataUi daraDataUi = new DaraDataUi();
        List<DaraShelfItemUi> actual_DaraShelfItemUiList = new ArrayList<DaraShelfItemUi>();
        List<WebElement> webElementsArticleTitle = daraSection.findElements(By.xpath(".//article[contains(@class,'item')]//a"));

        for (WebElement el : webElementsArticleTitle){
            DaraShelfItemUi actual_shelfItemUi = new DaraShelfItemUi();
            WebElement elTitle = el.findElement(By.xpath(".//h3"));

            String articleURL = el.getAttribute("href");
            String articleID = getArticleID(articleURL);
            actual_shelfItemUi.setId(articleID);
            actual_shelfItemUi.setTitle(elTitle.getText());

            actual_DaraShelfItemUiList.add(actual_shelfItemUi);
        }

        daraDataUi.setShelf_items(actual_DaraShelfItemUiList);
        daraBaseShelfUis.setData(daraDataUi);

        return daraBaseShelfUis;
    }

    private String getArticleID(String articleURL){
        String[] bits = articleURL.split("/");
        String articleID = bits[bits.length-1];
        return articleID;
    }

}

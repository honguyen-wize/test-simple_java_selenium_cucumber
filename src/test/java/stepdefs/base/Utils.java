package stepdefs.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
    public static WebDriver setDriver(String browserName) {
        WebDriver driver;
        if(browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
            driver = new ChromeDriver();

        } else {
            System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver");
            driver = new FirefoxDriver();
        }

        return driver;
    }

}

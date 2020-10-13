package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions(
        tags = {"@test"},
//        tags = {"@true"},
        plugin = {"pretty" , "html:target/cucumerReport"},
        features = "./src/test/java/features",
        glue={"stepdefs"}
)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @Parameters({"env", "browserName"})
    @BeforeClass(alwaysRun = true)
    public void setUpClass(String env, String browserName) throws Exception {
        System.setProperty("env", env);
        System.setProperty("browserName", browserName);
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

}
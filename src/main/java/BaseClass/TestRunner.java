package BaseClass;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(

        glue = "TestStep",
        features = "src/test/java/BDD/",

        plugin = {
                "pretty",
                "json:target/cucumber.json",
        },

        tags = {"@LoginSuccess"}
)

public class TestRunner extends BaseSetUp {

        @BeforeSuite
        public void setUpp() throws Exception {
                setUp();
        }

        @AfterMethod()
        public void teardownn()  {
                driver.closeApp();
                driver.launchApp();
        }

        @AfterSuite
        public static void teardown()  {
                driver.closeApp();
                driver.quit();
        }

}
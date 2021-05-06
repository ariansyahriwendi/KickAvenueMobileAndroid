package BaseClass;

import io.cucumber.testng.CucumberOptions;
<<<<<<< HEAD
=======
import org.testng.annotations.AfterMethod;
>>>>>>> dc37aee (Initial commit)
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(

        glue = "TestStep",
        features = "src/test/java/BDD/",

        plugin = {
                "pretty",
                "json:target/cucumber.json",
        },
<<<<<<< HEAD
        tags = {"@MarketFilterLifestyle"}
=======
        tags = {"@MarketSearchStreetwear"}
>>>>>>> dc37aee (Initial commit)
)

public class TestRunner extends BaseSetUp {

        @BeforeSuite
        public void setUpp() throws Exception {
                setUp();
        }

<<<<<<< HEAD
        @AfterSuite
        public static void teardown()  {
                driver.closeApp();
=======
        @AfterMethod()
        public void teardownn()  {
                driver.closeApp();
                driver.launchApp();
        }

        @AfterSuite
        public static void teardown()  {
                driver.closeApp();
                driver.quit();
>>>>>>> dc37aee (Initial commit)
        }

}
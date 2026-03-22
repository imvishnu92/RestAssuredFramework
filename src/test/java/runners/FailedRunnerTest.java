package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failed-scenarios.txt",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/rerun.json"
        }
)
public class FailedRunnerTest extends AbstractTestNGCucumberTests {

}

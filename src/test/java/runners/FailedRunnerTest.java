package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failed-scenarios.txt",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/rerun-report"
        }
)
public class FailedRunnerTest extends AbstractTestNGCucumberTests {

}

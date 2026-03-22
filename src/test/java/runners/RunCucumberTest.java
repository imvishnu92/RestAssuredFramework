package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty",
                "json:target/cucumber.json",
                "rerun:target/failed-scenarios.txt"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}

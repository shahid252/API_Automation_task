package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Activites.feature",
        "src/test/resources/IntegrationTest.feature"},
        glue = {"stepdefinitions"}
)

public class TestRunner extends AbstractTestNGCucumberTests {


}

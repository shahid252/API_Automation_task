package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/resources/Activites.feature",
        "src/test/java/resources/IntegrationTest.feature"},
        glue = {"stepdefinitions"}
)

public class TestRunner extends AbstractTestNGCucumberTests {


}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features/Activites.feature",
        "src/main/resources/features/IntegrationTest.feature"},
        glue = {"stepdefinitions"}
)

public class TestRunner extends AbstractTestNGCucumberTests {


}

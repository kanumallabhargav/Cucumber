package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/LoginWithArguments.feature",
		glue = "stepDefinitions")
public class TestRunners_arguments 
{

}

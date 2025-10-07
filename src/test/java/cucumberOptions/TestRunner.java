package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/test/java/features",
		glue="stepDefinitions"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}

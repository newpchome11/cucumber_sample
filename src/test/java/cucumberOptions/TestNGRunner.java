package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/TMtrial.feature",	
		glue = "stepDefinitions",
		monochrome = true,dryRun=false,
		tags = "@SanityTest or @RegressionTest or @SmokeTest",
		plugin = {"pretty", "html:target/cucumber_report.html","json:target/cucumber_report.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/AppFeatures" },
		glue = { "StepDefinition" },
		plugin = {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml"}
//		monochrome = true
//		tags = "@All"
		)

public class AmazonTestRunner {

}

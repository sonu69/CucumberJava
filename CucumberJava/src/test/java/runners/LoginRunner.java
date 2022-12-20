package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo.feature",glue= {"StepDefinitions"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports/reports.html",
		"json:target/HtmlReports/report.json","junit:target/HtmlReports/report.xml"})

public class LoginRunner {

	
	
}

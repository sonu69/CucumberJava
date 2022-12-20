package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/HooksDemo.feature",glue= {"StepDefinitions"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports/reports.html",
		"json:target/HtmlReports/report.json","junit:target/HtmlReports/report.xml"})
public class DashBValidRunner {

}

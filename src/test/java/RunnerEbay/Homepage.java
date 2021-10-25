package RunnerEbay;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\New folder\\NewProject\\src\\test\\resources\\Features\\Homepage.feature" }, glue = {
		"stepdefination" }, plugin = { "pretty",
				"html:target/cucumber-reports.html" }, dryRun = false, monochrome = true, tags = "@smoke or @sanity")
public class Homepage {

}
